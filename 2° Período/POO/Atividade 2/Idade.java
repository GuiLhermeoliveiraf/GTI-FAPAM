import java.util.Scanner;
// Quero descobrir se o usuario tem obrigatoriedade de voto
public class Idade{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String nome;
        int idade;
        
        // Aqui peços os valores das variaveis nome e idade
        System.out.println("Digite seu nome: ");
        nome = entrada.nextLine();

        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();
        
        // Aqui faço as comparações de idade para descobrir o voto
        System.out.printf("Olá "+nome+" Seu voto é ");
        if(idade<16){
            System.out.println("Inputavel");
        }

        else if(idade<18 || idade>60){
            System.out.println("Facultativo");
        }

        else if (idade>=18 || idade<=60){
          System.out.println("Obrigatorio");  
        }
    }
    
} 
