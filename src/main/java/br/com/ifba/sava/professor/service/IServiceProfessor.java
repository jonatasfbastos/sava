/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.professor.service;

import br.com.ifba.sava.professor.model.Professor;

/**
 *
 * @author Alírio Rios
 */
public interface IServiceProfessor {
    
    //salva o professor
    public abstract Professor saveProfessor(Professor prof);
    //deleta o professor
    public abstract void deleteProfessor(Professor prof);
    //atualiza o professor
    public abstract Professor updateProfessor(Professor prof);
    
    
}
