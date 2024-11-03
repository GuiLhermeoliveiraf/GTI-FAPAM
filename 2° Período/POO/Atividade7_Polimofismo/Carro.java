// Classe Carro que herda valores de Veiculo
public class Carro extends Veiculo {
    private Motor motor;

    // Metados construtor que pega valores de Veiculo e adiconar um motor 
    public Carro(String modelo, int ano, int capacidadeTotal, Motor motor) {
        super(modelo, ano, capacidadeTotal);
        this.motor = motor;
    }

    // Metado detalhes sobreescrito da classe Veiculo que adiciona o motor 
    @Override
    public String detalhes() {
        return super.detalhes() + ". Motor: " + this.motor.getTipo();
    }

}
