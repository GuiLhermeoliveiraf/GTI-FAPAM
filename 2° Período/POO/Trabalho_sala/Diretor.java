// Criando metado final Diretor que herda de Professor
public final class Diretor extends Professor {
    private Escola escola;
    private int anoCargo;

    // Metado Contrutor
    public Diretor(String nome, int idade, String genero, float salario, Escola escola, int anoCargo) {
        super(nome, idade, genero, salario);
        this.anoCargo = anoCargo;
        this.escola = escola;
    }

    // Metados abstratos da classe Pessoa
    public String falar() {
        return "A mensalidade vai aumentar";
    }

    public String estudar() {
        return "Ja tenho doutorado";
    }

    // Metados Getters
    public Escola getEscola() {
        return escola;
    }

    public int getAnoCargo() {
        return anoCargo;
    }

    // Metados Setters
    public void mudarEscola(Escola escola) {
        this.escola = escola;
    }

    public void setAnoCargo(int anoCargo) {
        this.anoCargo = anoCargo;
    }

}
