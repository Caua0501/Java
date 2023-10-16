import java.util.Scanner;

public class ForçaNecessária {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a Massa: ");
        double massa = scanner.nextDouble();

        System.out.print("Digite a aceleração: ");
        double aceleração = scanner.nextDouble();

        double força = massa * aceleração;

         System.out.print(" A força necessária é: " + força + "N");
       
         scanner.close();
    }
}
