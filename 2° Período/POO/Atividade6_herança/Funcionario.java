public class Funcionario{
    private String nome;
    private float salario;

    public Funcionario(String nome, float salario){
        setNome(nome);
        setSalario(salario);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setSalario(float salario){
        this.salario = salario;
    }

    public float getSalario(){
        return salario;
    }

    public String exibirDados(){
        String retorno = "";

        retorno = "Nome :" + getNome() + " Salario: " + getSalario();
        
        return retorno;
    
    }

                                                        







}
