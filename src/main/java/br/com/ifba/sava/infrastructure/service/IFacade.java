package br.com.ifba.sava.infrastructure.service;

import br.com.ifba.sava.aluno.model.Aluno;
import br.com.ifba.sava.disciplina.model.Disciplina;
import br.com.ifba.sava.login.usuario.model.Usuario;
import java.util.List;

public interface IFacade {
    
    //------------------- ALUNO -------------------------------//
    public abstract Aluno saveAluno(Aluno aluno);
    public abstract Aluno updateAluno(Aluno aluno);
    public abstract void deleteAluno(Aluno aluno);
    public List<Aluno> getAllAlunos();
    public List<Aluno> findByName(String name);
    
           
    //------------------- USUÁRIO ----------------------------//
    public List<Usuario> getAllUsuario();
    
    //deleta um usuário
    public void deleteUsuario(final Usuario usuario);
    
    //------------------ DISCIPLINA --------------------------//
    public abstract Disciplina saveDisciplina(Disciplina disciplina);
    public List<Disciplina> getAllDisciplinas();
    public abstract void removeDisciplina(Disciplina disciplina);
    
 }