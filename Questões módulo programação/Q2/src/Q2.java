/*
2) Construa um algoritmo utilizando a representação de fluxograma que calcule e informe a
quantidade de gasolina que será preciso colocar no carro e quanto irá custar para o seu dono ir
até a sua fazenda. O usuário deverá informar a distância que será percorrida e o preço do litro
da gasolina. Para o cálculo, sabe-se que o carro faz em média 12 km/litro.
*/

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a distância a ser percorrida:");
        double distancia = scan.nextDouble();

        System.out.println("Informe o preço do litro da gasolina:");
        double precogas = scan.nextDouble();

        double litrosgas = (distancia / 12);
        double precototal = litrosgas * precogas;

        System.out.printf("Serão necessários %.2f litros de gasolina, totalizando R$%.2f", litrosgas, precototal);
    }
}
