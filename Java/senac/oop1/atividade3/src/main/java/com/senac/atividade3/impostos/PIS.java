package com.senac.atividade3.impostos;

/**
 *
 * @author joaov
 */
public class PIS extends Imposto {
    
    private float debito, credito;
    private final float porcPis = 1.65f/100;

    public PIS() {
    }

    public float getDebito() {
        return debito;
    }

    public void setDebito(float debito) {
        this.debito = debito;
    }

    public float getCredito() {
        return credito;
    }

    public void setCredito(float credito) {
        this.credito = credito;
    }
    
    @Override
    public float calcular(){
        return (debito - credito) * porcPis;
    }
    
    @Override
    public void mostrarInfos() {
        System.out.println("Tipo de Imposto: \"PIS\"");
        System.out.println("Valor do debito: "+ this.getDebito());
        System.out.println("Valor do credito: "+ this.getCredito());
        System.out.println("Porcentagem fixa: 1,65%");
        System.out.println("Total: R$"+ this.calcular());
    }
}
