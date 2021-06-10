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
   @Override
	public List<Usuario> findByNome(Usuario usuario) {
		final StringBuilder hql = new StringBuilder("FROM Usuario WHERE upper(usuario) like upper('"+
		usuario.getLogin()+"%')"); 
		//String query = "SELECT * FROM TIPOUSUARIO WHERE tipousuario LIKE '"+tipoUsuario.getTipousuario()+"%'";
		return null;
	}  
}
