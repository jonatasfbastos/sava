/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.professor.dao;

import br.com.ifba.sava.infrastructure.dao.IBaseDao;
import br.com.ifba.sava.professor.model.Professor;

/**
 *
 * @author Alírio Rios
 */
public interface IDaoProfessor extends IBaseDao<Professor>{
    
    public abstract List<Professor> findBySiape(String siape);
}
