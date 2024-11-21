public final class Diretor extends Professor{
    private Escola escola;
    private int anoCargo;

    public Diretor(String nome, int idade, String genero, int anoCargo, Escola escola){
        super(nome, idade, genero);
        this.anoCargo = anoCargo;
        this.escola = escola;
    }

    public String falar(){
        return "A mensalidade vai aumentar";
    }
    
    public String estudar(){
        return "Ja tenho doutorado";
    }
}