// Criando a classe Professor que herda de Pessoa
public class Professor extends Pessoa {
    private float salario;

    // Metado contrutor
    public Professor(String nome, int idade, String genero, float salario) {
        super(nome, idade, genero);
        this.salario = salario;
    }

    // Metado Getters e Setters
    public float getSalario() {
        return salario;
    }

    private void setSalario(float salario) {
        this.salario = salario;
    }

    // Metados abstratos da classe Pessoa
    public String falar() {
        return "Vai reprovar";
    }

    public String estudar() {
        return "Ja estou formado";
    }

    // Metado final de reprovar aluno
    public final String reprovarAluno(Aluno aluno) {
        return "Aluno: " + aluno.getNome() + " Esta reprovado !!!";
    }

    // Metado Aumentar salario
    public void aumentarSalario(float salario) {
        setSalario(getSalario() + salario);
    }

}
