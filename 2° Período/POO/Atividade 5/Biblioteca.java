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
    }

    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }

    public void exibirLivros(){
        System.out.println("Acervo " + livros.size());
    }

    public void exibirlivros(int ano, Livro publicado){
       if(ano == publicado.getAnopublicacao()){
            System.out.println("Acervo do ano " + ano + " : " + livros.size());
       }
    }

    public void excluirlivros(Livro titulo){
       livros.remove(titulo.getLivro()); 
    }













}
