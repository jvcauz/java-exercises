import Operacoes.*;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float n1, n2;

        System.out.println("---- CALCULADORA ----\n");

        System.out.println("Escolha o primeiro número: ");
        n1 = sc.nextFloat();

        System.out.println("Escolha o segundo número:");
        n2 = sc.nextFloat();

        System.out.println("Qual operação " + n1 + " e " + n2 + " devem fazer?");
        System.out.println("(mais ou +, menos ou -, vezes ou *, dividido ou /)");
        String escolha = sc.next();

        Operacao operacaoSelecionada = null;

        switch (escolha.toLowerCase()){
            case "mais", "+":
                operacaoSelecionada = new Adicao();
                break;
            case "menos", "-":
                operacaoSelecionada = new Subtracao();
                break;
            case "vezes", "*":
                operacaoSelecionada = new Multiplicacao();
                break;
            case "dividido", "/":
                operacaoSelecionada = new Divisao();
                break;
            default:
                System.out.println("Operação inválida.");
        }

        Calculadora calculadora = new Calculadora(operacaoSelecionada);

        float resultado = calculadora.calcular(n1,n2);
        System.out.println(calculadora.getStringOperacao() + " = " + resultado);

    }
}
