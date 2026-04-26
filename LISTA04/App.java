import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        ArrayList<ConteudoTV> lista = new ArrayList<>();

        ConteudoTV c = new ConteudoTV("Novela X", "Drama");
        c.definirDiretor(new Pessoa("Diretor A", "Brasileiro"));
        c.adicionarArtista(new Pessoa("Ator 1", "Brasileiro"));
        c.adicionarArtista(new Pessoa("Ator 2", "Brasileiro"));
        lista.add(c);

        c = new ConteudoTV("Filme Y", "Ação");
        c.definirDiretor(new Pessoa("Diretor B", "Americano"));
        c.adicionarArtista(new Pessoa("Ator 3", "Americano"));
        c.adicionarArtista(new Pessoa("Ator 4", "Americano"));
        lista.add(c);

        SerieTV s = new SerieTV("Série Z", "Suspense", 3, 24);
        s.definirDiretor(new Pessoa("Diretor C", "Inglês"));
        s.adicionarArtista(new Pessoa("Ator 5", "Inglês"));
        lista.add(s);

        for (ConteudoTV item : lista) {
            System.out.println(item);
        }
    }
}