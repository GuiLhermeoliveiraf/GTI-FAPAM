// Criando a Classe Autor
public class Autor {
    private String nome;
    private int anoNascimento;

    // Metado Contrutor
    public Autor(String nome, int anoNascimento) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }

    // Metados Getters
    public String getNome() {
        return nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    // Metado exibir informações do autor 
    public String exibirAutor() {
        return "Nome : " + getNome() + ". Ano Nascimento : " + getAnoNascimento();
    }

    // Metado que calcula a idade do autor 
    public int calcularIdade(int anoAtual) {
        int idade = 0;

        if (anoAtual > 0 && anoAtual > anoNascimento)
            idade = anoAtual - anoNascimento;

        return idade;

    }

}

}
