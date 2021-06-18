/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.aluno.dao;

import br.com.ifba.sava.aluno.model.Aluno;
import br.com.ifba.sava.infrastructure.dao.IBaseDao;
import java.util.List;

/**
 *
 * @author Tarcio
 */
public interface IDaoAluno extends IBaseDao<Aluno>{
 
    public abstract List<Aluno> findByName(String name);
    
}
