/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.login.usuario.service;

import br.com.ifba.sava.login.usuario.model.Usuario;
import java.util.List;

/**
 *
 * @author jhinr
 */
public interface IServiceUsuario {

    List<Usuario> getAllUsuario();
    
}
