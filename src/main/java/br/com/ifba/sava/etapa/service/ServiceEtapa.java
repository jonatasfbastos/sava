/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.etapa.service;

import br.com.ifba.sava.etapa.dao.DaoEtapa;
import br.com.ifba.sava.etapa.dao.IDaoEtapa;
import br.com.ifba.sava.etapa.model.Etapa;
import br.com.ifba.sava.infrastructure.exception.BusinessException;
import java.util.List;

/**
 *
 * @author jhinr
 */
public class ServiceEtapa implements IServiceEtapa{
    
    //mensagem de erro se a Disciplina for null;
    public final static String ETAPA_NULL = "ETAPA null";
    
    //mensagem de erro se a Disciplina já existir;
    public final static String ETAPA_EXISTE = "ETAPA já existe,";
    
    //mensagem de erro se a Disciplina não existir no banco;
    public final static String ETAPA_NAO_EXISTE = "ETAPA não existe na base de dados";
    
    //mensagem de erro se a Disciplina for inválida;
    public final static String ETAPA_INVALIDO = "ETAPA inválido";
    
    private IDaoEtapa daoEtapa = new DaoEtapa();
    
    @Override
    public Etapa saveEtapa(Etapa etapa) {
        if(etapa == null) {
            throw new BusinessException(ETAPA_NULL);
        } else if(daoEtapa.findById(etapa.getId()) != null) {
            throw new BusinessException(ETAPA_EXISTE);
        } else {
            return daoEtapa.save(etapa);
        }
    }
    
    @Override
    public List<Etapa> getAllEtapa() {
        return daoEtapa.findAll();
    }
    
    @Override
    public Etapa updateEtapa(Etapa etapa) {
          if(etapa == null) {
            throw new BusinessException(ETAPA_NULL);
        } else if(daoEtapa.findById(etapa.getId()) == null) {
            throw new BusinessException(ETAPA_NAO_EXISTE);
        } else {
            return daoEtapa.update(etapa);
        }
    }
   
    @Override
    public void removeEtapa(Etapa etapa) {
        if(etapa == null) {
            throw new BusinessException(ETAPA_NULL);
        } else if(daoEtapa.findById(etapa.getId()) == null) {
            throw new BusinessException(ETAPA_NAO_EXISTE);
        } else {
            daoEtapa.delete(etapa);
        }
    }
}
