import java.util.Scanner;

public class SomaDígitos {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite um número: ");
            int numero = scanner.nextInt();

            int soma = calcularSomadosDigitos(numero);

            System.out.println("Soma dos digitos: " + soma);

            scanner.close();
        }

        public static int calcularSomadosDigitos(int numero) {
            int soma = 0;

            while (numero != 0) {
                int digito = numero % 10;
                soma += digito;
                numero /= 10;
            }

            return soma;
        }
    }

