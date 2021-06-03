/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.infraestructure.endereco.model;

import br.com.ifba.sava.infraestructure.model.PersistenceEntity;
import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author jhinr
 */
@Entity
public class Endereco extends PersistenceEntity implements Serializable{
    
    private int numero;
    
    private String complemento;
    
    private String rua;
    
    private String bairro;
    
    private String cidade;
    
    private String cep;
    
    private String uf;
    
//    @OneToOne(mappedBy = "endereco")
//    private Pessoa pessoa;
    
    // Métodos acessores
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

//    public Pessoa getPessoa() {
//        return pessoa;
//    }

//    public void setPessoa(Pessoa pessoa) {
//        this.pessoa = pessoa;
//    }

}
