/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.infraestructure.phone.service;

import br.com.ifba.sava.infraestructure.phone.model.Phone;
import java.util.List;

/**
 *
 * @author jhinr
 */
public interface IServicePhone {
    
    public Phone saveTelefone(Phone telefone);
    
    public Phone updateTelefone(Phone telefone);
    
    public void deleteTelefone(Phone telefone);
    
    public List<Phone> getAllTelefone();
    
}
