public class Caminhao extends Veiculo{
    private int capacidadeCarga;

    public Caminhao(String modelo, int ano, int capacidadeTotal, int capacidadeCarga) {
        super(modelo, ano, capacidadeTotal);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public String detalhes() {
        return super.detalhes() + ". Capidade de Carga: " + capacidadeCarga;
    }


}
