/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.curso.service;

import br.com.ifba.sava.curso.dao.DaoCurso;
import br.com.ifba.sava.curso.dao.IDaoCurso;
import br.com.ifba.sava.curso.model.Curso;
import br.com.ifba.sava.infrastructure.exception.BusinessException;
import java.util.List;

/**
 *
 * @author Gusdb
 * edited by Rafael
 */
public class ServiceCurso implements IServiceCurso{
    
    //mensagem de erro se o curso for null;
    public final static String CURSO_NULL = "Curso null";
    
    //mensagem de erro se curso já existir;
    public final static String CURSO_EXISTE = "O curso já existe,";
    
    //mensagem de erro se curso não existir no banco;
    public final static String CURSO_NAO_EXISTE = "O curso não existe na base de dados";
    
    //mensagem de erro se curso for inválido;
    public final static String CURSO_INVALIDA = "Curso inválida";
    
    private final IDaoCurso daoCurso = new DaoCurso();

    @Override
    public Curso saveCurso(Curso curso) {
        if(curso == null) {
                throw new BusinessException(CURSO_NULL);
            } else if(daoCurso.findById(curso.getId()) != null) {
                throw new BusinessException(CURSO_EXISTE);
            } else {
                return daoCurso.save(curso);
            }
    }

    @Override
    public void deleteCurso(Curso curso) {
        if(curso == null) {
            throw new BusinessException(CURSO_NULL);
        } else if(daoCurso.findById(curso.getId()) == null) {
            throw new BusinessException(CURSO_NAO_EXISTE);
        } else {
            daoCurso.delete(curso);
        }
    }

    @Override
    public Curso updateCurso(Curso curso) {
    if(curso == null) {
            throw new BusinessException(CURSO_NULL);
        } else if(daoCurso.findById(curso.getId()) == null) {
            throw new BusinessException(CURSO_NAO_EXISTE);
        } else {
            return daoCurso.update(curso);
        }
    }

    @Override
    public Curso findCurso(Curso curso) {
        if(curso == null) {
            throw new BusinessException(CURSO_NULL);
        } else if(daoCurso.findById(curso.getId()) == null) {
            throw new BusinessException(CURSO_NAO_EXISTE);
        } else {
            return daoCurso.findById(curso.getId());
        }
    }
    
    @Override
    public List<Curso> getAllCurso() {
        return this.daoCurso.findAll();
    }

    @Override
    public List<Curso> findCursoByName(Curso curso) {
        List<Curso> lista = daoCurso.findCursoByName(curso);
        if(lista.size()<1){
           throw new BusinessException(CURSO_NULL); 
        }
        return lista;
    }
}
