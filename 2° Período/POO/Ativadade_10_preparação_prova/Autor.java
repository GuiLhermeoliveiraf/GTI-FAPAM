public class Autor {
    private String nome;
    private int anoNascimento;

    public Autor(String nome, int anoNascimento) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public String exibirAutor() {
        return "Nome : " + getNome() + ". Ano Nascimento : " + getAnoNascimento();
    }

    public int calcularIdade(int anoAtual) {
        int idade = 0;

        if (anoAtual > 0 && anoAtual > anoNascimento)
            idade = anoAtual - anoNascimento;

        return idade;

    }

}
