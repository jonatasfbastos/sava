/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.infrastructure.servidor.model;

import br.com.ifba.sava.infrastructure.pessoa.model.Pessoa;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author schaidt
 */
public abstract class Servidor extends Pessoa {
    private String siape;

    public String getSiape(){
        return siape;
    }

    public void setSiape(){
        this.siape = siape;
    }
}

