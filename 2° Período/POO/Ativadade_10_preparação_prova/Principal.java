public class Principal {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Guilherme",2000);
        Autor autor2 = new Autor("Daniel", 1930);
        Midia livro1 = new Livro("Me Passa de Ano", 2000, "Livro", 200);
        ((Livro)livro1).adicionarAutor(autor2);
        ((Livro)livro1).adicionarAutor(autor1);
        
        Midia filme1 = new Filme("Ainda da pra Passar", 2024, "Filme", "Daniel Capanema", 160);
        Midia Musica = new Musica("Tem necessidade fazer 60 pontos? ", 2020, "Musica", "Guilherme", "Gospel");

        
        Biblioteca Acervo = new Biblioteca("Acervo");
        Acervo.adicionarMidia(Musica);
        Acervo.adicionarMidia(filme1);
        Acervo.adicionarMidia(livro1);
        
        System.out.println();
        System.out.println(Acervo.listarMidia());
      
        System.out.println(Acervo.exibirDetalhesMidia("Filme"));

        System.out.println();
        System.out.println(Acervo.contadorMidiasPorAno(2024));

        System.out.println();
        System.out.println(((Livro)livro1).listarAutores());
    }
}
