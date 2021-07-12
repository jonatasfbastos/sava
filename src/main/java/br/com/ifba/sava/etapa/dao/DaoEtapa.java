/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.etapa.dao;

import br.com.ifba.sava.etapa.model.Etapa;
import br.com.ifba.sava.infrastructure.dao.BaseDao;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author jhinr
 */
public class DaoEtapa extends BaseDao<Etapa> implements IDaoEtapa{

    @Override
    public List<Etapa> findEtapaByName(Etapa etapa) {
        String busca = "SELECT a FROM Etapa AS a WHERE a.nome=:nome";
        // inserindo comando na querry e inserindo os dados
        Query query = entityManager.createQuery(busca);
        query.setParameter("nome", etapa.getNome());
        return query.getResultList();
    }
    
}
