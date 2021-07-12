/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.itemavaliativoindividual.service;

import br.com.ifba.sava.infrastructure.exception.BusinessException;
import br.com.ifba.sava.itemavaliativoindividual.dao.DaoItemAvaliativoIndividual;
import br.com.ifba.sava.itemavaliativoindividual.dao.IDaoItemAvaliativoIndividual;
import br.com.ifba.sava.itemavaliativoindividual.model.ItemAvaliativoIndividual;

/**
 *
 * @author Alírio Rios
 */
public class ServiceItemAvaliativoIndividual implements IServiceItemAvaliativoIndividual {
    
//========================== CONSTANTES ========================================
    //mensagem de erro se a avaliação for null;
    public final static String ITEM_NULL = "Avaliação null";
    
    //mensagem de erro se  avaliação já existir;
    public final static String ITEM_EXISTE = "A avaliação já existe,";
    
    //mensagem de erro se  avaliação não existir no banco;
    public final static String ITEM_NAO_EXISTE = "A avaliação não existe na base de dados";
    
    //mensagem de erro se  avaliação for inválido;
    public final static String ITEM_INVALIDO = "Avaliação inválida";
    
    private final IDaoItemAvaliativoIndividual daoItemAvaliativoIndividual = new DaoItemAvaliativoIndividual();

//============================== MÉTODOS =======================================    
    @Override
    public ItemAvaliativoIndividual saveItemAvaliativo(ItemAvaliativoIndividual itemAvaliativo) {
        if(itemAvaliativo == null) {
            throw new BusinessException(ITEM_NULL);
        } else if(daoItemAvaliativoIndividual.findById(itemAvaliativo.getId()) != null) {
            throw new BusinessException(ITEM_EXISTE);
        } else {
            return daoItemAvaliativoIndividual.save(itemAvaliativo);
        }
    }

    @Override
    public void removeItemAvaliativo(ItemAvaliativoIndividual itemAvaliativo) {
        if(itemAvaliativo == null) {
            throw new BusinessException(ITEM_NULL);
        } else if(daoItemAvaliativoIndividual.findById(itemAvaliativo.getId()) == null) {
            throw new BusinessException(ITEM_NAO_EXISTE);
        } else {
            daoItemAvaliativoIndividual.delete(itemAvaliativo);
        }
    }

    @Override
    public ItemAvaliativoIndividual updateItemAvaliativo(ItemAvaliativoIndividual itemAvaliativo) {
        if(itemAvaliativo == null) {
            throw new BusinessException(ITEM_NULL);
        } else if(daoItemAvaliativoIndividual.findById(itemAvaliativo.getId()) == null) {
            throw new BusinessException(ITEM_NAO_EXISTE);
        } else {
            return daoItemAvaliativoIndividual.update(itemAvaliativo);
        }
    }

    @Override
    public ItemAvaliativoIndividual findItemAvaliativo(ItemAvaliativoIndividual itemAvaliativo) {
        if(itemAvaliativo == null) {
            throw new BusinessException(ITEM_NULL);
        } else if(daoItemAvaliativoIndividual.findById(itemAvaliativo.getId()) == null) {
            throw new BusinessException(ITEM_NAO_EXISTE);
        } else {
            return daoItemAvaliativoIndividual.findById(itemAvaliativo.getId());
        }
    }
    
}
