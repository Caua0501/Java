
    import java.util.Scanner;

public class Velocidade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura em metros: ");
        double altura = scanner.nextDouble();

        System.out.print("Digite a aceleração gravitacional em m/s²: ");
        double aceleracaogravitacional = scanner.nextDouble();

        double velocidadefinal = Math.sqrt(2 * aceleracaogravitacional * altura);

        System.out.println("A velocidade final é: " + velocidadefinal + " m/s");
        scanner.close();
    }
}



