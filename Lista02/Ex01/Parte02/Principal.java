public class Principal {

    public static void main(String[] args) {

        Curso c1 = new Curso("ES", "Engenharia de Software");
        Curso c2 = new Curso("CC", "Ciência da Computação");

        Aluno aluno = new Aluno("Maria");

        aluno.matricular(12345, c1, 2026);
        System.out.println(aluno);

        aluno.setCurso(c2);
        aluno.setAno(2027);
        System.out.println(aluno);
    }
}