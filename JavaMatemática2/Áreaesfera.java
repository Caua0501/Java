package JavaMatemática2;

import java.util.Scanner;

public class Áreaesfera {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        

        System.out.println("Defina o valor de pi");
        double pi = scanner.nextDouble();
        
        
        System.out.println("Defina o valor da área para a esfera");
         double area = scanner.nextDouble();
        
        double x = (area) / ( 4 * pi); 
        double raio = Math.sqrt(x);

        System.out.println("O valor do raio é:" + raio);
         
        scanner.close();
    }
}
