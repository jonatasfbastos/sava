package br.com.ifba.sava.infraestructure.service;

import br.com.ifba.sava.aluno.model.Aluno;
import br.com.ifba.sava.infraestructure.endereco.model.Endereco;
import br.com.ifba.sava.login.tipousuario.model.TipoUsuario;
import br.com.ifba.sava.login.usuario.model.Usuario;
import java.util.List;
public interface IFachada {
    
    //------------------- ALUNO -------------------------------//
    public abstract Aluno saveAluno(Aluno aluno);
    public abstract Aluno updateAluno(Aluno aluno);
    public abstract void deleteAluno(Aluno aluno);
    public List<Aluno> takeAll();
    
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
    List<Usuario> getAllUsuario();
    //deleta um usuário
    void deleteUsuario(final Usuario usuario);
    
    //------------------- Tipo Usuario ----------------------------//
    public abstract List<TipoUsuario> getAllTipoUsuario();
    public abstract void deleteTipoUsuario(final TipoUsuario tipousuario); 
    
    
     


}