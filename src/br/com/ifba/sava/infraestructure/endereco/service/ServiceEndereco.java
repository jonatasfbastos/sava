/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.infraestructure.endereco.service;

import br.com.ifba.sava.infraestructure.endereco.dao.DaoEndereco;
import br.com.ifba.sava.infraestructure.endereco.dao.IDaoEndereco;
import br.com.ifba.sava.infraestructure.endereco.model.Endereco;
import br.com.ifba.sava.infraestructure.exception.BusinessException;
import br.com.ifba.sava.infraestructure.support.StringUtil;
import java.util.List;

/**
 *
 * @author jhinr
 */
public class ServiceEndereco implements IServiceEndereco{
    /**
     * Representa messagem de erro quando o endereço for null
     */
    private final static String ENDE_NULL = "Endereço null";
    
    /**
     * Representa messagem de erro quando o endereço for inválido
     */
    private final static String ENDE_INVALIDO = "Endereço inválido";
    
    /**
     * Representa messagem de erro quando o endereço não existir na base de dados
     */
    private final static String ENDE_NAO_EXISTE = "Endereço ainda não existe";

    /**
     * Atriburo que faz a comunicação com a camada dao
     */
    private final IDaoEndereco daoEndereco = new DaoEndereco();

    @Override
    public Endereco saveEndereco(Endereco endereco) {
        if(!this.validaEndereco(endereco)) {
            throw new BusinessException(ENDE_INVALIDO);
        }
        
        return this.daoEndereco.save(endereco);
    }

    @Override
    public Endereco updateEndereco(Endereco endereco) {
        if(!this.validaEndereco(endereco)) {
            throw new BusinessException(ENDE_INVALIDO);
        }
        
        if(!this.enderecoExiste(endereco)) {
            throw new BusinessException(ENDE_NAO_EXISTE);
        }
        
        return this.daoEndereco.update(endereco);
    }

    @Override
    public void deleteEndereco(Endereco endereco) {
        if(!this.enderecoExiste(endereco)) {
            throw new BusinessException(ENDE_NAO_EXISTE);
        }
        this.daoEndereco.delete(endereco);
    }

    @Override
    public List<Endereco> getAllEndereco() {
        return this.daoEndereco.findAll();
    }
    
    /**
     * 
     * @param endereco
     * @return false se algum atributo estiver irregular
     */
    private boolean validaEndereco(Endereco endereco) {
        
        StringUtil util = StringUtil.getInstance();
        
        if(endereco == null) {
            throw new BusinessException(ENDE_NULL);
        }
        
        if(util.isNullOrEmpty(endereco.getComplemento())) {
            throw new BusinessException(ENDE_INVALIDO);
        }
        
        if(util.isNullOrEmpty(endereco.getRua())) {
            throw new BusinessException(ENDE_INVALIDO);
        }
        
        if(util.isNullOrEmpty(endereco.getCidade())) {
            throw new BusinessException(ENDE_INVALIDO);
        }
        
        if(util.isNullOrEmpty(endereco.getUf())) {
            throw new BusinessException(ENDE_INVALIDO);
        }
        
        if(util.isNullOrEmpty(endereco.getCep()) || endereco.getCep().matches("[a-zA-z]")) {
            throw new BusinessException(ENDE_INVALIDO);
        }
                
        return true;
    }
    
    /**
     * 
     * @param endereco
     * @return true se endereco já existir (id) na base de dados
     */
    private boolean enderecoExiste(Endereco endereco) {
        return this.daoEndereco.findById(endereco.getId()) == endereco;
    }
}
