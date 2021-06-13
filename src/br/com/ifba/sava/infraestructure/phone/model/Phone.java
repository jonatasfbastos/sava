/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.infraestructure.phone.model;

import br.com.ifba.sava.infraestructure.model.PersistenceEntity;
import com.sun.istack.NotNull;
import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author jhinr
 */
@Entity
public class Phone extends PersistenceEntity implements Serializable{
    
    @NotNull
    private String number;
    
    @NotNull
    private String ddd;
    
    @NotNull
    private String phoneType;
    

    //Metodos Acessores

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }
    //    public Pessoa getPessoa() {
//        return pessoa;
//    }
//
//    public void setPessoa(Pessoa pessoa) {
//        this.pessoa = pessoa;
//    }
}
