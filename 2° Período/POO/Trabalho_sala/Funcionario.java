// Criando a classe Funcionario que herda de Pessoa 
public class Funcionario extends Pessoa {
    private String cargo;
    private float salario;

    // Metados contrutor
    public Funcionario(String nome, int idade, String genero, String cargo, float salario) {
        super(nome, idade, genero);
        this.cargo = cargo;
        this.salario = salario;
    }

    // Metados abstratos da classe Pessoa
    public String falar() {
        return "Não quero falar nada";
    }

    public String estudar() {
        return "Não estudei";
    }

    // Metado Getters e Setters
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    private void setSalario(float salario) {
        this.salario = salario;
    }

    // Metado Aumentar salario
    public void aumentarSalario(float salario) {
        setSalario(getSalario() + salario);
    }

}
