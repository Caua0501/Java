import java.util.Scanner;

public class RaizQuadrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número real positivo");
        double numero = scanner.nextDouble();

        double raiz = Math.sqrt(numero);

        System.out.println("A raiz quadrada de " + numero + " é " + raiz + " . ");
        
        scanner.close();
    }
}
