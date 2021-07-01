/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.conselho.service;

import br.com.ifba.sava.conselho.model.Conselho;
import java.util.List;

/**
 *
 * @author Tarcio
 */
public interface IServiceConselho {
    
    public abstract Conselho saveConselho(Conselho conselho);
    public List<Conselho> getAllConselho();
    public Conselho updateConselho(Conselho conselho);
    public abstract void removeConselho(Conselho conselho);
}
