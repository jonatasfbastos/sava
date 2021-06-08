/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.aluno.dao;

import br.com.ifba.sava.aluno.model.Aluno;
import br.com.ifba.sava.ifraestrucutre.dao.IBaseDao;

/**
 *
 * @author Tarcio
 */
public interface IDaoAluno extends IBaseDao<Aluno>{
    
    public abstract void deleteAluno(Aluno aluno);
}
