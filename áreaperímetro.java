import java.util.Scanner;

public class áreaperímetro {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        int Raio = scanner.nextInt();

        double área = 3.14 * Raio * Raio;
        

        System.out.print("A área do círculo é: " + área);
        
        double perímetro = 2 * 3.14 * Raio;
         
        System.out.print("O perímetro do círculo é: " + perímetro);
        scanner.close();
    }
}
