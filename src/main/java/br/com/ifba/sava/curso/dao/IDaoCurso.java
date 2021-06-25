/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.curso.dao;

import br.com.ifba.sava.curso.model.Curso;
import br.com.ifba.sava.infrastructure.dao.IBaseDao;

/**
 *
 * @author Gusdb
 */
public interface IDaoCurso extends IBaseDao<Curso>{
    
    public abstract boolean saveCurso (Curso curso);//salvar curso
    
    public abstract boolean deleteCurso (Curso curso);//deletar curso
    
}
