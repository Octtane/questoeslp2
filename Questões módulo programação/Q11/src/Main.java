import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro valor:");
        double primeiron = scan.nextDouble();

        System.out.println("Informe o segundo valor:");
        double segundon = scan.nextDouble();

        double soma = primeiron + segundon;

        if (soma >= 10) {
            soma = soma + 5;
            System.out.println("O novo resultado é " + soma);
        } else {
            soma = soma - 7;
            System.out.println("O novo resultado é " + soma);
        }

        scan.close();
    }
}