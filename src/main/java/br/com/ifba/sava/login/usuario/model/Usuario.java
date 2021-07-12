/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.login.usuario.model;

import br.com.ifba.sava.infrastructure.model.PersistenceEntity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author jhinr
 */
@Entity
@Table (name = "USUARIO")
public class Usuario extends PersistenceEntity implements Serializable{
    
    @Column(name="LOGIN", length=100, nullable=false)
    private String login;
	
    @Column(name="SENHA", length=100, nullable=false)
    private String senha;
    
    private String TipoUsuario;

    public String getTipoUsuario() {
        return TipoUsuario;
    }

    public void setTipoUsuario(String TipoUsuario) {
        this.TipoUsuario = TipoUsuario;
    }
	

    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
