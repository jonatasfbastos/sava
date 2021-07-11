/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.turma.model;

import br.com.ifba.sava.aluno.model.Aluno;
import br.com.ifba.sava.avaliacaoturma.model.AvaliacaoTurma;
import br.com.ifba.sava.curso.model.Curso;
import br.com.ifba.sava.infrastructure.model.PersistenceEntity;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
    
    @OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private AvaliacaoTurma avaliacaoTurma;
    
    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Aluno> listAlunos;
    
    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Curso curso;
    
    private String nome;
    private int AnoLetivo;

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    
    public void setAvaliacaoTurma(AvaliacaoTurma avaliacaoTurma){
        this.avaliacaoTurma = avaliacaoTurma;
    }
   
    public AvaliacaoTurma getAvaliacaoTurma(){
        return avaliacaoTurma;
    }
    
    public List<Aluno> getListAlunos() {
        return listAlunos;
    }

    public void setListAlunos(List<Aluno> listAlunos) {
        this.listAlunos = listAlunos;
    }
     
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }

    public int getAnoLetivo() {
        return AnoLetivo;
    }

    public void setAnoLetivo(int AnoLetivo) {
        this.AnoLetivo = AnoLetivo;
    }
    
 
}
