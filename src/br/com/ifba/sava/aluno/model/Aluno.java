/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.aluno.model;

import br.com.ifba.sava.infraestructure.pessoa.model.Pessoa;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Tarcio
 */
@Entity
@Table(name = "ALUNO")
public class Aluno extends Pessoa implements Serializable{
    
    @Column(name = "NOME", length=100, nullable=false)
    private String nome;
    
    @Column(name = "SOBRENOME", length=100, nullable=false)
    private String sobrenome;
    
    @Column(name = "NASCIMENTO", length=100, nullable=false)
    private String nascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }
    
    
}
