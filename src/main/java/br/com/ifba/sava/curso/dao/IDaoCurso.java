/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.curso.dao;

import br.com.ifba.sava.curso.model.Curso;
import br.com.ifba.sava.infrastructure.dao.IBaseDao;
import java.util.List;

/**
 *
 * @author Gusdb
 */
public interface IDaoCurso extends IBaseDao<Curso>{
    
    public abstract List<Curso> findByName(String name);

}
