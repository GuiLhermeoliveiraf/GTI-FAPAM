
public class Mamifero extends Animal {



    // Atributo

    private int tempoGestacao;



    // Construtor

    public Mamifero(String nome, int idade, String tipoAlimentacao, int tempoGestacao){

        super(nome, idade, tipoAlimentacao);

        setTempoGestacao(tempoGestacao);

    }



    // Métodos Get e Set

    public void setTempoGestacao(int tempoGestacao) {

        if (tempoGestacao > 0 && tempoGestacao <= 23)

            this.tempoGestacao = tempoGestacao;

    }



    public int getTempoGestacao() {

        return this.tempoGestacao;

    }



    // Método exibirInfo sobrescrito

    public String exibirInfo(){

        return super.exibirInfo() + "\n > Gestação: " + getTempoGestacao() + " meses";

    }



    // Método exibirHabitat sobrescrito

    public String exibirHabitat(){

        return "O habitat típico de um mamífero é um lugar que fornece abrigo, " +

                "alimento e água suficientes para sua sobrevivência. Eles podem ser encontrados " +

                "em uma variedade de ambientes, desde florestas densas até desertos áridos, mas " +

                "todos compartilham a necessidade de recursos básicos para prosperar. A presença " +

                "de vegetação, fontes de água potável e a disponibilidade de presas ou plantas" +

                "comestíveis são fatores cruciais que influenciam a localização e o tipo de habitat " +

                "que um mamífero escolhe.";

    }

}
