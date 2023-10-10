package JavaMatemática;
    
import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a: ");
        double a = scanner.nextInt();

        
        System.out.println("Digite b: ");
        double b = scanner.nextInt();


        System.out.println("Digite c: ");
        double c = scanner.nextInt();

        double delta = (b * b) + (-4 * (a * c));
        
        if (delta < 0) {
            double x = -b / (2 * a);
            System.out.println("A equação possui uma raíz real:" + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("A equação possui duas raízes reais: " + x1 + " e " + x2);

            }
            scanner.close();
    }
}
