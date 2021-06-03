/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.infraestructure.telefone.service;

import br.com.ifba.sava.infraestructure.exception.BusinessException;
import br.com.ifba.sava.infraestructure.support.StringUtil;
import br.com.ifba.sava.infraestructure.telefone.dao.DaoTelefone;
import br.com.ifba.sava.infraestructure.telefone.dao.IDaoTelefone;
import br.com.ifba.sava.infraestructure.telefone.model.Telefone;
import java.util.List;

/**
 *
 * @author jhinr
 */
public class ServiceTelefone implements IServiceTelefone{

    /**
     * Representa messagem de erro quando o endereço for null
     */
    private final static String TELE_NULL = "Telefone null";
    
    /**
     * Representa messagem de erro quando o endereço for inválido
     */
    private final static String TELE_INVALIDO = "Telefone inválido";
    
    /**
     * Representa messagem de erro quando o endereço não existir na base de dados
     */
    private final static String TELE_NAO_EXISTE = "Telefone ainda não existe";
    
    /**
     * Atriburo que faz a comunicação com a camada dao
     */
    private final IDaoTelefone daoTelefone = new DaoTelefone();
    
    @Override
    public Telefone saveTelefone(Telefone telefone) {
       if(this.validaTelefone(telefone) == false) {
           throw new BusinessException(TELE_NULL);
       }
       
       if(this.telefoneExiste(telefone)) {
           throw new BusinessException("Telefone já existe");
       }
       
       return this.daoTelefone.save(telefone);
    }

    @Override
    public Telefone updateTelefone(Telefone telefone) {
        if(this.validaTelefone(telefone) == false) {
           throw new BusinessException(TELE_NULL);
       }
       
       if(this.telefoneExiste(telefone) == false) {
           throw new BusinessException(TELE_NAO_EXISTE);
       }
       
       return this.daoTelefone.update(telefone);
    }

    @Override
    public void deleteTelefone(Telefone telefone) {
        if(telefone == null) {
            throw new BusinessException(TELE_NULL);
        }
        
        if(this.telefoneExiste(telefone) == false) {
           throw new BusinessException(TELE_NAO_EXISTE);
        }
        
       this.daoTelefone.delete(telefone);
    }

    @Override
    public List<Telefone> getAllTelefone() {
        return this.daoTelefone.findAll();
    }

    /**
     * 
     * @param telefone
     * @return false se algum atributo estiver irregular
     */
    private boolean validaTelefone(Telefone telefone) {
        
        StringUtil util = StringUtil.getInstance();
        
        if(telefone == null) {
            throw new BusinessException(TELE_NULL);
        }
        
        if(util.isNullOrEmpty(telefone.getNumero())) {
            throw new BusinessException(TELE_INVALIDO);
        }
        
        if(util.isNullOrEmpty(telefone.getDdd())) {
            throw new BusinessException(TELE_INVALIDO);
        }
        
        if(util.isNullOrEmpty(telefone.getTipoTelefine())) {
            throw new BusinessException(TELE_INVALIDO);
        }
                
        return true;
    }
    
    /**
     * 
     * @param telefone
     * @return true se telefone já existir (id) na base de dados
     */
    private boolean telefoneExiste(Telefone telefone) {
        return this.daoTelefone.findById(telefone.getId()) == telefone;
    }
    
}
