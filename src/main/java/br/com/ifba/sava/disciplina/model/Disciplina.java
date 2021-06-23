/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.disciplina.model;

import br.com.ifba.sava.infrastructure.model.PersistenceEntity;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author pedro_14b4yz1
 */
@Entity
@Table (name = "DISCIPLINA")
public class Disciplina extends PersistenceEntity{
    
    private String nome;
    private String codigo;

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
