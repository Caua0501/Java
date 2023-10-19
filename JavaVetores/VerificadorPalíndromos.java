import java.util.Scanner;

public class VerificadorPalíndromos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra");
        String palavra = scanner.nextLine();

        boolean ehPalindromo = VerificadorPalíndromo(palavra);

        if (ehPalindromo) {
            System.out.println("A palavra é um palíndromo.");
        } else {
            System.out.println("A palavra não é um palíndromo.");
        }
        scanner.close();

    }

    public static boolean VerificadorPalíndromo(String palavra) {
    palavra = palavra.toLowerCase();
    int i = 0;
    int j = palavra.length() - 1;

    while (i < j) {
        if (palavra.charAt(i) != palavra.charAt(j)) {
            return false;
        }
        i++;
        j--;
    }
    return true;
    }
}
