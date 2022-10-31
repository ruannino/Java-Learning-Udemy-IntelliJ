package fundamentos.exercicos.conceitosBasicos;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        // 2. Criar um programa que leia a temperatura
        // em Celsius e converta para Fahrenheit.
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a temperatura em Graus Celsius: ");
        double celsius = teclado.nextDouble();

        double formula = (celsius * 1.8) + 32;
        System.out.printf("A temperatura em Fahrenheit é de %.2f C°", formula);

        teclado.close();
    }
}
