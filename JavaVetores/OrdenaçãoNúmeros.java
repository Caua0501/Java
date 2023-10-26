<<<<<<< HEAD
public class OrdenaçãoNúmeros {
    public static void main(String[] args) {
        int[] lista = {5, 2, 8, 1, 9, 3};
        ordenaLista(lista);


        System.out.println("Vetor em ordem crescente:");
        for(int num : lista) {
            System.out.print(num + " ");
        }
    }
    public static void ordenaLista(int[] lista) {
        // Percorre a lista
        for (int i = 0; i < lista.length - 1; i++) {
            // Outro loop para comparar e trocar os elementos
            for(int j = 0; j < lista.length - 1; j++) {
                // Compara dois elementos adjacentes
                if (lista[j] > lista[j + 1]) {
                    // Troca os elementos se estiverem na ordem errada
                    int temp = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = temp;
                }
            }
        }
    }
}
=======
public class OrdenaçãoNúmeros {
    public static void main(String[] args) {
        int[] lista = {5, 2, 8, 1, 9, 3};
        ordenaLista(lista);


        System.out.println("Vetor em ordem crescente:");
        for(int num : lista) {
            System.out.print(num + " ");
        }
    }
    public static void ordenaLista(int[] lista) {
        for (int i = 0; i < lista.length - 1; i++) {
            for(int j = 0; j < lista.length - 1; j++) {
                if (lista[j] > lista[j + 1]) {
                    int temp = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = temp;
                }
            }
        }
    }
}
>>>>>>> 7d20ee6a665433be02df84e65aa8227aa1cafa93
