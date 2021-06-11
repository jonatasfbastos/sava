/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.aluno.model;

import br.com.ifba.sava.curso.model.Curso;
import br.com.ifba.sava.infraestructure.pessoa.model.Pessoa;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Tarcio
 */
@Entity
@Table(name = "ALUNO")
public class Aluno extends Pessoa{
    
    @OneToOne
    private int matricula;
    
    @OneToOne
    private Curso curso;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
             
}
