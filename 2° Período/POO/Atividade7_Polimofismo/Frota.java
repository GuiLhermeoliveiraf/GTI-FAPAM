public class Frota {
    private String nome;
    private Veiculo[] veiculos;
    private int calculadora;

    public Frota(String nome) {
        this.nome = nome;
        veiculos = new Veiculo[10];
        this.calculadora = 0;
    }

    public String getNome(){
        return nome;
    }

    public void adcionarVeiculo(Veiculo veiculo) {
        if (calculadora <= veiculos.length) {
            veiculos[calculadora] = veiculo;
            calculadora++;
            System.out.println("Deu bom");
        }

    }

    public String exibirVeiculos() {
        String retorno = "";
        for (int i = 0; i < veiculos.length; i++) {
            if(veiculos[i] != null){
                retorno += veiculos[i].detalhes();
                retorno += "\n";
            }
        }

        return retorno;
    }

}
