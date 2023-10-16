package ExemplosJava;
import java.util.ArrayList;
import java.util.List;
public class Lista {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Alice");
        nomes.add("Bob");
        nomes.add("Carol");

        System.out.println("Primeiro nome: " + nomes.get(0));
    }
}
