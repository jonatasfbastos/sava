/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.login.usuario.dao;

import br.com.ifba.sava.ifraestrucutre.dao.BaseDao;
import br.com.ifba.sava.login.usuario.model.Usuario;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author jhinr
 */
public class DaoUsuario extends BaseDao<Usuario> implements IDaoUsuario{
    
    public DaoUsuario() {
        super();
    }
    
   @Override
   public List<Usuario> findByNome(Usuario usuario) {
        String sql = "select c from Usuario c";
        TypedQuery<Usuario> typedQuery = this.getEntityManager().createQuery(sql, Usuario.class);
        List<Usuario> listUsuario = typedQuery.getResultList();
        return listUsuario;
	}

    @Override 
   public List<Usuario> findByLoginSenha(Usuario usuario) {
            String sql = "SELECT u FROM Usuario AS u WHERE u.login=:login AND u.senha=:senha";
        // inserindo comando na querry e inserindo os dados
        TypedQuery<Usuario> typedQuery = this.getEntityManager().createQuery(sql, Usuario.class);
        typedQuery.setParameter("login", usuario.getLogin());
        typedQuery.setParameter("senha", usuario.getSenha());
        return typedQuery.getResultList();
	} 
}