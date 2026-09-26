package Operacoes;

public class Calculadora {

    private Operacao operacao;
    private float n1, n2;

    public Calculadora(Operacao operacao) {
        this.operacao = operacao;
    }

    public float calcular(float n1, float n2){
        this.n1 = n1;
        this.n2 = n2;
        return operacao.receberValores(n1, n2);
    }

    public String getStringOperacao() {
        return n1 + " " + operacao.getSimboloOperacao() + " " + n2;
    }
}
