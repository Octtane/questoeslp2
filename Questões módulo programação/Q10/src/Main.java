import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro valor:");
        double primeiron = scan.nextDouble();

        System.out.println("Informe o segundo valor:");
        double segundon = scan.nextDouble();

        double soma = primeiron + segundon;

        if (soma > 10) {
            System.out.println("O resultado " + soma + " é maior que 10.");
        } else {
            System.out.println("O resultado " + soma + " é menor que 10.");
        }

        scan.close();
    }
}