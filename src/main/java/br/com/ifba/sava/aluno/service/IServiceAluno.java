/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.aluno.service;

import br.com.ifba.sava.aluno.model.Aluno;
import java.util.List;

/**
 *
 * @author Tarcio
 * edited by rafael
 */
public interface IServiceAluno {
    
    //salva o aluno
    public abstract Aluno saveAluno(Aluno aluno);
    //deleta aluno
    public abstract void deleteAluno(Aluno aluno);
    
    public abstract Aluno updateAluno(Aluno aluno);
    // Metodo que retorna todos os Alunos da base de dados
    public abstract List<Aluno> getAllAluno();
    
    public List<Aluno> findByName(String name);
}
