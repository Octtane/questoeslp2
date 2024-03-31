import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double PI = 3.14;

        System.out.println("Informe o raio da circunferência:");
        double raio = scan.nextDouble();

        double area = PI * raio * raio;

        System.out.println("A área da circunferência é " + area);

        scan.close();
    }
}