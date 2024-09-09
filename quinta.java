import java.util.Scanner;

public class quinta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a string que deseja inverter: ");
        String palavra = scanner.nextLine();
        
        char[] letras = palavra.toCharArray();
        int n = letras.length;
        
        // Inverter o array de caracteres
        for (int i = 0; i < n / 2; i++) {
            char temp = letras[i];
            letras[i] = letras[n - 1 - i];
            letras[n - 1 - i] = temp;
        }
        
        // Converter o array de volta para uma string
        String palavaInvertida = new String(letras);
        
        System.out.println("String invertida: " + palavaInvertida);
        
        scanner.close(); // Feche o scanner quando não for mais necessário
    }
}
