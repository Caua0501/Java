
public class SomaPares {
    public static void main(String[] args) {
        int[] numeros = {2, 3, 6, 8, 10, 11};

        int SomaPares = calcularSomaPares(numeros);

        System.out.println("A soma dos números pares é: " + SomaPares);

        
    }

    public static int calcularSomaPares(int[] numeros) {
        
        int somaPares = 0;
            
        for(int i = 0; i < numeros.length; i++) {
                int numeroAtual = numeros[i];
           
                if(numeroAtual % 2 == 0) {
                somaPares += numeroAtual;
        
            }
        }
        return somaPares;
    }
}
