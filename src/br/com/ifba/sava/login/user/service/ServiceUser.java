/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.login.user.service;

import br.com.ifba.sava.infraestructure.exception.BusinessException;
import br.com.ifba.sava.login.user.dao.DaoUser;
import br.com.ifba.sava.login.user.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import br.com.ifba.sava.login.user.dao.IDaoUser;

/**
 *
 * @author jhinr
 */
public class ServiceUser implements IServiceUser{
    
/**
    * Representa a menssagem de erro se o User é nulo. 
    */
       private final static String USUARIO_NULL = "O Usuario é nulo";

       /**
    * Representa a menssagem de erro se O User já foi deletado.
    */
       private final static String ALREADY_DELETED = "O Usuario já foi deletado antes, sua operação não pode ser completada";

       /**
    * Representa a menssagem de erro se o id do User Ã© nulo.
    */
       private static final String ID_REQUIRED = "O id é requerido";

       /**
    * Representa a menssagem de erro se o nome do UsuÃ¡rio ja existir.
    */
       private final static String USUARIO_EXIST = "Usuário ja existe";

       
       private final IDaoUser daoUsuario = new DaoUser();

       @Override
       public List<User> getAllUsuario() {
            return this.daoUsuario.findAll();
       }
       
    //------------------- Deleta Usuário --------------------------   
        @Override
        public void deleteUsuario(final User usuario) {
            if(usuario == null){ 
                throw new BusinessException(USUARIO_NULL);
            }
            if(usuario.getId() == null || usuario.getId() < 1){
                throw new BusinessException(ID_REQUIRED);
            }
            final User previous = this.daoUsuario.findById(usuario.getId());
                if(previous == null){
                  throw new BusinessException (ALREADY_DELETED);
            }
            this.daoUsuario.delete(usuario);
        }
    //----------------------------------------------------------------
        
    //------------------- Atualizar Usuário --------------------------   
        @Override
       public User updateUsuario(User usuario) {
               if(usuario.getLogin()==null || usuario.getSenha()==null){
                       throw new BusinessException(USUARIO_NULL);
               }
               if(usuario.getId() == null || usuario.getId() < 1){
               throw new BusinessException(ID_REQUIRED);
       }

               if (this.usuarioExisting(usuario)==true){
                       throw new BusinessException(USUARIO_EXIST);

               }
               return daoUsuario.update(usuario);
       }
    //----------------------------------------------------------------
        
    //------------------- Verificar Usuário --------------------------   
        @Override
       public boolean usuarioExisting(User usuario) {
            List<User> usuarios = new ArrayList<User>();
            usuarios=getAllUsuario();		
                 for (int i=0; i<usuarios.size(); i++){				
                      if (usuario.getLogin().equals(usuarios.get(i).getLogin())){
                            if (usuario.getId()!= null){
                                if (Objects.equals(usuario.getId(), usuarios.get(i).getId()) ){
                                    return true;
                                }
                            }
                            throw new BusinessException(USUARIO_EXIST);						
                      }
                 }
            return false;
       }
    //----------------------------------------------------------------

}
