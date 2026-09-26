package Operacoes;

public class Divisao implements Operacao {
    @Override
    public float receberValores(float n1, float n2) {
        if (n2 != 0){
            return n1 / n2;
        } else {
            System.out.println("Erro: Divisão por zero.");
            return Float.MIN_VALUE;
        }
    }

    @Override
    public char getSimboloOperacao() {
        return '/';
    }
}
