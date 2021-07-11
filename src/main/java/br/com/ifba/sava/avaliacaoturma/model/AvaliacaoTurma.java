/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.avaliacaoturma.model;

import br.com.ifba.sava.avaliacaoturma.dao.IDaoAvaliacaoTurma;
import br.com.ifba.sava.infrastructure.model.PersistenceEntity;
import br.com.ifba.sava.itemavaliativoindividual.model.ItemAvaliativoIndividual;
import br.com.ifba.sava.turma.model.Turma;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author pedro_14b4yz1
 */
@Entity
public class AvaliacaoTurma extends PersistenceEntity{
    
    private int idAvalTurma;
    private boolean relatorioGerado;
    
    @OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Turma turma;
    
    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<ItemAvaliativoIndividual> itemAvaliativoIndividual;

    public List<ItemAvaliativoIndividual> getItemAvaliativoIndividual() {
        return itemAvaliativoIndividual;
    }

    public void setItemAvaliativoIndividual(List<ItemAvaliativoIndividual> itemAvaliativoIndividual) {
        this.itemAvaliativoIndividual = itemAvaliativoIndividual;
    }
    
    

    
    
    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    
    

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
