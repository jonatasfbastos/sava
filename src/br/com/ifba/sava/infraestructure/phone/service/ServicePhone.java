/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.infraestructure.phone.service;

import br.com.ifba.sava.infraestructure.exception.BusinessException;
import br.com.ifba.sava.infraestructure.support.StringUtil;
import br.com.ifba.sava.infraestructure.phone.dao.DaoPhone;
import br.com.ifba.sava.infraestructure.phone.model.Phone;
import java.util.List;
import br.com.ifba.sava.infraestructure.phone.dao.IDaoPhone;

/**
 *
 * @author jhinr
 */
public class ServicePhone implements IServicePhone{

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
    private final IDaoPhone daoTelefone = new DaoPhone();
    
    @Override
    public Phone saveTelefone(Phone telefone) {
       if(this.validaTelefone(telefone) == false) {
           throw new BusinessException(TELE_NULL);
       }
       
       if(this.telefoneExiste(telefone)) {
           throw new BusinessException("Telefone já existe");
       }
       
       return this.daoTelefone.save(telefone);
    }

    @Override
    public Phone updateTelefone(Phone telefone) {
        if(this.validaTelefone(telefone) == false) {
           throw new BusinessException(TELE_NULL);
       }
       
       if(this.telefoneExiste(telefone) == false) {
           throw new BusinessException(TELE_NAO_EXISTE);
       }
       
       return this.daoTelefone.update(telefone);
    }

    @Override
    public void deleteTelefone(Phone telefone) {
        if(telefone == null) {
            throw new BusinessException(TELE_NULL);
        }
        
        if(this.telefoneExiste(telefone) == false) {
           throw new BusinessException(TELE_NAO_EXISTE);
        }
        
       this.daoTelefone.delete(telefone);
    }

    @Override
    public List<Phone> getAllTelefone() {
        return this.daoTelefone.findAll();
    }

    /**
     * 
     * @param telefone
     * @return false se algum atributo estiver irregular
     */
    private boolean validaTelefone(Phone telefone) {
        
        StringUtil util = StringUtil.getInstance();
        
        if(telefone == null) {
            throw new BusinessException(TELE_NULL);
        }
        
        if(util.isNullOrEmpty(telefone.getNumber())) {
            throw new BusinessException(TELE_INVALIDO);
        }
        
        if(util.isNullOrEmpty(telefone.getDdd())) {
            throw new BusinessException(TELE_INVALIDO);
        }
        
        if(util.isNullOrEmpty(telefone.getPhoneType())) {
            throw new BusinessException(TELE_INVALIDO);
        }
                
        return true;
    }
    
    /**
     * 
     * @param telefone
     * @return true se telefone já existir (id) na base de dados
     */
    private boolean telefoneExiste(Phone telefone) {
        return this.daoTelefone.findById(telefone.getId()) == telefone;
    }
    
}
