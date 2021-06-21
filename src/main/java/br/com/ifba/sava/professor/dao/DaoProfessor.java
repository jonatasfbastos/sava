/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.professor.dao;

import br.com.ifba.sava.infrastructure.dao.BaseDao;
import br.com.ifba.sava.professor.model.Professor;

/**
 *
 * @author Alírio Rios
 */
public class DaoProfessor extends BaseDao<Professor> implements IDaoProfessor{
    
    @Override
    public List<Professor> findBySiape(String siape) {
        String busca = "SELECT a FROM Professor AS a WHERE a.siape=:siape";
        // inserindo comando na querry e inserindo os dados
        Query query = entityManager.createQuery(busca);
        query.setParameter("siape", siape);
        return query.getResultList();
    }

}
