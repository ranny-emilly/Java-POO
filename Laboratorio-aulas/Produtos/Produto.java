public class Produto {
    int codigo;
    String nome;
    int quantidade;
    String tipo;
    double valor;

    
    public Produto(int codigo) {
        this.codigo = codigo;
    }

    public Produto(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    
    public Produto(int codigo, String nome, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
    }

  
    public Produto(int codigo, String nome, int quantidade, String tipo, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valor = valor;
    }

  

    public void vender(int qtd) {
        if (qtd <= this.quantidade) {
            this.quantidade -= qtd;
            double total = qtd * this.valor;
            System.out.println("Venda realizada! Total: R$ " + total);
        } else {
            System.out.println("Erro: Estoque insuficiente!");
        }
    }

  
    public void comprar(int qtd, double novoValor) {
        this.quantidade += qtd;
        this.valor = novoValor;
        System.out.println("Estoque atualizado com novo valor.");
    }

   
    public void comprar(int qtd) {
        this.quantidade += qtd;
        System.out.println("Estoque atualizado.");
    }

    public void inserir(String nome, int quantidade, String tipo, double valor) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valor = valor;
    }

    public boolean igual(Produto outro) {
       
        return this.nome.equals(outro.nome) && this.tipo.equals(outro.tipo);
    }

    @Override
    public String toString() {
        return "Cod: " + codigo + " | Nome: " + nome + " | Qtd: " + quantidade + 
               " | Tipo: " + tipo + " | Valor: R$ " + valor;
    }
}