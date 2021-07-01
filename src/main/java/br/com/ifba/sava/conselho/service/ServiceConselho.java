/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.conselho.service;

import br.com.ifba.sava.conselho.dao.DaoConselho;
import br.com.ifba.sava.conselho.dao.IDaoConselho;
import br.com.ifba.sava.conselho.model.Conselho;
import br.com.ifba.sava.infrastructure.exception.BusinessException;
import java.util.List;

/**
 *
 * @author Tarcio
 */
public class ServiceConselho implements IServiceConselho{
    
    
    //mensagem de erro se o Conselho for null;
    public final static String CONSELHO_NULL = "CONSELHO null";
    
    //mensagem de erro se o Conselho já existir;
    public final static String CONSELHO_EXISTE = "CONSELHO já existe,";
    
    //mensagem de erro se o Conselho não existir no banco;
    public final static String CONSELHO_NAO_EXISTE = "CONSELHO não existe na base de dados";
    
    //mensagem de erro se o Conselho for inválido;
    public final static String CONSELHO_INVALIDO = "CONSELHO inválido";
    
    
    private IDaoConselho daoConselho = new DaoConselho();
    
    
    
    @Override
    public Conselho saveConselho(Conselho conselho) {
        if(conselho == null) {
            throw new BusinessException(CONSELHO_NULL);
        } else if(daoConselho.findById(conselho.getId()) != null) {
            throw new BusinessException(CONSELHO_EXISTE);
        } else {
            return daoConselho.save(conselho);
        }
    }

    @Override
    public List<Conselho> getAllConselho() {
        return daoConselho.findAll();
    }

    @Override
    public Conselho updateConselho(Conselho conselho) {
        if(conselho == null) {
            throw new BusinessException(CONSELHO_NULL);
        } else if(daoConselho.findById(conselho.getId()) == null) {
            throw new BusinessException(CONSELHO_NAO_EXISTE);
        } else {
            return daoConselho.update(conselho);
        }
    }

    @Override
    public void removeConselho(Conselho conselho) {
        if(conselho == null) {
            throw new BusinessException(CONSELHO_NULL);
        } else if(daoConselho.findById(conselho.getId()) == null) {
            throw new BusinessException(CONSELHO_NAO_EXISTE);
        } else {
            daoConselho.delete(conselho);
        }
    }
    
}
