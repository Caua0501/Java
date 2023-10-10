package Exercícios;
public class MaiorDivisor {
    public static void main(String[] args) {

        int num = 3;
        int maiorDivisor = 1;

        for (int i = 2; i <=num; i++) {
            if (num % i == 0){
                maiorDivisor = i;
            }
        }
    System.out.println("O maior divisor é: " + maiorDivisor);
    }
}
