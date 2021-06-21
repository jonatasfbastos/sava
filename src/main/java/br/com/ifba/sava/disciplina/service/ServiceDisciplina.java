/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.disciplina.service;

import br.com.ifba.sava.disciplina.dao.DaoDisciplina;
import br.com.ifba.sava.disciplina.dao.IDaoDisciplina;
import br.com.ifba.sava.disciplina.model.Disciplina;
import br.com.ifba.sava.infrastructure.exception.BusinessException;
import java.util.List;

/**
 *
 * @author pedro_14b4yz1
 */
public class ServiceDisciplina implements IServiceDisciplina{

    //mensagem de erro se a Disciplina for null;
    public final static String DISCIPLINA_NULL = "DISCIPLINA null";
    
    //mensagem de erro se a Disciplina já existir;
    public final static String DISCIPLINA_EXISTE = "DISCIPLINA já existe,";
    
    //mensagem de erro se a Disciplina não existir no banco;
    public final static String DISCIPLINA_NAO_EXISTE = "DISCIPLINA não existe na base de dados";
    
    //mensagem de erro se a Disciplina for inválida;
    public final static String DISCIPLINA_INVALIDO = "DISCIPLINA inválido";
    
    private IDaoDisciplina daoDisciplina = new DaoDisciplina();
    
    
    @Override
    public Disciplina saveDisciplina(Disciplina disciplina) {
        if(disciplina == null) {
            throw new BusinessException(DISCIPLINA_NULL);
        } else if(daoDisciplina.findById(disciplina.getId()) != null) {
            throw new BusinessException(DISCIPLINA_EXISTE);
        } else {
            return daoDisciplina.save(disciplina);
        }
    }
    
    
    @Override
    public List<Disciplina> getAllDisciplinas() {
        return daoDisciplina.findAll();
    }
    
    @Override
    public Disciplina updateDisciplina(Disciplina disciplina) {
          if(disciplina == null) {
            throw new BusinessException(DISCIPLINA_NULL);
        } else if(daoDisciplina.findById(disciplina.getId()) == null) {
            throw new BusinessException(DISCIPLINA_NAO_EXISTE);
        } else {
            return daoDisciplina.update(disciplina);
        }
    }
   
    @Override
    public void removeDisciplina(Disciplina disciplina) {
        if(disciplina == null) {
            throw new BusinessException(DISCIPLINA_NULL);
        } else if(daoDisciplina.findById(disciplina.getId()) == null) {
            throw new BusinessException(DISCIPLINA_NAO_EXISTE);
        } else {
            daoDisciplina.delete(disciplina);
        }
    }

    

    
    
}
