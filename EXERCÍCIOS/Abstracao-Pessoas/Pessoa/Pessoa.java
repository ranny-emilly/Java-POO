package Pessoa;
import java.util.Scanner;

public class Pessoa{

    String nome;
    int idade;
    char sexo;
    String telefone;


    public Pessoa(String nome, int idade, char sexo, String telefone){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.telefone = telefone;

    }
    @Override
    public String toString() {
    return "\n--- Dados da Pessoa ---" +
           "\nNome: " + nome +
           "\nIdade: " + idade +
           "\nSexo: " + sexo +
           "\nTelefone: " + telefone;
}

}