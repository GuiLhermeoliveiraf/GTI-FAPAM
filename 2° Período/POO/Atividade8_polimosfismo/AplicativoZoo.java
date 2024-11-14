public class AplicativoZoo {

    public static void main(String[] args) {

        

        // Criando as instâncias

        Animal animal = new Animal("Pinguim", 3, "Carnívoro");

        Mamifero zebra = new Mamifero("Zebra", 5, "Herbívoro", 12);

        Mamifero cavalo = new Mamifero("Cavalo", 5, "Herbívoro", 2);

        Ave periquito = new Ave("Periquito", 1, "Herbívoro", false);

        

        // Instanciando o array

        Zoo zoo = new Zoo("Zow");



        // Adicionando animais no array

        zoo.adicionarAnimal(animal);

        zoo.adicionarAnimal(zebra);

        zoo.adicionarAnimal(cavalo);

        zoo.adicionarAnimal(periquito);



        // Imprimindo os dados dos animais em atração

        System.out.println("--- Zoológico " + zoo.getNomeZoo() + " ---\n");

        System.out.println(" - Animais em atração: \n");

        System.out.println(zoo.exibirTodosAnimais());



        // Imprimindo informações sobre seus habitats

        System.out.println(" - Informaçõe sobre seus habitats:\n");

        System.out.println(zoo.exibirHabitats());



        // Imprimindo os animais com período de gestação curta

        System.out.print(" - Mamíferos com período de gestação menor que 3 meses: ");

        System.out.print(zoo.exibirMamiferosGestacaoCurta());

    }    

}
