package Ex01.Parte01;
public class Principal {

    public static void main(String[] args) {

        Aluno aluno = new Aluno("Maria");

        aluno.matricular(12345, "Engenharia de Software", 2026);
        System.out.println(aluno);

        aluno.setCurso("Ciência da Computação");
        aluno.setAno(2027);
        System.out.println(aluno);
    }
}