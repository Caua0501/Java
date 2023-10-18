import java.util.Scanner;

public class ContadorVogais {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase:");
        String frase = scanner.nextLine();
        int numVogais = contaVogais(frase);
        System.out.println("O número de vogais é: " + numVogais);
        
        scanner.close();
    }

    public static int contaVogais(String frase) {
        int numVogais = 0;
        for(int i = 0; i < frase.length(); i++) {
            char letras = frase.charAt(i);
            if (letras == 'a' || letras == 'A' || letras =='E' || letras =='e' || letras == 'I' || letras == 'i' || letras == 'o' || letras == 'O' || letras == 'U' || letras == 'u'); {
            numVogais ++;
            }
        }
        return numVogais;
    }
}
