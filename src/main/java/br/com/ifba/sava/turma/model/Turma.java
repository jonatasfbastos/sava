/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.turma.model;

import br.com.ifba.sava.aluno.model.Aluno;
import br.com.ifba.sava.curso.model.Curso;
import br.com.ifba.sava.disciplina.model.Disciplina;
import br.com.ifba.sava.infrastructure.model.PersistenceEntity;
import java.util.List;

/**
 *
 * @author pedro_14b4yz1
 */
public class Turma extends PersistenceEntity{
    
    private List<Aluno> listAlunos;
    
    private List<Disciplina> listDisciplinas;
    
    private Curso curso;

    public List<Aluno> getListAlunos() {
        return listAlunos;
    }

    public void setListAlunos(List<Aluno> listAlunos) {
        this.listAlunos = listAlunos;
    }

    public List<Disciplina> getListDisciplinas() {
        return listDisciplinas;
    }

    public void setListDisciplinas(List<Disciplina> listDisciplinas) {
        this.listDisciplinas = listDisciplinas;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    
}
