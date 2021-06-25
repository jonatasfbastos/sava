/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.avaliacaoturma.model;

import br.com.ifba.sava.avaliacaoturma.dao.IDaoAvaliacaoTurma;
import br.com.ifba.sava.infrastructure.model.PersistenceEntity;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author pedro_14b4yz1
 */

public class AvaliacaoTurma extends PersistenceEntity{
    
    private int idAvalTurma;
    private boolean relatorioGerado;

    public int getIdAvalTurma() {
        return idAvalTurma;
    }

    public void setIdAvalTurma(int idAvalTurma) {
        this.idAvalTurma = idAvalTurma;
    }

    public boolean isRelatorioGerado() {
        return relatorioGerado;
    }

    public void setRelatorioGerado(boolean relatorioGerado) {
        this.relatorioGerado = relatorioGerado;
    }
    
}
