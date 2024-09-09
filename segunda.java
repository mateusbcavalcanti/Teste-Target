import java.util.Scanner;

public class segunda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o numero que deseja analisar: ");
        int numero = scanner.nextInt();
        int a = 0;
        int b = 1;
        int var;
        boolean pertence = false;
        for (int i = 0 ; i < numero+4 ; i++){ 
            var = a + b;
            if(numero == a || numero == b || numero == var){
                pertence = true;
            }
            a = b;
            b = var;
            
        }

        if (pertence) {
            System.out.println("O numero "+numero+" pertence a sequencia de Fibonacci.");
        }
        else{
            System.out.println("O numero "+numero+" nao pertence a sequencia de Fibonacci.");
        }
        
        scanner.close(); // Feche o scanner quando não for mais necessário
    }
}
