package Pessoa;
import java.util.Scanner;

public class main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Pessoa[] listaDePessoas = new Pessoa[3];

        for(int i = 0; i < 3; i++){
            System.out.println("\n --- Cadastro da " + (i+1) + " Pessoa ---");
            
            System.out.println("Insira seu nome: ");
            String nome = sc.nextLine();
                
            System.out.println("Insira sua idade: ");
            int idade = sc.nextInt();
            
            System.out.println("Insira seu sexo: ");
            char sexo = sc.next().charAt(0);
            sc.nextLine();

            System.out.println("Insira seu telefone: ");
            String telefone = sc.nextLine();

            listaDePessoas[i] = new Pessoa(nome, idade, sexo, telefone);
        }

            System.out.println("\n\nLista de Pessoas: ");
    
            for(Pessoa p : listaDePessoas){
                System.out.println(p);
            }

    }




}