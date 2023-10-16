package JavaMatemática2;
import java.util.Scanner;

public class ÁreaCírculo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Defina o valor do comprimento");
        double comprimento = scanner.nextDouble();

        System.out.println("Defina o valor da largura");
        double largura = scanner.nextDouble();

        double perimetro = 2 * (comprimento + largura);

        double raio = perimetro / (2 * Math.PI);

        double area = Math.PI * Math.pow(raio, 2);

        System.out.println("O raio do círculo é: " + raio);
        System.out.println("A área do círculo é: " + area);
        scanner.close();
    }   
}
