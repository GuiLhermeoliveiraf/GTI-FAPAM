public class Funcionario extends Pessoa{
    private String cargo;
    private float salario;

    public Professor(String nome, int idade, String genero, String cargo, float salario){
        super(nome, idade, genero);
        this.cargo = cargo;
        this.salario = salario;
    }

    public String falar(){
        return "Não quero falar nada";
    }

    public String estudar(){
        return "Não estudei";
    }













}