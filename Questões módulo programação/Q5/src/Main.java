import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");
        double primeiron = scan.nextDouble();

        System.out.println("Informe o primeiro segundo:");
        double segundon = scan.nextDouble();

        if (primeiron > segundon){
            System.out.println("O primeiro número é maior que o segundo.");
        } else if (segundon > primeiron) {
            System.out.println("O segundo número é maior que o primeiro.");
        } else {
            System.out.println("Os números são iguais.");
        }
        scan.close();
    }
}