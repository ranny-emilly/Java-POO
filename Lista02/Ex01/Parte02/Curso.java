public class Curso {
    private String sigla;
    private String nome;

    public Curso(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

    public String toString() {
        return sigla + " - " + nome;
    }
}