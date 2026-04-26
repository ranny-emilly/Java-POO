import java.util.ArrayList;

/**
 * 1. INTERFACE: Define um contrato de comportamento.
 */
interface Promocao {
    double calcularDesconto(double valor);
}

/**
 * 2. CLASSE ABSTRATA: Serve de molde. 
 * O uso de 'protected' para as filhas acessarem.
 */
abstract class Socio {
    protected String nome;
    protected double mensalidadeBase;

    public Socio(String nome, double mensalidadeBase) {
        this.nome = nome;
        this.mensalidadeBase = mensalidadeBase;
    }

    // Método abstrato: as filhas SÃO OBRIGADAS a implementar.
    public abstract double calcularMensalidade();
}

/**
 * 3. HERANÇA: Uso do extends e super.
 */
class SocioTitular extends Socio {
    private ArrayList<String> dependentes;

    public SocioTitular(String nome, double mensalidadeBase) {
        // Chamada obrigatória ao construtor do pai
        super(nome, mensalidadeBase);
        this.dependentes = new ArrayList<>();
    }

    public void adicionarDependente(String nomeDep) {
        this.dependentes.add(nomeDep);
    }

    @Override
    public double calcularMensalidade() {
        // Lógica de acúmulo: Mensalidade base + taxa por dependente
        return this.mensalidadeBase + (this.dependentes.size() * 50.0);
    }
}

/**
 * 4. SINGLETON: Padrão.
 */
class ConfiguracaoClube {
    private static ConfiguracaoClube instancia;
    private String nomeClube;

    // Construtor PRIVADO impede o 'new' fora desta classe
    private ConfiguracaoClube() {
        this.nomeClube = "Clube Recreativo POO";
    }

    public static ConfiguracaoClube getInstance() {
        if (instancia == null) {
            instancia = new ConfiguracaoClube();
        }
        return instancia;
    }

    public String getNomeClube() { return nomeClube; }
}

/**
 * 5. CLASSE PRINCIPAL: Onde a lógica de polimorfismo acontece.
 */
public class ExemploProvaPOO {
    private ArrayList<Socio> listaSocios = new ArrayList<>();

    public void cadastrarSocio(Socio s) {
        if (s != null) {
            listaSocios.add(s);
        }
    }

    // MÉTODO TÍPICO DE PROVA: Percorrer lista e somar valores
    public double calcularArrecadacaoTotal() {
        double total = 0;
        for (Socio s : listaSocios) {
            // POLIMORFISMO: O Java decide se chama o método do Titular ou outro
            total += s.calcularMensalidade();
        }
        return total;
    }

    public static void main(String[] args) {
        ExemploProvaPOO app = new ExemploProvaPOO();
        
        // Exemplo de uso
        SocioTitular t1 = new SocioTitular("Joao", 200.0);
        t1.adicionarDependente("Maria");
        t1.adicionarDependente("Pedro");
        
        app.cadastrarSocio(t1);
        
        System.out.println("Clube: " + ConfiguracaoClube.getInstance().getNomeClube());
        System.out.println("Total Arrecadado: R$ " + app.calcularArrecadacaoTotal());
    }
}