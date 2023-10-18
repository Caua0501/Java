package Java2;
import java.util.Scanner;

public class Área {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da base: ");
        int base = scanner.nextInt(); 
        
        System.out.print("Digite o valor da altura: ");
        int altura = scanner.nextInt();

        int área = base * altura / 2;

        System.out.println("A área do triângulo é: " + área);
         scanner.close();

    }
}
