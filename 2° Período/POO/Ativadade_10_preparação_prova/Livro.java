import java.util.ArrayList;

public class Livro extends Midia {
    private int nuemroPaginas;
    private ArrayList<Autor> autores;

    public Livro(String titulo, int anoLancamento, String categoria, int nuemroPaginas ) {
        super(titulo, anoLancamento, categoria);
        this.nuemroPaginas = nuemroPaginas;
        this.autores = new ArrayList<>();
    }

    @Override
    public String exibirinfo() {
        return "Titulo : " + getTitulo() + " Ano Lancamento: " + getAnoLancamento() + " Numero de Paginas: "
                + getNuemroPaginas() + " Autores: " + listarAutores();
    }

    @Override
    public String tipoDeMidia() {
        return getCategoria();
    }

    public int getNuemroPaginas() {
        return nuemroPaginas;
    }

    public final String exibirResumo() {
        return getTitulo() + getNuemroPaginas();
    }

    public boolean validarLivro(int numeroMinimo) {
        if (nuemroPaginas > numeroMinimo)
            return true;
        else
            return false;
    }

    public void adicionarAutor(Autor autor) {
        autores.add(autor);
    }

    public String listarAutores() {
        String retorno = "";

        for (int i = 0; i < autores.size(); i++) {
            retorno += autores.get(i).getNome();
            retorno += ", ";
        }

        return retorno;
    }

}
