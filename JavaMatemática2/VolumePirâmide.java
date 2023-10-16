package JavaMatemática2;

import java.util.Scanner;
public class VolumePirâmide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Defina o valor da área para a pirâmide");
         double volume = scanner.nextDouble();
        
         System.out.println("Defina o valor da área para a pirâmide");
         double altura = scanner.nextDouble();

        
        double area = Math.sqrt((3 * volume / altura));

        System.out.println("O valor da área é: " + area);
         
        scanner.close();
    }
}
