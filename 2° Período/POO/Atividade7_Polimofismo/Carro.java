public class Carro extends Veiculo {
    private Motor motor;

    public Carro(String modelo, int ano, int capacidadeTotal, Motor motor) {
        super(modelo, ano, capacidadeTotal);
        this.motor = motor;
    }

    @Override
    public String detalhes() {
        return super.detalhes() + " Motor: " + this.motor.getTipo();
    }

}
