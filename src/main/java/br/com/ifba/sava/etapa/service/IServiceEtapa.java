/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.etapa.service;

import br.com.ifba.sava.etapa.model.Etapa;
import java.util.List;

/**
 *
 * @author jhinr
 */
public interface IServiceEtapa {
    
    public abstract Etapa saveEtapa(Etapa etapa);
    public List<Etapa> getAllEtapa();
    public Etapa updateEtapa(Etapa etapa);
    public abstract void removeEtapa(Etapa etapa);
}
