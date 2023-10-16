import java.util.Scanner;

public class TotalEletrons {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
    
        System.out.println("Digite a configuração eletrônica: ");
        String config = scan.nextLine();
    
        int total = 0;
        for (int i = 0; i < config.length(); i++) {
            if (Character.isDigit(config.charAt(i))) {
                total += Character.getNumericValue(config.charAt(i));
            }
        }
        System.out.println("O átomo possui " + total + " elétrons");
        
        scan.close();
    
        }
}
