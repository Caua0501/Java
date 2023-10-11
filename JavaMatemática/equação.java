package JavaMatemática;
public class equação {
    public static void main(String[] args) {

        int a = 2;
        int b = 5;
        int c = -3;

        double delta = (b * b) + (-4 * (a * c));

        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);

    }
}
 