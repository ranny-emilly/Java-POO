import java.util.Scanner;
import java.util.Locale;

public class main {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Quantos produtos serão cadastrados? ");
        int tamanho = sc.nextInt();
        sc.nextLine(); 

        
        Produto[] estoque = new Produto[tamanho];

        
        for (int i = 0; i < tamanho; i++) {
            System.out.println("\nCadastro do Produto" + (i + 1) + " ---");
            System.out.print("Código: ");
            int cod = sc.nextInt();
            sc.nextLine();

        
            estoque[i] = new Produto(cod);

            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Quantidade: ");
            int qtd = sc.nextInt();
            sc.nextLine();
            System.out.print("Tipo: ");
            String tipo = sc.nextLine();
            System.out.print("Valor: ");
            double valor = sc.nextDouble();
            sc.nextLine();

        
            estoque[i].inserir(nome, qtd, tipo, valor);
        }

        
        if (tamanho >= 2) {
            System.out.println("\nComparando o Produto 1 com o Produto 2...");
            if (estoque[0].igual(estoque[1])) {
                System.out.println("Mesmo nome e tipo)!");
            } else {
                System.out.println("Diferentes.");
            }
        }

        System.out.println("\n==============");
        for (Produto p : estoque) {
            System.out.println(p);
        }
        
        sc.close();
    }
}