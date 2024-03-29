import java.util.Scanner;

    public class CamadaEletrônica {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o número total de elétrons: ");
            int totalEletrons = scanner.nextInt();

            int n = 1;
            int eletronsRestantes = totalEletrons;

            while (eletronsRestantes > 0) {
                int capacidadeCamada = 2 * n * n;
                int eletronsCamada = Math.min(capacidadeCamada, eletronsRestantes);

                System.out.println("Camada " + n + ": " + eletronsCamada + "elétrons");

                eletronsRestantes -= eletronsCamada;
                n++;
                scanner.close();
            }
        }
    }
