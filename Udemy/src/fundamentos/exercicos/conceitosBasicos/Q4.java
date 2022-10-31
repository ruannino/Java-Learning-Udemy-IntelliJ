package fundamentos.exercicos.conceitosBasicos;

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        // 4. Criar um programa que leia um valor
        // e apresente os resultados ao quadrado
        // e ao cubo do valor.
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor que deseja calcular: ");
        double valor = teclado.nextDouble();

        double valorQuadrado = Math.pow(valor, 2);
        double valorCubo = Math.pow(valor, 3);

        System.out.printf("O valor digitado foi %.2f. " +
                        "\nEste valor ao quadrado é %.2f." +
                        "\nEste valor ao cubo é %.2f.",
                valor, valorQuadrado, valorCubo);

        teclado.close();
    }
}
