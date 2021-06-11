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

    //LISTAR TODOS USUARIOS
    List<Usuario> getAllUsuario();
    //DELETAR USUARIO
    void deleteUsuario(final Usuario usuario);
    //ATUALIZAR USUARIO
    Usuario updateUsuario(Usuario usuario);
    //VERIFICAR USUARIO
    boolean usuarioExisting(Usuario usuario);
    
}
