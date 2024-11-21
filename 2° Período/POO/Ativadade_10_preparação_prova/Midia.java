// Craindo a classe Abstrata Midia
public abstract class Midia {
    private String titulo;
    private int anoLancamento;
    private String categoria;

    // Metado Contrutor que sera herdado pelas subclasses
    public Midia(String titulo, int anoLancamento, String categoria) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.categoria = categoria;
    }

    // Metados Getters
    public String getTitulo() {
        return titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public String getCategoria() {
        return categoria;
    }

    // Metedos Abstratos que seram herdados pelas subclasses
    public abstract String exibirinfo();

    public abstract String tipoDeMidia();

}

