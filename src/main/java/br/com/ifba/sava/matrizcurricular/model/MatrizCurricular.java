/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.matrizcurricular.model;

import br.com.ifba.sava.etapa.model.Etapa;
import br.com.ifba.sava.infrastructure.model.PersistenceEntity;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

/**
 *
 * @author Rafael
 */
@Entity
public class MatrizCurricular extends PersistenceEntity{
    
    private String nome;
    private String codigo;
    
    @OneToMany (fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE}) 
    private List<Etapa> etapa;
    
    public List<Etapa> getEtapa() {
        return etapa;
    }

    public void setEtapa(List<Etapa> etapa) {
        this.etapa = etapa;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }   
}
