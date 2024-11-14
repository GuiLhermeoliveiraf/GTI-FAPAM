public class Ave extends Animal {



    // Atributo 

    private boolean migratoria;

    

    // Construtor

    public Ave(String nome, int idade, String tipoAlimentacao, boolean migratoria){

        super(nome, idade, tipoAlimentacao);

        this.migratoria = migratoria;



    }



    // Método Get

    public boolean getMigratoria(){

        return this.migratoria;

    }



    // Método privado que informa se a ave é migratória ou não

    private String eMigratoria(){

        String retorno = "";



        if (getMigratoria()){

            retorno = " > Essa ave é migratória!";

        } else {

            retorno = " > Essa ave não é migratória!";

        }



        return retorno;

    }



    // Método exibirInfo sobrescrito

    public String exibirInfo(){

        return super.exibirInfo() + "\n" + eMigratoria();

    }



    // Método exibirHabitat sobrescrito

    public String exibirHabitat(){

        return "O habitat típico de uma ave é um local que oferece recursos essenciais " + 

                "para sua sobrevivência, como abrigo, alimento e locais para nidificação. As aves " +

                "podem ser encontradas em uma variedade de ambientes, desde florestas e campos até " +

                "desertos e regiões costeiras. A disponibilidade de alimentos, como sementes, frutas, " +

                "insetos ou peixes, e a presença de árvores, arbustos ou cavidades para nidificação " +

                "são fatores cruciais que influenciam a escolha do habitat de uma ave. A proximidade " +

                "de fontes de água também é importante, especialmente para aves que se alimentam de " +

                "peixes ou que precisam beber e se banhar.";

    }

}

