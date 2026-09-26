package Operacoes;

public class Multiplicacao implements Operacao {
    @Override
    public float receberValores(float n1, float n2) {
        return n1 * n2;
    }

    @Override
    public char getSimboloOperacao() {
        return '*';
    }
}
