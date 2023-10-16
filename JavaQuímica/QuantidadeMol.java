import java.util.Scanner;

public class QuantidadeMol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a massa: ");
        double massa = scanner.nextDouble();

        System.out.print("Digite a massa molar em g/mol: ");
        double massamolar = scanner.nextDouble();

        double mols = massa / massamolar;

        System.out.println("A quantidade de mols é: " + mols);

        scanner.close();
    }
}
