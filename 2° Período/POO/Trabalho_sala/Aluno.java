public class Aluno extends Pessoa{
    private final String ra;
    private Escola escola;

    public Aluno(String nome, int idade, String genero, String ra, Escola escola){
        super(nome, idade, genero);
        this.ra = ra;
        this.escola = escola;
    }

    public String falar(){
        return "Me passa de ano por 50 no pix?";
    }
    
    public String estudar(){
        return "Ja estou estudando muito";
    }

    
















}