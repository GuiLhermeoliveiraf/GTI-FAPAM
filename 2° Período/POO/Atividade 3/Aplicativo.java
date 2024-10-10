import java.util.Scanner;

public class Aplicativo {
    // Main do aplicativo 
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Programa esta iniciando");
    Computador computador1 = new Computador();
    
    // exibe as configurações do contrutor passadas pelo dev
    System.out.println(computador1.exi_info());

    // Metado que atribuei novos valores a variavel 
    computador1.Atu_valores(null, 0, 0);
    
    System.out.println("Digite a sua marca: ");
    computador1.setMarca(entrada.nextLine());
    
    System.out.println("Digite sua quantidade de memoria ram: ");
    computador1.setMemoriaram(entrada.nextInt());

    System.out.println("Digite sua quantidade de armazenamento: ");
    computador1.setArmazenamento(entrada.nextInt());

    // Exibe as novas configurações do computador 
    System.out.println(computador1.exi_info());

    // Metado que verifica se Computador é rapido ou lento
    System.out.println(computador1.veri_velo());

    }
}
