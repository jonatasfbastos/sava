/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.avaliacaoturma.service;

import br.com.ifba.sava.avaliacaoturma.model.AvaliacaoTurma;

/**
 *
 * @author pedro_14b4yz1
 */
public interface IServiceAvaliacaoTurma {
    
    public abstract AvaliacaoTurma saveAvaliacaoTurma(AvaliacaoTurma avaliacaoTurma);
    public abstract void removeAvaliacaoTurma(AvaliacaoTurma avaliacaoTurma);
    public abstract AvaliacaoTurma updateAvaliacaoTurma(AvaliacaoTurma avaliacaoTurma);
    public abstract AvaliacaoTurma findAvaliacaoTurma(AvaliacaoTurma avaliacaoTurma);
}
