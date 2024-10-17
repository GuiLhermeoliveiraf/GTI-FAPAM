public class Livro {
    private String livro;
    private String autor;
    private int anopublicacao;
    final int codigolivro;

    public Livro(String livro, String autor, int anopublicacao, int codigolivro) {
        setLivro(livro);
        setAutor(autor);
        setAnopublicacao(anopublicacao);
        this.codigolivro = codigolivro;
    }

    public Livro(String livro, String autor, int anopublicacao) {
        this.codigolivro = 0;
        setLivro(livro);
        setAutor(autor);
        this.anopublicacao = 2024;
    }

    public String getLivro() {
        return livro;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnopublicacao() {
        return anopublicacao;
    }

    public int getCodigolivro() {
        return codigolivro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnopublicacao(int anopublicacao) {
        this.anopublicacao = anopublicacao;
    }

    public void exibirdetalhes() {
        System.out.println("Apresentando o autor " + getAutor());
        System.out.println("Publicou o livro " + getLivro());
    }

    public void status() {
        System.out.println("Apresentando o autor " + getAutor());
        System.out.println("Publicou o livro " + getLivro());
        System.out.println("Publicado no ano de " + getAnopublicacao());
    }
}







