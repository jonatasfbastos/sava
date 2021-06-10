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

/**
 *
 * @author jhinr
 */
public class DaoUsuario extends BaseDao<Usuario> implements IDaoUsuario{
    private String sql;
    
    public DaoUsuario() {
        super();
    }
    
   @Override
   public List<Usuario> findByNome(Usuario usuario) {
            String query  = "FROM Usuario WHERE upper(login) like upper('"+
            usuario.getLogin()+"%')";
            //String query = "SELECT * FROM USUARIO WHERE login LIKE '"+usuario.getLogin()+"%'";
            return  BaseDao.entityManager.createQuery(query).getResultList();
	}
    @Override
   public List<Usuario> findByLoginSenha(Usuario usuario) {
           this.setSql("SELECT u FROM Usuario AS u WHERE u.login=:login AND u.senha=:senha");
        // inserindo comando na querry e inserindo os dados
        Query query = entityManager.createQuery(this.getSql());
        query.setParameter("login", usuario.getLogin());
        query.setParameter("senha", usuario.getSenha());
        return query.getResultList();
	}


    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }   
}
