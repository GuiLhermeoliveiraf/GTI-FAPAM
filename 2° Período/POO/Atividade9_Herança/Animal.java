
public class Animal {



    // Atributos

    private String nome;

    private int idade;

    private String tipoAlimentacao;



    // Construtor

    public Animal(String nome, int idade, String tipoAlimentacao) {

        setNome(nome);

        setIdade(idade);

        setTipoAlimentacao(tipoAlimentacao);

    }



    // Métodos Set

    public void setNome(String nome) {

        this.nome = nome;

    }



    public void setIdade(int idade) {

        if (idade >= 0)

            this.idade = idade;

    }



    public void setTipoAlimentacao(String tipoAlimentacao) {

        if (tipoAlimentacao.length() > 5)

            this.tipoAlimentacao = tipoAlimentacao;

    }



    // Métodos Get

    public String getNome() {

        return this.nome;

    }



    public int getIdade() {

        return this.idade;

    }



    public String getTipoAlimentacao() {

        return this.tipoAlimentacao;

    }



    // Método para exibir informações do animal

    public String exibirInfo() {

        return " > Nome: " + getNome() + "\n > Idade: " + getIdade();

    }



    // Método que descreve o habitat geral do animal

    public String exibirHabitat() {

        return "O habitat é o lar de um animal, um palco complexo onde a vida se desenrola. " +

                "Ele é composto por fatores abióticos, como temperatura e água, e fatores bióticos," +

                "como plantas e outros animais, que se interligam para criar um sistema de suporte de vida.";

    }

}
