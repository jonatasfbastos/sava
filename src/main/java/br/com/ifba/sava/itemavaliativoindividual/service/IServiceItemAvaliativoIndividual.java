/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.itemavaliativoindividual.service;

import br.com.ifba.sava.itemavaliativoindividual.model.ItemAvaliativoIndividual;

/**
 *
 * @author Alírio Rios
 */
public interface IServiceItemAvaliativoIndividual {
    
    public abstract ItemAvaliativoIndividual saveItemAvaliativo(ItemAvaliativoIndividual itemAvaliativo);
    public abstract void removeItemAvaliativo(ItemAvaliativoIndividual itemAvaliativo);
    public abstract ItemAvaliativoIndividual updateItemAvaliativo(ItemAvaliativoIndividual itemAvaliativo);
    public abstract ItemAvaliativoIndividual findItemAvaliativo(ItemAvaliativoIndividual itemAvaliativo);
}
