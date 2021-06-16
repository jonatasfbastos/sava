/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.disciplina.service;

import br.com.ifba.sava.disciplina.model.Disciplina;

/**
 *
 * @author pedro_14b4yz1
 */
public interface IServiceDisciplina {
    
    public abstract Disciplina saveDisciplina(Disciplina disciplina);
    public abstract void removeDisciplina(Disciplina disciplina);
}
