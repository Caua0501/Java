import java.util.Scanner;

public class média {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt(); 
        
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();
        
        int média = num1 + num2 + num3 / 3;

        System.out.println("Sua média é: " + média);
         scanner.close(); 
    }
}
