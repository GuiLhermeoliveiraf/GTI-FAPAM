// Criando classe Alunos que herda da classe Pessoa
public class Aluno extends Pessoa {
    private final String ra;
    private Escola escola;

    // Metado Contrutor
    public Aluno(String nome, int idade, String genero, String ra, Escola escola) {
        super(nome, idade, genero);
        this.ra = ra;
        this.escola = escola;
    }

    // Metados Sobreescritos da classe Pessoa
    public String falar() {
        return "Me passa de ano por 50 no pix?";
    }

    public String estudar() {
        return "Ja estou estudando muito";
    }

    // Metados com sobrecarga
    public String estudar(Materia materia) {
        return "Estou estudando a materia: " + materia.getNome();
    }

    public String estudar(Professor professor) {
        return "Estou estudando com o professor: " + professor.getNome();
    }

    // Metados Getters
    public String getRa() {
        return ra;
    }

    public Escola getEscola() {
        return escola;
    }

}
