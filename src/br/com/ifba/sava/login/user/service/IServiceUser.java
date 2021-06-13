/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.login.user.service;

import br.com.ifba.sava.login.user.model.User;
import java.util.List;

/**
 *
 * @author jhinr
 */
public interface IServiceUser {

    //LISTAR TODOS USUARIOS
    List<User> getAllUsuario();
    //DELETAR USUARIO
    void deleteUsuario(final User usuario);
    //ATUALIZAR USUARIO
    User updateUsuario(User usuario);
    //VERIFICAR USUARIO
    boolean usuarioExisting(User usuario);
    
}
