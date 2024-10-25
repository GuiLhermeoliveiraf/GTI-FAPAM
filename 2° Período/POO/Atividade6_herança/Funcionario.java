public class Funcionario {
    private String nome;
    private float salario;

    // Criando o metado Contrutor passando os parametros, nome e salario
    public Funcionario(String nome, float salario) {
        setNome(nome);
        setSalario(salario);
    }

    // Metados Getters e Setters 
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    // Metados que exibe os dados de Funcionario
    public String exibirDados() {
        String retorno = "";

        retorno = "Nome :" + getNome() + " Salario: " + getSalario();

        return retorno;

    }

}
