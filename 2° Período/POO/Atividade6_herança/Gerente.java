public class Gerente extends Funcionario{
    private float bonus;

    public Gerente(String nome, float salario , float bonus){
        super(nome,salario);
        setBonus(bonus);
    }

    public void setBonus(float bonus){
        this.bonus = bonus;
    }
    
    public float getBonus(){
        return bonus;
    }
    

    public String exibirDados(){
        String retorno = "";

        retorno = "Nome :" + getNome() + " Salario: " + getSalario() + " Bonus: " + getBonus();
        
        return retorno;
    
    }




}   
