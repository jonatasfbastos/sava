/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.login.usuario.service;

import br.com.ifba.sava.aluno.model.Aluno;
import br.com.ifba.sava.infrastructure.servidor.model.Servidor;
import br.com.ifba.sava.login.usuario.model.Usuario;
import java.util.List;

/**
 *
 * @author jhinr
 * edit by Rafael
 */
public interface IServiceUsuario {

    //SALVAR USUARIO
    public abstract Usuario saveUsuario(Usuario usuario);
    
    //LISTAR TODOS USUARIOS
    public List<Usuario> getAllUsuario();
    
    //DELETAR USUARIO
    public abstract void deleteUsuario(Usuario usuario);
    
    //ATUALIZAR USUARIO
    public abstract Usuario updateUsuario(Usuario usuario);
    
    //ACHA POR LOGIN E SENHA
    public List<Usuario> findByLoginSenha(Usuario usuario);
    
    //VERIFICAR USUARIO
    public  boolean usuarioExisting(Usuario usuario);
    
}
