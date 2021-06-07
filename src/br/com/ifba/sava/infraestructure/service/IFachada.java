package br.com.ifba.sava.infraestructure.service;

import br.com.ifba.sava.infraestructure.endereco.model.Endereco;
import br.com.ifba.sava.login.tipousuario.model.TipoUsuario;
import java.util.List;
public interface IFachada {
    
    //------------------- Endereço ----------------------------//
    // Método que salva um Endereço na base de dados
    public abstract Endereco saveEndereco(Endereco endereco);
    // Método que salva um Endereço na base de dados
    public abstract Endereco updateEndereco(Endereco endereco);
    // Método que deleta um Endereço da base de dados
    public abstract void deleteEndereco(Endereco endereco);
    // Método que retorna todos Endereços da base de dados
    public abstract List<Endereco> getAllEndereco();
    
    
    //------------------- Usuario ----------------------------//
    public abstract List<TipoUsuario> getAllTipoUsuario();
}