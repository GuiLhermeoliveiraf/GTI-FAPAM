import java.util.Scanner;

public class Aplicativo {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Programa esta iniciando");
    Computador computador1 = new Computador();
    
    System.out.println(computador1.exi_info());

    computador1.Atu_valores(null, 0, 0);
    
    System.out.println("Digite a sua marca: ");
    computador1.setMarca(entrada.nextLine());
    
    System.out.println("Digite sua quantidade de memoria ram: ");
    computador1.setMemoriaram(entrada.nextInt());

    System.out.println("Digite sua quantidade de armazenamento: ");
    computador1.setArmazenamento(entrada.nextInt());

    System.out.println(computador1.exi_info());

    System.out.println(computador1.veri_velo());

    }
}