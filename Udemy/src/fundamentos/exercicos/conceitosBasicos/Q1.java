package fundamentos.exercicos.conceitosBasicos;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        // 1. Criar um programa que leia a temperatura
        // em Fahrenheit e converta para Celcius.

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit: ");
        double temperaturaF = teclado.nextDouble();

        final double FATOR = 5.0 / 9.0;
        final double AJUSTE = 32;
        double celcius = (temperaturaF - AJUSTE) * FATOR;

        System.out.printf("O resultado é %.2f ºC.", celcius);

        teclado.close();
    }
}
