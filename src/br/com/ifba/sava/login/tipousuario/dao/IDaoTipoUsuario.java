/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.login.tipousuario.dao;

import br.com.ifba.sava.ifraestrucutre.dao.IBaseDao;
import br.com.ifba.sava.login.tipousuario.model.TipoUsuario;
import java.util.List;

/**
 *
 * @author jhinr
 */
public interface IDaoTipoUsuario extends IBaseDao<TipoUsuario> {
	
	public abstract List<TipoUsuario> findByNome(TipoUsuario tipousuario);

}
