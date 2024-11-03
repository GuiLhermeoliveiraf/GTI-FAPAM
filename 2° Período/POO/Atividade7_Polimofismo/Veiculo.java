// Criando a Classe veiculo
public class Veiculo {
    private String modelo;
    private int ano;
    private int litros;
    private final int capacidadeTotal;

    // Contrutor da classe
    public Veiculo(String modelo, int ano, int capacidadeTotal) {
        setModelo(modelo);
        setAno(ano);
        this.capacidadeTotal = capacidadeTotal;
    }

    
    // Metados Getters e Setters
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

    // Metados de detalhes
    public String detalhes() {
        return "Modelo: " + getModelo() + ". Ano: " + getAno() + " Litros: " + getLitros();
    }

    // Metados abastecer onde pega um valor inteiro como parametro e adiciona ao atributo litros se o valor for maior que 0
    public void abastacer(int litros) {

        if (litros > 0) {
            if (capacidadeTotal > (getLitros() + litros)) {
                this.litros = getLitros() + litros;

            }

        }

    }

    // Metados abastecer maximo, coloca o atributos litros no maximo do atributo capacidade total
    public void abstacerMax() {
        this.litros = capacidadeTotal;
    }

}
