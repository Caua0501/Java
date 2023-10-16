import java.util.Scanner;

public class ÁreaSuperfícieEsfera {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o Raio: ");
        double raio = scanner.nextDouble();

       double área = 4 *Math.PI * raio * raio;

       System.out.println("A área da superfície da esfera é aproximadamente: " + área + "cm²");

        scanner.close();
    }
}
