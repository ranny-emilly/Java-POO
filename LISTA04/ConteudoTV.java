import java.util.ArrayList;

public class ConteudoTV {

    private static int contador = 1;

    int id;
    String titulo;
    ArrayList<Pessoa> elenco = new ArrayList<>();
    Pessoa diretor;
    String tipo;

    ConteudoTV(String titulo, String tipo) {
        this.id = contador++;
        this.titulo = titulo;
        this.tipo = tipo;
    }

    void definirDiretor(Pessoa diretor) {
        this.diretor = diretor;
    }

    void adicionarArtista(Pessoa pessoa) {
        elenco.add(pessoa);
    }

    public String toString() {
        String texto = id + " - " + titulo + " (" + tipo + ")\n";
        texto += "Diretor: " + diretor + "\n";
        texto += "Elenco:\n";
        for (Pessoa p : elenco) {
            texto += p + "\n";
        }
        return texto;
    }
}