import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe sua idade:");
        int idade = scan.nextInt();

        if (idade < 0) {
            System.out.println("Escreva uma idade válida.");
        }else if (idade < 18) {
            System.out.println("Você não pode tirar uma carteira de motorista...");
        }else {
            System.out.println("Você pode tirar sua carteira de motorista!");
        }

        scan.close();
    }
}