package fundamentos.exercicos.conceitosBasicos;

import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        // 5. Criar um programa que leia o valor base
        // e da altura de um triângulo e calcule a área.
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor da base do triângulo: ");
        double base = teclado.nextDouble();

        System.out.println("Digite o valor da altura do triângulo: ");
        double altura = teclado.nextDouble();

        double area = (base * altura) / 2;
        System.out.println("A área do triângulo é : " + area + ".");

        teclado.close();
    }
}
