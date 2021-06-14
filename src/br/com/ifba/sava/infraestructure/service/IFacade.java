package br.com.ifba.sava.infraestructure.service;

import br.com.ifba.sava.student.model.Student;
import br.com.ifba.sava.infraestructure.address.model.Address;
import br.com.ifba.sava.login.userType.model.UserType;
import br.com.ifba.sava.login.user.model.User;
import java.util.List;
public interface IFacade {
    
    //------------------- ALUNO -------------------------------//
    public abstract Student saveAluno(Student aluno);
    public abstract Student updateAluno(Student aluno);
    public abstract void deleteAluno(Student aluno);
    public List<Student> takeAll();
    
    //------------------- Endereço ----------------------------//
    // Método que salva um Endereço na base de dados
    public abstract Address saveEndereco(Address endereco);
    // Método que salva um Endereço na base de dados
    public abstract Address updateEndereco(Address endereco);
    // Método que deleta um Endereço da base de dados
    public abstract void deleteEndereco(Address endereco);
    // Método que retorna todos Endereços da base de dados
    public abstract List<Address> getAllEndereco();
    
    
    //------------------- User ----------------------------//
    List<User> getAllUsuario();
    //deleta um usuário
    void deleteUsuario(final User usuario);
    
    //------------------- Tipo User ----------------------------//
    public abstract List<UserType> getAllTipoUsuario();
    public abstract void deleteTipoUsuario(final UserType tipousuario); 
    
    
     


}