import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor da hora aula:");
        double horaAula = scan.nextDouble();

        System.out.println("Informe a quantidade de horas trabalhadas:");
        double horasTrabalhadas = scan.nextDouble();

        System.out.println("Informe o desconto porcentual do INSS:");
        double descontoInss = scan.nextDouble();

        double salarioBruto = horaAula * horasTrabalhadas;
        double salarioLiquido = salarioBruto * ( 1 - descontoInss/100);

        System.out.printf("Seu salário bruto é de R$%.2f, seu salário líquido é de R$%.2f",salarioBruto, salarioLiquido);

        scan.close();
    }
}