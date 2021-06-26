/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.responsavel.service;

import br.com.ifba.sava.responsavel.model.Responsavel;

/**
 *
 * @author Monique
 */
public interface IServiceResponsavel {
    public abstract Responsavel saveResponsavel(Responsavel responsavel);
    public Responsavel updateResponsavel(Responsavel responsavel);  
}
