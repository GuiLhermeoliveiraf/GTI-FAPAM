public class Veiculo {
    private String modelo;
    private int ano;
    private int litros;
    private final int capacidadeTotal;

    public Veiculo(String modelo, int ano, int capacidadeTotal) {
        setModelo(modelo);
        setAno(ano);
        this.capacidadeTotal = capacidadeTotal;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getLitros() {
        return litros;
    }

    public int getCapacidadeTotal() {
        return capacidadeTotal;
    }

    public String detalhes() {
        return "Modelo: " + getModelo() + ". Ano: " + getAno() + " Litros: " + getLitros();
    }

    public void abastacer(int litros) {

        if (litros > 0) {
            if (capacidadeTotal > (getLitros() + litros)) {
                this.litros = getLitros() + litros;

            }

        }

    }

    public void abstacerMax() {
        this.litros = capacidadeTotal;
    }

}
