/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.login.tipousuario.service;

import br.com.ifba.sava.login.tipousuario.model.TipoUsuario;
import java.util.List;

/**
 *
 * @author jhinr
 */
public interface IServiceTipoUsuario {
    public abstract List<TipoUsuario> getAllTipoUsuario();
    public abstract void deleteTipoUsuario(final TipoUsuario tipousuario);
}
