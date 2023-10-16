
    import java.util.Scanner;

public class VelocidadeMédia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância em metros: ");
        double distancia = scanner.nextDouble();

        System.out.print("Digite o tempo em segundos: ");
        double tempo = scanner.nextDouble();

        double velocidadeMedia = distancia / tempo;

        System.out.println("A velocidade média é: " + velocidadeMedia + " m/s");
        scanner.close();
    }
}

