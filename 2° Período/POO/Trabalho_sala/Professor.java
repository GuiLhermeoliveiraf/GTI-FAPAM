public class Professor extends Pessoa{
    private Materia materia;
    private float salario;
    
    
    public Professor(String nome, int idade, String genero, float salario, Materia materia){
        super(nome, idade, genero);
        this.salario = salario;
        this.materia = materia;
    }

    public float getSalario(){
        return salario;
    }

    public String falar(){
        return "Vai reprovar";
    }

    public String estudar(){
        return "Ja estou formado";
    }

    public final void mudarMateria(Materia materia){
        this.materia = materia;
    }












} 