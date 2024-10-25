public class Programador extends Funcionario{
    public String linguagem;

    public Programador(String nome, float salario, String linguagem){
        super(nome, salario);
        setLinguagem(linguagem);
    }

    public void setLinguagem(String linguagem){
        this.linguagem = linguagem;
    }
    
    public String getLinguagem(){
        return linguagem;
    }
    
    

    public String exibirDados(){
        String retorno = "";

        retorno = super.exibirDados() + " Linguagem " + getLinguagem();
        
        return retorno;
    
    }















}
