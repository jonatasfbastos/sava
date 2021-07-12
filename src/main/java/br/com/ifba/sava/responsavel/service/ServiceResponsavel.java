/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.responsavel.service;

import br.com.ifba.sava.responsavel.dao.DaoResponsavel;
import br.com.ifba.sava.responsavel.dao.IDaoResponsavel;
import br.com.ifba.sava.responsavel.model.Responsavel;
import br.com.ifba.sava.infrastructure.exception.BusinessException;
import java.util.List;


/**
 *
 * @author Monique
 */
public class ServiceResponsavel implements IServiceResponsavel {
    
    //mensagem de erro se o Responsável for null;
    public final static String RESPONSAVEL_NULL = "RESPONSÁVEL null";
    
    //mensagem de erro se o Responsável já existe;
    public final static String RESPONSAVEL_EXISTE = "RESPONSÁVEL já existe,";
    
    //mensagem de erro se o Responsável não existir no banco;
    public final static String RESPONSAVEL_NAO_EXISTE = "RESPONSÁVEL não existe na base de dados";
    
    //mensagem de erro se o Responsável for inválido;
    public final static String RESPONSAVEL_INVALIDO = "RESPONSÁVEL inválido";
    
    private IDaoResponsavel daoResponsavel = new DaoResponsavel();
    
    @Override
    public Responsavel saveResponsavel(Responsavel responsavel) {
        if(responsavel == null){
            throw new BusinessException(RESPONSAVEL_NULL);
        } else if(daoResponsavel.findById(responsavel.getId()) != null){
            throw new BusinessException(RESPONSAVEL_EXISTE);
        } else{
            return daoResponsavel.save(responsavel);
        }
    }
    @Override
    public Responsavel updateResponsavel(Responsavel responsavel) {
        if(responsavel == null) {
            throw new BusinessException(RESPONSAVEL_NULL);
        } else if(daoResponsavel.findById(responsavel.getId()) == null) {
            throw new BusinessException(RESPONSAVEL_NAO_EXISTE);
        } else {
            return daoResponsavel.update(responsavel);
        }
    }
    @Override
    public List<Responsavel> getAllResponsavel() {
        return daoResponsavel.findAll();
    }
    @Override
    public void deleteResponsavel(Responsavel responsavel) {
        if(responsavel == null) {
            throw new BusinessException(RESPONSAVEL_NULL);
        } else if(daoResponsavel.findById(responsavel.getId()) == null) {
            throw new BusinessException(RESPONSAVEL_NAO_EXISTE);
        } else {
            daoResponsavel.delete(responsavel);
        }
    }
     
}
