// Classe Gerente que é subclasse da Classe Funcionario
public class Gerente extends Funcionario {
    private float bonus;

    // Contrutor Sobrescrevendo, o metado da Classe Funcionario e adicionando o atributo bonus da classe gerente
    public Gerente(String nome, float salario, float bonus) {
        super(nome, salario);
        setBonus(bonus);
    }

    // Metados Getters e Setters 
    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public float getBonus() {
        return bonus;
    }

    // Metado exibir dados sobrescrito da classe Funcionario, adicionando o bonus
    public String exibirDados() {
        String retorno = "";

        retorno = super.exibirDados() + " Bonus: " + getBonus();

        return retorno;

    }

}
