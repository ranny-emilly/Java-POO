public class Cliente {
    private String nome;
    private int idade;
    private String telefone;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String toString() {
        return "Cliente: " + nome +
               " - Idade: " + idade +
               " - Telefone: " + telefone;
    }
}