package JavaMatemática2;

import java.util.Scanner;

public class VolumeCilindro {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        

        System.out.println("Defina o valor de pi");
        double pi = scanner.nextDouble();
        
        System.out.println("Defina uma altura em cm para o cilindro");
        double altura = scanner.nextDouble();
        
        System.out.println("Defina um volume em cm cúbicos para o clilindro");
         double volume = scanner.nextDouble();
        
        double x = (4 * volume) / (altura * pi); 
        double diametro = Math.sqrt(x);

        double raio = diametro / 2;

        System.out.println("O valor do raio é:" + raio);
         scanner.close();
    }
}
