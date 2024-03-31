//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int valorhora = 20;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de horas trabalhadas");
        int horas = scanner.nextInt();

        int salario = valorhora * horas;

        System.out.println("Seu salário é de "+salario+ " reais.");


    }
    }
