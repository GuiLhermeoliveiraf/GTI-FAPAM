// Criando a classe Musica que herda da Midia
public class Musica extends Midia {
    private String nome;
    private String generoMusical;

    // Metado Contrutor
    public Musica(String titulo, int anoLancamento, String categoria, String nome, String generoMusical) {
        super(titulo, anoLancamento, categoria);
        this.nome = nome;
        this.generoMusical = generoMusical;
    }

    // Metados SobreEscritos da Classe Midia
    @Override
    public String exibirinfo() {
        return "Titulo : " + getTitulo() + " Ano Lancamento: " + getAnoLancamento() + " Nome da Musica: " + getNome()
                + " Genero: " + getGeneroMusical();
    }

    @Override
    public String tipoDeMidia() {
        return getCategoria();
    }

    // Metados Getters
    public String getNome() {
        return nome;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

}
