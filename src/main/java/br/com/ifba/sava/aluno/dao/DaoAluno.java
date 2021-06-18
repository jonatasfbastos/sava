/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.aluno.dao;

import br.com.ifba.sava.aluno.model.Aluno;
import br.com.ifba.sava.infrastructure.dao.BaseDao;
import java.util.List;
import javax.persistence.Query;


/**
 *
 * @author Tarcio
 */
public class DaoAluno extends BaseDao<Aluno> implements IDaoAluno{

    @Override
    public List<Aluno> findByName(String name) {
        String busca = "SELECT a FROM Aluno AS a WHERE a.nome=:nome";
        // inserindo comando na querry e inserindo os dados
        Query query = entityManager.createQuery(busca);
        query.setParameter("nome", name);
        return query.getResultList();
    }
    
}
