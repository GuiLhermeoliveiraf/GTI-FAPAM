public class Principal {
    public static void main(String[] Args){
        Frota frota1 = new Frota("Frota");
        Motor V8 = new Motor("V8", 390);
        Veiculo Gol = new Carro("Gol", 2000, 100, V8);
        Veiculo Volvo = new Caminhao("Volvo", 2009, 250, 80);

        frota1.adcionarVeiculo(Gol);
        frota1.adcionarVeiculo(Volvo);

        Gol.abastacer(50);
        Volvo.abastacer(80);
        
        System.out.println(frota1.exibirVeiculos());

       

    }
}
