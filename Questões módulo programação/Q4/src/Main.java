import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe sua temperatura:");
        double temperatura = scan.nextDouble();

        if (temperatura < 35) {
            System.out.println("Você está com hipotermia.");
        } else if (temperatura > 37) {
            System.out.println("Você está com febre.");
        } else {
            System.out.println("Sua temperatura está normal.");
        }

        scan.close();
    }
}