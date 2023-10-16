import java.util.Scanner;

public class PesoObjeto {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a massa em Kg: ");
        double massa = scanner.nextDouble();

         System.out.print("Digite a Aceleração Gravitacional de Marte: ");
        double aceleracaogravitacional = scanner.nextDouble();
    
        double peso = massa * aceleracaogravitacional;

         System.out.print("O peso do objeto em Marte é: " + peso + "N");
         scanner.close();
    }
}
