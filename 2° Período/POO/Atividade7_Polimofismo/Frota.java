// Criando a classe Frota
public class Frota {
    private String nome;
    private Veiculo[] veiculos;
    private int calculadora;

    // Metado Contrutor da classe Frota
    public Frota(String nome) {
        this.nome = nome;
        veiculos = new Veiculo[10];
        this.calculadora = 0;
    }

    // Metado Getter do atributo nome
    public String getNome(){
        return nome;
    }

    // Metado que adiciona um valor do tipo Veiculo no Array
    public void adcionarVeiculo(Veiculo veiculo) {
        if (calculadora <= veiculos.length) {
            veiculos[calculadora] = veiculo;
            calculadora++;
        }

    }

    // Metado que mostra o metado detalhes de todos os Veiculos dentro de Array
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

