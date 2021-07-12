/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.curso.dao;

import br.com.ifba.sava.curso.model.Curso;
import br.com.ifba.sava.infrastructure.dao.BaseDao;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Gusdb
 * edited by rafael
 */
public class DaoCurso extends BaseDao<Curso> implements IDaoCurso{
    
    @Override
    public List<Curso> findCursoByName(Curso curso) {
        String busca = "SELECT a FROM Curso AS a WHERE a.nome=:nome";
        // inserindo comando na querry e inserindo os dados
        Query query = entityManager.createQuery(busca);
        query.setParameter("nome", curso.getNome());
        return query.getResultList();
    }
}
