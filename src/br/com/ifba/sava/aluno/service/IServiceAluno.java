/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.aluno.service;

import br.com.ifba.sava.aluno.model.Aluno;

/**
 *
 * @author Tarcio
 */
public interface IServiceAluno {
    
    //salva o aluno
    public abstract Aluno saveAluno(Aluno aluno);
    //deleta aluno
    public abstract void deleteAluno(Aluno aluno);
}
