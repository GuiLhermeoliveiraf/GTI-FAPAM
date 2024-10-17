import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    ArrayList<Livro> livros;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Biblioteca(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<Livro>();

    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void exibirLivros() {
        for (Livro livro : livros) {
            System.out.println("Acevo " + livro.getLivro());
        }
    }

    public void exibirlivros(int ano) {
        for (Livro livro : livros) {
            if (ano == livro.getAnopublicacao()) {
                System.out.println("Total de coleção: " + livro.getLivro());
            }

        }
    }

    public void excluirlivros(String titulo) {
        for (Livro livro : livros) {
            if (titulo.equals(livro.getLivro())) {
                System.out.println("Livro excluido: " + titulo);
                livros.remove(livro);
            }

        }

    }

}
