package fundamentos.operadores;

public class Ternario {

    public static void main(String[] args) {

        double media = 8.6;
        String resultadoParcial = media >= 5.0 ?
                "em recuperação." : "reprovado.";

        String resultadoFinal = media >= 7.0 ?
                "aprovado." : resultadoParcial;

        System.out.println("O aluno está " + resultadoFinal);

        boolean bomComportamento = true;
        boolean passouPorMedia = media >= 7;
        boolean temDesconto = bomComportamento && passouPorMedia;
        String resultado = temDesconto ? "Sim." : "Não.";

        System.out.printf("Passou por média ? %s ", passouPorMedia);
        System.out.printf("\nTem desconto? %s ", resultado);
    }
}
