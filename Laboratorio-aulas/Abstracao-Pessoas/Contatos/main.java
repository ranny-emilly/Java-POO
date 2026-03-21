import java.util.Scanner;


public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Contatos[] listaDeContatos = new Contatos[3];

        for(int i = 0; i < 3; i++){
            System.out.println("\n --- Cadastro do " + (i+1) + " Contato---");
            
            System.out.println("Insira seu nome: ");
            String nome = sc.nextLine();
                
            System.out.println("Insira seu sobrenome: ");
            String sobrenome = sc.nextLine();
            
            System.out.println("Insira seu telefone: ");
            String telefone = sc.nextLine();
    
            System.out.println("Insira seu email: ");
            String email = sc.nextLine();

            listaDeContatos[i] = new Contatos(nome, sobrenome, telefone, email);
        }

            System.out.println("\n\nLista de Pessoas: ");
    
            for(Contatos c : listaDeContatos){
                System.out.println(c);
            }

    }


    
}
