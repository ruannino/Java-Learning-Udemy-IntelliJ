package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

    public static void main(String[] args) {
        // Ler num1
        // Ler num2
        // Qual operação (+ - * / %)
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o primeiro valor: ");
        double valor1 = teclado.nextDouble();

        System.out.println("Informe o segundo valor: ");
        double valor2 = teclado.nextDouble();

        System.out.println("Informe a operação: ");
        String op = teclado.next();

        // Lógica
        double resultado = "+".equals(op) ? valor1 + valor2 : 0;
        resultado = "-".equals(op) ? valor1 - valor2 : resultado;
        resultado = "*".equals(op) ? valor1 * valor2 : resultado;
        resultado = "/".equals(op) ? valor1 / valor2 : resultado;
        resultado = "%".equals(op) ? valor1 % valor2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f", valor1, op, valor2, resultado);

        teclado.close();
    }
}
