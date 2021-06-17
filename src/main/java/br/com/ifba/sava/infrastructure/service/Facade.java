package br.com.ifba.sava.infrastructure.service;

import br.com.ifba.sava.aluno.model.Aluno;
import br.com.ifba.sava.login.usuario.model.Usuario;
import br.com.ifba.sava.login.usuario.service.IServiceUsuario;
import br.com.ifba.sava.login.usuario.service.ServiceUsuario;
import br.com.ifba.sava.aluno.service.IServiceAluno;
import br.com.ifba.sava.aluno.service.ServiceAluno;
import br.com.ifba.sava.disciplina.model.Disciplina;
import br.com.ifba.sava.disciplina.service.IServiceDisciplina;
import br.com.ifba.sava.disciplina.service.ServiceDisciplina;
import java.util.List;


public class Facade implements IFacade {
    //------------------- ALUNO -------------------------------//
    private final IServiceAluno serviceAluno = new ServiceAluno();
    
    @Override
    public Aluno saveAluno(Aluno aluno){
        return serviceAluno.saveAluno(aluno);
    }
    
    public void deleteAluno(Aluno aluno){
        this.serviceAluno.deleteAluno(aluno);
    }

    @Override
    public Aluno updateAluno(Aluno aluno) {
        return serviceAluno.updateAluno(aluno);
    }
    
    @Override
    public List<Aluno> getAllAlunos() {
        return serviceAluno.getAllAluno();
    }
       
    
    //------------------- USUÁRIO ----------------------------//
    private final IServiceUsuario serviceUsuario = new ServiceUsuario();
    
    // Constroi lista com todos os usuários cadastrados
    @Override
    public List<Usuario> getAllUsuario(){
        return this.serviceUsuario.getAllUsuario();
    }
    //deleta um usuário
    @Override
    public void deleteUsuario(final Usuario usuario){
        this.serviceUsuario.deleteUsuario(usuario);
    }    
    
    
    //------------------ DISCIPLINA --------------------------//
    private final IServiceDisciplina serviceDisciplina = new ServiceDisciplina();
    
    @Override
    public Disciplina saveDisciplina(Disciplina disciplina) {
        return serviceDisciplina.saveDisciplina(disciplina);
    }
    
    @Override
    public List<Disciplina> getAllDisciplinas(){
        return serviceDisciplina.getAllDisciplinas();
    }

    @Override
    public void removeDisciplina(Disciplina disciplina) {
        serviceDisciplina.removeDisciplina(disciplina);
    }
    
}
