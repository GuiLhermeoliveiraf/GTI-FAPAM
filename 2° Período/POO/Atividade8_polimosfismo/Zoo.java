public class Zoo {



    // Atributos

    private String nomeZoo;

    private Animal[] animais;

    private int cont;



    // Construtor

    public Zoo(String nome){

        this.nomeZoo = nome;

        this.animais = new Animal[10];

        this.cont = 0;

    }

    

    // Método Get

    public String getNomeZoo() {

        return this.nomeZoo;

    }



    // Método que adiciona animais ao zoo

    public void adicionarAnimal(Animal animal){

        if (cont <= 10){

            this.animais[cont] = animal;

            this.cont++;

        }

    }



    // Método que exibe os dados de todos os animais no zoo

    public String exibirTodosAnimais(){

        String retorno = "";



        for (int i = 0; i < cont; i++){

            retorno += animais[i].exibirInfo();

            retorno += "\n\n";

        }



        return retorno;

    }



    // Método que exibe os habitats de todos os animais no zoo

    public String exibirHabitats(){

        String retorno = "";



        for (int i = 0; i < cont; i++){

            retorno += animais[i].exibirHabitat();

            retorno += "\n\n";

        }



        return retorno;

    }



    // Método que retorna o nome dos mamíferos com gestação menor que 3 meses

    public String exibirMamiferosGestacaoCurta(){

        String retorno = "";



        for (int i = 0; i < cont; i++){

            if (animais[i] instanceof Mamifero) {

                Mamifero mamifero = (Mamifero) animais[i];



                if (mamifero.getTempoGestacao() < 3){

                    retorno += animais[i].getNome();

                    retorno += "\n";

                }

            }

        }



        return retorno;

    }

}
