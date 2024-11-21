import java.util.ArrayList;

// Criando a classe Livro que herda da Midia
public class Livro extends Midia {
    private int nuemroPaginas;
    private ArrayList<Autor> autores;

    // Contrutor que recebe atributos da classe Pai
    public Livro(String titulo, int anoLancamento, String categoria, int nuemroPaginas) {
        super(titulo, anoLancamento, categoria);
        this.nuemroPaginas = nuemroPaginas;
        this.autores = new ArrayList<>();
    }

    // Metados Sobreescritos, adicionando informações
    @Override
    public String exibirinfo() {
        return "Titulo : " + getTitulo() + " Ano Lancamento: " + getAnoLancamento() + " Numero de Paginas: "
                + getNuemroPaginas() + " Autores: " + listarAutores();
    }

    // Metado que retorna o tipo de midia
    @Override
    public String tipoDeMidia() {
        return getCategoria();
    }

    // Metado Getter
    public int getNuemroPaginas() {
        return nuemroPaginas;
    }

    // Metado final que exibi as informações do livro
    public final String exibirResumo() {
        return getTitulo() + getNuemroPaginas();
    }

    // Metado que valida a quantidade de paginas do livro
    public boolean validarLivro(int numeroMinimo) {
        if (nuemroPaginas > numeroMinimo)
            return true;
        else
            return false;
    }

    // Metado de gabiarra para adicionar um autor ao livro
    public void adicionarAutor(Autor autor) {
        autores.add(autor);
    }

    // Metado que retorna todos os autores
    public String listarAutores() {
        String retorno = "";

        for (int i = 0; i < autores.size(); i++) {
            retorno += autores.get(i).getNome();
            retorno += ", ";
        }

        return retorno;
    }

}
