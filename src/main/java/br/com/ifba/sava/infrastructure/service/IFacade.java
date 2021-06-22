package br.com.ifba.sava.infrastructure.service;

import br.com.ifba.sava.aluno.model.Aluno;
import br.com.ifba.sava.disciplina.model.Disciplina;
import br.com.ifba.sava.etapa.model.Etapa;
import br.com.ifba.sava.login.usuario.model.Usuario;
import br.com.ifba.sava.professor.model.Professor;
import br.com.ifba.sava.turma.model.Turma;
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
    public abstract Disciplina updateDisciplina(Disciplina disciplina);
    public abstract void removeDisciplina(Disciplina disciplina);
    
    //------------------ PROFESSOR --------------------------//
    public abstract Professor saveProfessor(Professor prof);
    public abstract void deleteProfessor(Professor prof);
    public abstract Professor updateProfessor(Professor prof);
    
    //------------------ TURMA --------------------------//
    public abstract Turma updateTurma(Turma turma);
    public List<Turma> getAllTurma();
    
    //------------------ ETAPA --------------------------//
    public abstract Etapa saveEtapa(Etapa etapa);
    public List<Etapa> getAllEtapa();
    public abstract Etapa updateEtapa(Etapa etapa);
    public abstract void removeEtapa(Etapa etapa);
    
 }