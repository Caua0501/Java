package ExemplosJava;

public class GradeChecker {
    public static void main(String[] args) {
        int grade = 85;

        if (grade >= 90) {
            System.out.println("Excelente!");
        } else if (grade >= 80) {
           System.out.println("Muito bom!"); 
        } else if (grade >= 70) {
            System.out.println("Bom!");
        } else if (grade >= 60) {
            System.out.println("Satisfatorio!");
        } else {
            System.out.println("Precisa melhorar!");
        }
    }
}
