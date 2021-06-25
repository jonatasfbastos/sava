/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.avaliacaoturma.service;

import br.com.ifba.sava.avaliacaoturma.dao.DaoAvaliacaoTurma;
import br.com.ifba.sava.avaliacaoturma.dao.IDaoAvaliacaoTurma;
import br.com.ifba.sava.avaliacaoturma.model.AvaliacaoTurma;
import br.com.ifba.sava.infrastructure.exception.BusinessException;

/**
 *
 * @author pedro_14b4yz1
 */
public class ServiceAvaliacaoTurma implements IServiceAvaliacaoTurma{

    //mensagem de erro se a avaliação for null;
    public final static String AVALIACAO_NULL = "Avaliação null";
    
    //mensagem de erro se  avaliação já existir;
    public final static String AVALIACAO_EXISTE = "A avaliação já existe,";
    
    //mensagem de erro se  avaliação não existir no banco;
    public final static String AVALIACAO_NAO_EXISTE = "A avaliação não existe na base de dados";
    
    //mensagem de erro se  avaliação for inválido;
    public final static String AVALIACAO_INVALIDO = "Avaliação inválida";
    
    private final IDaoAvaliacaoTurma daoAvaliacaoTurma = new DaoAvaliacaoTurma();
    
    @Override
    public AvaliacaoTurma saveAvaliacaoTurma(AvaliacaoTurma avaliacaoTurma) {
        if(avaliacaoTurma == null) {
            throw new BusinessException(AVALIACAO_NULL);
        } else if(daoAvaliacaoTurma.findById(avaliacaoTurma.getId()) != null) {
            throw new BusinessException(AVALIACAO_EXISTE);
        } else {
            return daoAvaliacaoTurma.save(avaliacaoTurma);
        }
    }

    @Override
    public void removeAvaliacaoTurma(AvaliacaoTurma avaliacaoTurma) {
        if(avaliacaoTurma == null) {
            throw new BusinessException(AVALIACAO_NULL);
        } else if(daoAvaliacaoTurma.findById(avaliacaoTurma.getId()) == null) {
            throw new BusinessException(AVALIACAO_NAO_EXISTE);
        } else {
            daoAvaliacaoTurma.delete(avaliacaoTurma);
        }
    }

    @Override
    public AvaliacaoTurma updateAvaliacaoTurma(AvaliacaoTurma avaliacaoTurma) {
        if(avaliacaoTurma == null) {
            throw new BusinessException(AVALIACAO_NULL);
        } else if(daoAvaliacaoTurma.findById(avaliacaoTurma.getId()) == null) {
            throw new BusinessException(AVALIACAO_NAO_EXISTE);
        } else {
            return daoAvaliacaoTurma.update(avaliacaoTurma);
        }
    }

    @Override
    public AvaliacaoTurma findAvaliacaoTurma(AvaliacaoTurma avaliacaoTurma) {
        if(avaliacaoTurma == null) {
            throw new BusinessException(AVALIACAO_NULL);
        } else if(daoAvaliacaoTurma.findById(avaliacaoTurma.getId()) == null) {
            throw new BusinessException(AVALIACAO_NAO_EXISTE);
        } else {
            return daoAvaliacaoTurma.findById(avaliacaoTurma.getId());
        }
    }
    
}
