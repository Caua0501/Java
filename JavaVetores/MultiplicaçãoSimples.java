
import java.util.Scanner;

public class MultiplicaçãoSimples {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Primeiro número: ");
        int num1= scanner.nextInt();

        System.out.println("Digite o Segundo número: ");
        int num2= scanner.nextInt();
    
        int resultado = multiplicarNumeros(num1, num2);

        System.out.println("O resultado é: " + resultado);

        scanner.close();

    }
    public static int multiplicarNumeros(int num1, int num2) {
        return num1 * num2;
    }
}
