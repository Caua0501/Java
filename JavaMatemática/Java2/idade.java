package Java2;

import java.util.Scanner;

public class idade {
     public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade ");
        int idade = scanner.nextInt();
         System.out.print("Sua idade é: " + idade);
         scanner.close();
     } 
}
