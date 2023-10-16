import java.util.Scanner;

public class VolumeCubo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o comprimento da aresta:");
        double aresta = scanner.nextDouble();

        double cubo = aresta * aresta * aresta;

         System.out.println("A área do cubo é: " + cubo + "cm³");
        
        scanner.close();
    }
}
