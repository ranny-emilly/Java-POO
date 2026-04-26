public class Aluno {
    private String nome;
    private int matricula;
    private int ano;
    private Curso curso;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void matricular(int matricula, Curso curso, int ano) {
        this.matricula = matricula;
        this.curso = curso;
        this.ano = ano;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String toString() {
        return "Aluno: " + nome +
               " - Matricula: " + matricula +
               " - Curso: " + curso +
               " - Ano: " + ano;
    }
}