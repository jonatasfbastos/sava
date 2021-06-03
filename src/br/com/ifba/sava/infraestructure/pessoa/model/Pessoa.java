/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.infraestructure.pessoa.model;

import br.com.ifba.sava.infraestructure.endereco.model.Endereco;
import br.com.ifba.sava.infraestructure.model.PersistenceEntity;
import br.com.ifba.sava.infraestructure.telefone.model.Telefone;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author jhinr
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Pessoa extends PersistenceEntity implements Serializable{
    
    @OneToOne
    private Endereco endereco;
    
    @OneToMany
    private List<Telefone> telefones;
    
    private String email;

    //Métodos Acessores
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

//    public List<Telefone> getTelefones() {
//        return telefones;
//    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
      
}

