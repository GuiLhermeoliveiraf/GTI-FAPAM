public class Materia extends Escola{
    private Professor professor;
    private Alunos[] alunos;
    private int contador;
    private String nome;

    public Materia (Professor professor, String nome){
        this.nome = nome;
        this.professor = professor;
        alunos = new Alunos[10];
        contador = 0;
    }

    






}