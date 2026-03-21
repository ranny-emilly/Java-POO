public class Contatos {
    String nome;
    String sobrenome;
    String telefone;
    String email;

public Contatos(String nome, String sobrenome, String telefone, String email){
this.nome = nome;
this.sobrenome = sobrenome;
this.telefone = telefone;
this.email = email;
}
@Override
    public String toString() {
    return "\n--- Dados da Pessoa ---" +
           "\nNome: " + nome +
           "\nSobrenome: " + sobrenome +
           "\nTelefone: " + telefone +
           "\nEmail: " + email;
}



}
