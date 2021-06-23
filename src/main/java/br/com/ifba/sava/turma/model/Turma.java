/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.turma.model;

import br.com.ifba.sava.aluno.model.Aluno;
import br.com.ifba.sava.curso.model.Curso;
import br.com.ifba.sava.disciplina.model.Disciplina;
import br.com.ifba.sava.infrastructure.exception.BusinessException;
import br.com.ifba.sava.infrastructure.model.PersistenceEntity;
import br.com.ifba.sava.turma.dao.DaoTurma;
import br.com.ifba.sava.turma.dao.IDaoTurma;
import static br.com.ifba.sava.turma.service.ServiceTurma.TURMA_NAO_EXISTE;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author pedro_14b4yz1
 * @author Gustavo
 */


@Entity
@Table (name = "TURMA")
public class Turma extends PersistenceEntity{
  
    @OneToOne(mappedBy = "CURSO")
    private Curso curso;
    
    private List<Aluno> listAlunos;
    
    private List<Disciplina> listDisciplinas;
    
    private String nome;
    private int numero;

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
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public int getNumero(){
        return numero;
    }
}
