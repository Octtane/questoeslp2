import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe sua altura em centímetros:");
        double altura = scan.nextDouble() / 100;

        System.out.println("Informe seu peso em quilos:");
        double peso = scan.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso.");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Você está com o peso ideal.");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Você está com sobrepeso.");
        } else if (imc >= 30) {
            System.out.println("Você está obeso.");
        }

        scan.close();
    }
}