import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
    
    Livro liv1 = new Livro(null, null, 0, 1);

    System.out.println("Digite o nome do livro");
    liv1.setLivro(entrada.nextLine());    

    System.out.println("Digite o nome do autor");
    liv1.setAutor(entrada.nextLine());

    System.out.println("Digite o ano da publicação: ");
    liv1.setAnopublicacao(entrada.nextInt());

    Biblioteca acervo = new Biblioteca("Fapam");
    acervo.adicionarLivro(liv1);

    liv1.status();

    acervo.exibirLivros();

    System.out.println("Digite o ano em que deseja ver os livros");
    acervo.exibirlivros(2024);

    acervo.excluirlivros("Teste");










    }
}
