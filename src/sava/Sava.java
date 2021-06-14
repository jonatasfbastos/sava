/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sava;

import br.com.ifba.sava.infrastructure.dao.BaseDao;
import br.com.ifba.sava.login.usuario.dao.DaoUsuario;
import br.com.ifba.sava.login.usuario.model.Usuario;

/**
 *
 * @author jonatasfbastos
 */
public class Sava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Usuario usuario = new Usuario();
        //BaseDao baseDao = new BaseDao();//classe pessoa nao esta indo e nao da p fazer o resto e salva
        usuario.setLogin("rafael");
        usuario.setSenha("123456");
       // baseDao.save(usuario);
        
    }
    
}
