/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.login.usuario.dao;

import br.com.ifba.sava.infrastructure.dao.IBaseDao;
import br.com.ifba.sava.login.usuario.model.Usuario;
import java.util.List;

/**
 *
 * @author jhinr
 */
public interface IDaoUsuario extends IBaseDao<Usuario>{
    public List<Usuario> findByNome(Usuario usuario);
    public List<Usuario> findByLoginSenha(Usuario usuario);
}
