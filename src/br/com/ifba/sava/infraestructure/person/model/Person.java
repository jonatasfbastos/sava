/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.infraestructure.person.model;

import br.com.ifba.sava.infraestructure.address.model.Address;
import br.com.ifba.sava.infraestructure.model.PersistenceEntity;
import br.com.ifba.sava.infraestructure.phone.model.Phone;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author jhinr
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Person extends PersistenceEntity implements Serializable{
    
    @Column(name = "NAME", length=100, nullable=false)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    @Column(name = "LASTNAME", length=100, nullable=false)
    private String lastname;
    /*
    @Column(name = "BIRTHDATE", length=100, nullable=false)
    private String birthDate;
    
    private Address address;
    
    private List<Phone> phones;
    
    private String email;
    
    private int cpf;
    */
}

