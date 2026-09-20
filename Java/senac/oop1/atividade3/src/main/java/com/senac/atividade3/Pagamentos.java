package com.senac.atividade3;

import com.senac.atividade3.impostos.Imposto;
import java.util.ArrayList;

/**
 *
 * @author joaov
 */
public class Pagamentos {
    
    private String nomeEmpresa;
    public ArrayList<Imposto> impostos;
    
    public Pagamentos(){
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }
}
