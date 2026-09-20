package com.senac.atividade3.impostos;

/**
 *
 * @author joaov
 */
public class IPI extends Imposto {
    
    private float 
            valorAliquota,
            valorProduto,
            frete,
            seguro,
            despesas;

    public IPI(){
    }

    public float getValorAliquota() {
        return valorAliquota;
    }

    public void setValorAliquota(float valorAliquota) {
        this.valorAliquota = valorAliquota;
    }

    public float getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(float valorProduto) {
        this.valorProduto = valorProduto;
    }

    public float getFrete() {
        return frete;
    }

    public void setFrete(float frete) {
        this.frete = frete;
    }

    public float getSeguro() {
        return seguro;
    }

    public void setSeguro(float seguro) {
        this.seguro = seguro;
    }

    public float getDespesas() {
        return despesas;
    }

    public void setDespesas(float despesas) {
        this.despesas = despesas;
    }
    
    @Override
    public float calcular(){
        return (valorProduto+frete+seguro+despesas) * (valorAliquota/100);
    }
    
    @Override
    public void mostrarInfos() {
        System.out.println("Tipo de Imposto: \"IPI\"");
        System.out.println("Valor do produto: "+ this.getValorProduto());
        System.out.println("Valor do frete: "+ this.getFrete());
        System.out.println("Valor do seguro: "+ this.getSeguro());
        System.out.println("Valor das despesas: "+ this.getDespesas());
        System.out.println("Porcentagem da aliquota: "+ this.getValorAliquota() + "%");
        System.out.println("Total: R$"+ this.calcular());
    }
}
