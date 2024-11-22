// Criando classe Materia que herda de Escola
public class Materia extends Escola {
    private Professor professor;
    private Pessoa[] alunos;
    private int contador;
    private String nome;

    // Metados contrutor
    public Materia(Professor professor, String nome) {
        this.nome = nome;
        this.professor = professor;
        alunos = new Pessoa[10];
        contador = 0;
    }

    // Metado Getter
    public String getNome() {
        return nome;
    }

    // Metados que adiciona aluno ao array se ele for uma instancia de Aluno o Bolsista
    public void adicionarAluno(Pessoa aluno) {
        if (contador < alunos.length) {
            if (aluno instanceof Aluno || aluno instanceof Bolsista) {
                alunos[contador] = aluno;
                contador++;
                System.out.println("Deu bom");
            }
        }
    }

    // Metado que retorna o nome do professor que leciona a Materia
    public String nomeProfessor() {
        return "O professor que leciona essa materia é o professor " + professor.getNome();
    }

}
