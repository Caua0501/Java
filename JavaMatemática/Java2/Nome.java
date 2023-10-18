package Java2;

import java.util.Scanner;

public class Nome {
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome ");
        String nome = scanner.nextLine();
     System.out.print("Seu nome é: " + nome);

     scanner.close();
    } 
}


