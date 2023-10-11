package JavaMatemática2;

import java.util.Scanner;

public class VolumeCone {
     public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        

        System.out.println("Defina o valor de pi");
        double pi = scanner.nextDouble();
        
        System.out.println("Defina a altura do cone");
        double altura = scanner.nextDouble();
        
        System.out.println("Defina o volume do cone");
         double volume = scanner.nextDouble();
        
        
        double raio = Math.sqrt((3 * volume) / (pi * altura));

       

        System.out.println("O valor do raio é:" + raio);
         scanner.close();
    }
}
