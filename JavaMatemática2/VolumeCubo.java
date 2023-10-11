package JavaMatemática2;

import java.util.Scanner;

public class VolumeCubo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Defina o valor do volume");
        double volume = scanner.nextDouble();
        
        double aresta = Math.cbrt(volume);

        System.out.println("O valor da aresta é: " + aresta);

        scanner.close();

    }
}
