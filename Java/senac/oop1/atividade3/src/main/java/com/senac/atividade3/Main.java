package com.senac.atividade3;

import com.senac.atividade3.impostos.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author joaov
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Pagamentos pagamento = new Pagamentos();
        pagamento.impostos = new ArrayList<>();
        
        System.out.println("----- CADASTRO NO SISTEMA DE CONTABILIDADE -----");
        System.out.println("Digite o nome da empresa: ");
        pagamento.setNomeEmpresa(sc.nextLine());
        
        String parar = "";
        while (!parar.equalsIgnoreCase("pare")) {
            //CODIGAO
            System.out.println("Digite o tipo de imposto: ");
            String tipoImposto = sc.nextLine();
            
            if (tipoImposto.equalsIgnoreCase("pis")) {
                pagamento.impostos.add(cadastrarPis(sc));
            } else if (tipoImposto.equalsIgnoreCase("ipi")) {
                pagamento.impostos.add(cadastrarIpi(sc));
            } else {
                System.out.println("Esse tipo de imposto nao existe.");
            }
            
            System.out.println("\nDeseja parar?");
            parar = sc.nextLine();
        }
        
        System.out.println("\nLista de impostos da empresa " + pagamento.getNomeEmpresa() + ":");
        
        for(int i = 0; i < pagamento.impostos.size(); i++){
            System.out.println("------------------------------");
            System.out.println("IMPOSTO " + (i + 1));
            pagamento.impostos.get(i).mostrarInfos();
        }
    }
    
    public static PIS cadastrarPis(Scanner sc){
        PIS pis = new PIS();
                
        System.out.println("Digite o valor do debito: ");
        pis.setDebito(sc.nextFloat());
        System.out.println("Digite o valor do credito: ");
        pis.setCredito(sc.nextFloat());
        sc.nextLine(); // LIMPA O BUFFER
        
        pis.calcular();
        return pis;
    }
    
    public static IPI cadastrarIpi(Scanner sc){
        IPI ipi = new IPI();

        System.out.println("Digite o valor do produto: ");
        ipi.setValorProduto(sc.nextFloat());
        System.out.println("Digite o valor do frete: ");
        ipi.setFrete(sc.nextFloat());
        System.out.println("Digite o valor do seguro: ");
        ipi.setSeguro(sc.nextFloat());
        System.out.println("Digite o valor das despesas: ");
        ipi.setDespesas(sc.nextFloat());
        System.out.println("Digite em porcentagem a aliquota: ");
        ipi.setValorAliquota(sc.nextFloat());
        sc.nextLine(); // LIMPA O BUFFER
                
        ipi.calcular();
        return ipi;
    }
}
