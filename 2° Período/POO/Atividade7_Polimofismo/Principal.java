public class Principal {
    public static void main(String[] Args){
        // Criando nossa Frota
        Frota frota1 = new Frota("Frota");
        
        // Criando nosso unico motor 
        Motor V8 = new Motor("V8", 390);
        
        // Criando Veiculos do tipo Carro e Caminhao
        Veiculo Gol = new Carro("Gol", 2000, 100, V8);
        Veiculo Volvo = new Caminhao("Volvo", 2009, 250, 80);

        // Adicionando os veiculos a nossa frota
        frota1.adcionarVeiculo(Gol);
        frota1.adcionarVeiculo(Volvo);

        // Abastecendo nossos veiculos 
        Gol.abastacer(50);
        Volvo.abastacer(80);
        
        // Chamando metado que mostra veiculos dentro do array
        System.out.println(frota1.exibirVeiculos());

        // Abastecendo ate o maximo da capacidade
        Gol.abstacerMax();
        Volvo.abstacerMax();
        
        // Chamando metado que mostra veiculos dentro do array
        System.out.println(frota1.exibirVeiculos());

    }
}
