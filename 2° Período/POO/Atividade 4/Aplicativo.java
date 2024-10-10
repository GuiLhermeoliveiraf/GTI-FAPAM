import java.util.Scanner;

public class Aplicativo{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
   
        System.out.println("Ola, nosso programa esta iniciando...");
   
        Hadrware PcFapam = new Hadrware(null, 0, 0);

        System.out.println("Digite o modelo do seu processor: ");
        PcFapam.setProcessador(entrada.nextLine());
   
        System.out.println("Digite qual é a sua contidade de memoria ram: ");
        PcFapam.setMemoria(entrada.nextInt());
   
        System.out.println("Digite sua quantidade de armazenamento: ");
        PcFapam.setArmazenamento(entrada.nextInt());
        entrada.nextLine();

        Perifericos mou_tec = new Perifericos(null, null);
        
        System.out.println("Digite qual é o seu mouse: ");
        mou_tec.setMouse(entrada.nextLine());
        

        System.out.println("Digite qual é o seu teclado: ");
        mou_tec.setTeclado(entrada.nextLine());
        
      
        Software sis_ope = new Software(null, 0);

        System.out.println("Digite qual é o seu modelo de Sistema Operacional");
        sis_ope.setSo(entrada.nextLine());
        
        System.out.println("Digite qual versao do SO voce utiliza: ");
        sis_ope.setVersao(entrada.nextInt());
        
        System.out.print(PcFapam.mostra_info() +" "+ mou_tec.mostra_info_mouse() +" "+ sis_ope.exi_info_so());









    }

}
