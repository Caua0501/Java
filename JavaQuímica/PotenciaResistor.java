import java.util.Scanner;

public class PotenciaResistor {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a tensão em volts: ");
        double tensao = scanner.nextDouble();

        System.out.print("Digite a corrente em amperes: ");
        double resistencia = scanner.nextDouble();

        double potência = tensao * tensao / resistencia;

        System.out.println("A potência dissipada é: " + potência + "W"); 

        scanner.close();
    }
}
