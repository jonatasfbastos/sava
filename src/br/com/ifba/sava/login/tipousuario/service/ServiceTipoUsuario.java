/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.login.tipousuario.service;

import br.com.ifba.sava.infraestructure.exception.BusinessException;
import br.com.ifba.sava.login.tipousuario.dao.IDaoTipoUsuario;
import br.com.ifba.sava.login.tipousuario.model.TipoUsuario;
import java.util.List;

/**
 *
 * @author jhinr
 */
public final class ServiceTipoUsuario implements IServiceTipoUsuario{
    	/**
     * Representa a menssagem de erro se o Tipo de UsuÃ¡rio Ã© nulo. 
     */
	private final static String TIPOUSUARIO_NULL = "O Tipo de UsuÃ¡rio Ã© nulo";	
	
	/**
     * Representa a menssagem de erro se o Tipo de UsuÃ¡rio jÃ¡ foi deletado.
     */
	private final static String ALREADY_DELETED = "O Tipo de UsuÃ¡rio jÃ¡ foi deletado antes, sua operaÃ§Ã£o nÃ£o pode ser completada";
	
	/**
     * Representa a menssagem de erro se o id do Tipo de UsuÃ¡rio Ã© nulo.
     */
	private static final String ID_REQUIRED = "O id Ã© requerido";
	
	/**
     * Representa a menssagem de erro se o nome do Tipo de Usuario ja existir.
     */
	private final static String TIPOUSUARIO_EXIST = "Tipo de UsuÃ¡rio ja existe";
	
	/**
     * Representa a menssagem de erro se o Tipo de UsuÃ¡rio estiver sendo usado.
 
	

	 /**
    * Represents the dao {@link IDaoTipoUsuario}.
    */
   private transient IDaoTipoUsuario daoTipoUsuario;
   
   	@Override
	public List<TipoUsuario> getAllTipoUsuario() {
		// TODO Auto-generated method stub
		return daoTipoUsuario.findAll();
	}
   //------------------- Deleta Usuário --------------------------     
        @Override
	public void deleteTipoUsuario(TipoUsuario tipoUsuario) {
	    if(tipoUsuario == null){ 
                throw new BusinessException(TIPOUSUARIO_NULL);
    	    }
            if(tipoUsuario.getId() == null || tipoUsuario.getId() < 1){
    		throw new BusinessException(ID_REQUIRED);
    	    }
    	    final TipoUsuario previous = this.daoTipoUsuario.findById(tipoUsuario.getId());
            if(previous == null){
        	throw new BusinessException (ALREADY_DELETED);
            }
            this.daoTipoUsuario.delete(tipoUsuario);
        } 
   //----------------------------------------------------------------
}
