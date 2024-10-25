public class Programador extends Funcionario {
    public String linguagem;

    // Contrutor Sobrescrevendo, o metado da Classe Funcionario e adicionando o atributo linguagem da classe Programador
    public Programador(String nome, float salario, String linguagem) {
        super(nome, salario);
        setLinguagem(linguagem);
    }

    // Metados Getters e Setters
    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public String getLinguagem() {
        return linguagem;
    }

    // Metado exibir dados sobrescrito da classe Funcionario, adicionando a linguagem
    public String exibirDados() {
        String retorno = "";

        retorno = super.exibirDados() + " Linguagem " + getLinguagem();

        return retorno;

    }

}
