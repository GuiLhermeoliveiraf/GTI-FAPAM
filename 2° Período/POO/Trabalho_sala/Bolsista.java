// Criando uma classe Bolsita que herda de aluno
public class Bolsista extends Aluno {

    // Metado contrutor
    public Bolsista(String nome, int idade, String genero, String ra, Escola escola) {
        super(nome, idade, genero, ra, escola);
    }

    // Metados abstratos da classe Pessoa
    public String falar() {
        return "Estou estudando muito";
    }

    public String estudar() {
        return "Não aguento mais estudar";
    }

}
