// Criando a classe Filme que herda da classe Midia 
public class Filme extends Midia {
    private String diretor;
    private int duracao;

    // Metado Contrutor
    public Filme(String titulo, int anoLancamento, String categoria, String diretor, int duracao) {
        super(titulo, anoLancamento, categoria);
        this.diretor = diretor;
        this.duracao = duracao;
    }

    // Metados SobreEscritos da Classe Midia
    @Override
    public String exibirinfo() {
        return "Titulo : " + getTitulo() + " Ano Lancamento: " + getAnoLancamento() + " Diretor: " + getDiretor()
                + " Duracao: " + getDuracao() + "Min";
    }

    @Override
    public String tipoDeMidia() {
        return getCategoria();
    }

    // Metados Getters
    public String getDiretor() {
        return diretor;
    }

    public int getDuracao() {
        return duracao;
    }

}
