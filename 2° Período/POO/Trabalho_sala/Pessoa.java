// Classe abstrata Pessoa
public abstract class Pessoa{
    private String nome;
    private int idade;
    private String genero

    // Contrutor
    public Pessoa(String nome, int idade, String genero){
        setNome(nome);
        setIdade(idade);
        setGenero(genero);
    }

    // Metados getters e Setters
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }

    // Metados Abstratos

    public abstract String falar();

    public abstract String estudar();
    



}