public class Filme extends Midia {
    private String diretor;
    private int duracao;

    public Filme(String titulo, int anoLancamento, String categoria, String diretor, int duracao) {
        super(titulo, anoLancamento, categoria);
        this.diretor = diretor;
        this.duracao = duracao;
    }

    @Override
    public String exibirinfo() {
        return "Titulo : " + getTitulo() + " Ano Lancamento: " + getAnoLancamento() + " Diretor: " + getDiretor()
                + " Duracao: " + getDuracao() + "Min" ;
    }

    @Override
    public String tipoDeMidia() {
        return getCategoria();
    }

    public String getDiretor() {
        return diretor;
    }

    public int getDuracao() {
        return duracao;
    }

}
