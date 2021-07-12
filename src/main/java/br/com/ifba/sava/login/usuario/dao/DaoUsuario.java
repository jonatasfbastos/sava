/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.login.usuario.dao;

import br.com.ifba.sava.infrastructure.dao.BaseDao;
import br.com.ifba.sava.login.usuario.model.Usuario;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author jhinr
 * Edited by Rafael
 */
public class DaoUsuario extends BaseDao<Usuario> implements IDaoUsuario{
    
    public DaoUsuario() {
        super();
    }
    
   @Override
   public List<Usuario> findByNome(Usuario usuario) {
        String jpql = "select c from Usuario c";
        TypedQuery<Usuario> typedQuery = this.getEntityManager().createQuery(jpql, Usuario.class);
        List<Usuario> listUsuario = typedQuery.getResultList();
        return listUsuario;
	}

    @Override 
        public List<Usuario> findByLoginSenha(Usuario usuario) {
            String q = ("SELECT u FROM Usuario AS u WHERE u.login=:login AND u.senha=:senha");
             // inserindo comando na querry e inserindo os dados
             Query query = entityManager.createQuery(q);
             query.setParameter("login", usuario.getLogin());
             query.setParameter("senha", usuario.getSenha());
             List<Usuario> resultado = query.getResultList();
             return resultado;
        }
}