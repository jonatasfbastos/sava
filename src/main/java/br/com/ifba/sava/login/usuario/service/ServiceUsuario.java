/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.login.usuario.service;

import br.com.ifba.sava.aluno.model.Aluno;
import br.com.ifba.sava.infrastructure.exception.BusinessException;
import br.com.ifba.sava.infrastructure.servidor.model.Servidor;
import br.com.ifba.sava.login.usuario.dao.DaoUsuario;
import br.com.ifba.sava.login.usuario.dao.IDaoUsuario;
import br.com.ifba.sava.login.usuario.model.Usuario;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
       
       
       
    //------------------- Salva Usuário --------------------------   
        @Override
        public Usuario saveUsuario(Usuario usuario) {
            if(usuario == null){
                //Tratamento de exceção; se o professor for NULL/Vazio
                throw new BusinessException(USUARIO_NULL);
            } else if(daoUsuario.findById(usuario.getId()) != null) {
                throw new BusinessException(USUARIO_EXIST);
            } else {
                return daoUsuario.save(usuario);
            }
        }
       
    //------------------- Deleta Usuário --------------------------   
        @Override
        public void deleteUsuario(final Usuario usuario) {
            if(usuario == null){ 
                throw new BusinessException(USUARIO_NULL);
            }
            if(usuario.getId() == null || usuario.getId() < 1){
                throw new BusinessException(ID_REQUIRED);
            }
            final Usuario previous = this.daoUsuario.findById(usuario.getId());
                if(previous == null){
                  throw new BusinessException (ALREADY_DELETED);
            }
            this.daoUsuario.delete(usuario);
        }
           
    //------------------- Atualizar Usuário --------------------------   
        @Override
       public Usuario updateUsuario(Usuario usuario) {
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
       
      //-------------------- verificar login e senha--------------------
      public List<Usuario> findByLoginSenha(Usuario usuario){
        List<Usuario> lista = daoUsuario.findByLoginSenha(usuario);
        if(lista.size()<1){
           throw new BusinessException(USUARIO_NULL); 
        }
        return lista;
    }
      
      
        
    //------------------- Verificar Usuário --------------------------   
        @Override
       public boolean usuarioExisting(Usuario usuario) {
            List<Usuario> usuarios = new ArrayList<Usuario>();
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
