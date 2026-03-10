import java.util.Scanner;

//exercício ainda em desenvolvimento.

class Exercicio1{
    public static void main(String[] args){
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira o primeiro valor");
        int valorone = leitor.nextInt();
        
        System.out.println("Insira o segundo valor:");
        int valortwo = leitor.nextInt();
        
        System.out.println("Insira o terceiro valor");
        int valortree = leitor.nextInt();
        
        leitor.close();
        
        System.out.println("O maior e menor valor, sao, respectivamente:");
        
        
        if(valorone > valortwo && valortwo > valortree){
            System.out.println( + valorone + " e "+ valortree);
        }else if(valorone  < valortwo && valorone > valortree){
            System.out.println( + valortwo + " e "+ valortree);
        }
        
        
    }
}