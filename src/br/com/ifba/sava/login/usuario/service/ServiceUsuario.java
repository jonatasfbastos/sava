/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.login.usuario.service;

import br.com.ifba.sava.infraestructure.exception.BusinessException;
import br.com.ifba.sava.login.usuario.dao.DaoUsuario;
import br.com.ifba.sava.login.usuario.dao.IDaoUsuario;
import br.com.ifba.sava.login.usuario.model.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jhinr
 */
public class ServiceUsuario implements IServiceUsuario{
    
/**
    * Representa a menssagem de erro se o Usuario é nulo. 
    */
       private final static String USUARIO_NULL = "O Usuario é nulo";

       /**
    * Representa a menssagem de erro se O Usuario já foi deletado.
    */
       private final static String ALREADY_DELETED = "O Usuario já foi deletado antes, sua operação não pode ser completada";

       /**
    * Representa a menssagem de erro se o id do Usuario Ã© nulo.
    */
       private static final String ID_REQUIRED = "O id é requerido";

       /**
    * Representa a menssagem de erro se o nome do UsuÃ¡rio ja existir.
    */
       private final static String USUARIO_EXIST = "Usuário ja existe";

       
       private final IDaoUsuario daoUsuario = new DaoUsuario();

       @Override
       public List<Usuario> getAllUsuario() {
               return this.daoUsuario.findAll();
       }


}
