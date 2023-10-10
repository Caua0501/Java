

public class MenorDisor {
    public static void main(String[] args) {

        int num = 3;
        int menorDivisor = 1;

        for (int i = 2; i >=num; i++) {
            if (num % i == 0){
                menorDivisor = i;
            }
        }
    System.out.println("O menor divisor é: " + menorDivisor);
    }
}
