/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.infrastructure.model;

import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author JONATAS BASTOS
 */

//

//Classe que as entidades irão herdar
@MappedSuperclass
public class PersistenceEntity{
        
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
        
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
