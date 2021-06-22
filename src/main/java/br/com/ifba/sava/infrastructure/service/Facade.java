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
import br.com.ifba.sava.etapa.model.Etapa;
import br.com.ifba.sava.etapa.service.IServiceEtapa;
import br.com.ifba.sava.etapa.service.ServiceEtapa;
import br.com.ifba.sava.professor.model.Professor;
import br.com.ifba.sava.professor.service.IServiceProfessor;
import br.com.ifba.sava.professor.service.ServiceProfessor;
import br.com.ifba.sava.turma.model.Turma;
import br.com.ifba.sava.turma.service.IServiceTurma;
import br.com.ifba.sava.turma.service.ServiceTurma;


import java.util.List;


public class Facade implements IFacade {
    //------------------- ALUNO -------------------------------//
    private final IServiceAluno serviceAluno = new ServiceAluno();
    
    @Override
    public Aluno saveAluno(Aluno aluno){
        return serviceAluno.saveAluno(aluno);
    }
    
    @Override
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
    
    @Override
    public List<Aluno> findByName(String name) {
        return serviceAluno.findByName(name);
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
    public Disciplina updateDisciplina(Disciplina disciplina){
        return serviceDisciplina.updateDisciplina(disciplina);
    }

    @Override
    public void removeDisciplina(Disciplina disciplina) {
        serviceDisciplina.removeDisciplina(disciplina);
    }

    
    //-------------------- PROFESSOR -------------------------//
    private final IServiceProfessor serviceProfessor = new ServiceProfessor();

    @Override
    public Professor saveProfessor(Professor prof) {
        return serviceProfessor.saveProfessor(prof);
    }

    @Override
    public void deleteProfessor(Professor prof) {
        this.serviceProfessor.deleteProfessor(prof);
    }

    @Override
    public Professor updateProfessor(Professor prof) {
        return serviceProfessor.updateProfessor(prof);
    }
    
    //-------------------- TURMA -------------------------//
   private final IServiceTurma serviceTurma = new ServiceTurma();

    @Override
    public Turma updateTurma(Turma turma){
        return serviceTurma.updateTurma(turma);
    }
    @Override
    public List<Turma> getAllTurma() {
        return serviceTurma.getAllTurma();
    }
    
    //-------------------- ETAPA ------------------------//
    private final IServiceEtapa serviceEtapa = new ServiceEtapa();
    
    @Override
    public Etapa saveEtapa(Etapa etapa) {
        return serviceEtapa.saveEtapa(etapa);
    }
    
    @Override
    public List<Etapa> getAllEtapa(){
        return serviceEtapa.getAllEtapa();
    }
    
    @Override
    public Etapa updateEtapa(Etapa etapa){
        return serviceEtapa.updateEtapa(etapa);
    }

    @Override
    public void removeEtapa(Etapa etapa) {
        serviceEtapa.removeEtapa(etapa);
    }
}