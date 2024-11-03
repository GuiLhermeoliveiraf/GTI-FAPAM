// Criando a classe Caminhao que herda valores da classe Veiculo
public class Caminhao extends Veiculo{
    private int capacidadeCarga;

    // Metado contrutor da Classe Caminhao
    public Caminhao(String modelo, int ano, int capacidadeTotal, int capacidadeCarga) {
        super(modelo, ano, capacidadeTotal);
        this.capacidadeCarga = capacidadeCarga;
    }

    // Metado detalhes sobreescrito da classe Veiculo que adiciona a Capacidade de Carga 
    @Override
    public String detalhes() {
        return super.detalhes() + ". Capidade de Carga: " + capacidadeCarga;
    }


}
