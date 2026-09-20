package com.senac.atividade3.impostos;

/**
 *
 * @author joaov
 */
public abstract class Imposto implements Calculavel {
    
    @Override
    public float calcular() {
        return 0;
    }
    
    public abstract void mostrarInfos();
}
