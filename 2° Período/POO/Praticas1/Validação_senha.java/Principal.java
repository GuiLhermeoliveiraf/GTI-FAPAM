public class Principal {
    public static void main(String[] args) {

        Validacao senha1 = new Validacao("Guilherme", 20, "Teste@test1");

        senha1.status();

        System.out.println();

        senha1.validacao();

        System.out.println();

        senha1.status();

    }
}
