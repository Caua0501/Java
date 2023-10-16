package ExemplosJava;

public class RecursoExemplo {
    public static void main(String[] args) {
        int numero = 5;
        int fatorial = calcularFatorial(numero);
        System.out.println("Fatorial de " + numero + " é " + fatorial);

    }

    public static int calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calcularFatorial(n- 1);
    }
}
