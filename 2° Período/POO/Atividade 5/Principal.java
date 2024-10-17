import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Livro liv1 = new Livro(null, null, 0, 1);

        System.out.println("Digite o nome do livro");
        liv1.setLivro(entrada.nextLine());

        System.out.println("Digite o nome do autor");
        liv1.setAutor(entrada.nextLine());

        System.out.println("Digite o ano da publicação: ");
        liv1.setAnopublicacao(entrada.nextInt());
        entrada.nextLine();

        Biblioteca acervo = new Biblioteca("Fapam");
        acervo.adicionarLivro(liv1);

        liv1.status();

        System.out.println();

        acervo.exibirLivros();

        System.out.println();

        System.out.println("Digite o ano em que deseja ver os livros");
        acervo.exibirlivros(entrada.nextInt());
        entrada.nextLine();

        System.out.println();

        System.out.println("Digite o nome do livro que deseja excluir:");
        acervo.excluirlivros(entrada.nextLine());
        entrada.nextLine();

        System.out.println("Estamos encerrando nosso expedinte, obrigado por vir");

    }
}
}
