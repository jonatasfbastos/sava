/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.curso.model;

import br.com.ifba.sava.infrastructure.model.PersistenceEntity;
import br.com.ifba.sava.matrizcurricular.model.MatrizCurricular;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
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
    
    @OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private MatrizCurricular matrizCurricular;
    
    /*@OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Servidor cordenador;
    
    public void setServidor(Servidor servidor) {
        this.servidor = servidor;
    }
    public Servidor getServidor() {
        return nome;
    }
    */
    
     public void setMatrizCurricular(MatrizCurricular matrizCurricular) {
        this.matrizCurricular = matrizCurricular;
    }
    public MatrizCurricular MatrizCurricular() {
        return matrizCurricular;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
}
