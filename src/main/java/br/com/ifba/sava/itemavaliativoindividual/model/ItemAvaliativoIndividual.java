/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.itemavaliativoindividual.model;

import br.com.ifba.sava.infrastructure.model.PersistenceEntity;

/**
 *
 * @author Alírio Rios
 */
public class ItemAvaliativoIndividual extends PersistenceEntity{
    
    private String nome;
    private String descricao;
    
//============================================ MÉTODOS ACESSORES E MODIFICADORES
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
