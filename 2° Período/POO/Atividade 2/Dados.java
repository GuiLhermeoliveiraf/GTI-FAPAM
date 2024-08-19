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
        for (int num = 0; num < tamanho; num++) {
            System.out.println("Digite um número: ");
            array[num] = scanner.nextInt();
        }

        // Inverte o array
        int[] arrayInvertido = new int[tamanho];
        for (int num = 0; num < tamanho; num++) {
           arrayInvertido[num] = array[tamanho - 1 - num];
        }
    
        // Exibe o array invertido
        System.out.println("Array invertido:");
        for (int num = 0; num < tamanho; num++) {
           System.out.println(arrayInvertido[num] + " ");
        }
        
        // Percorre o array para encontrar o maior valor
        int maior = arrayInvertido[0];
        for (int num = 1; num < array.length; num++) {
            if (arrayInvertido[num] > maior) {
            maior = arrayInvertido[num];
            }
        }

        System.out.print("O maior número do array é: " + maior);
    }
}

