/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.curso.model;

import br.com.ifba.sava.infrastructure.model.PersistenceEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Gustavo
 */

@Entity
@Table (name = "CURSO")
public class Curso extends PersistenceEntity{
    
    @Column (name="NOME", length=100, nullable=false)
    private String nome;
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome(String nome) {
        return nome;
    }
}
