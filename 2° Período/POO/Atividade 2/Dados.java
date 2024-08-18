import java.util.Scanner;
// Preciso criar um array, retornar ele ao contrario e o maior numero 
public class Dados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Lê o tamanho do array
        System.out.print("Quantos números você quer inserir? ");
        int tamanho = scanner.nextInt(); 
        int[] array = new int[tamanho]; // Cria o array com o tamanho especificado
        
        // Lê cada número e armazena no array
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite um número: ");
            array[i] = scanner.nextInt();
        }

        // Inverte o array
        int[] arrayInvertido = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
           arrayInvertido[i] = array[tamanho - 1 - i];
        }
    
        // Exibe o array invertido
        System.out.println("Array invertido:");
        for (int i = 0; i < tamanho; i++) {
           System.out.println(arrayInvertido[i] + " ");
        }
       
        int maior = arrayInvertido[0];

        // Percorre o array para encontrar o maior valor
        for (int i = 1; i < array.length; i++) {
            if (arrayInvertido[i] > maior) {
            maior = arrayInvertido[i];
            }
        }

        System.out.print("O maior número do array é: " + maior);
    }
}
