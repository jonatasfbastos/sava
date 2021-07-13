/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.curso.model;

import br.com.ifba.sava.aluno.model.Aluno;
import br.com.ifba.sava.infrastructure.model.PersistenceEntity;
import br.com.ifba.sava.matrizcurricular.model.MatrizCurricular;
import br.com.ifba.sava.professor.model.Professor;
import br.com.ifba.sava.tecnicoadministrativo.model.TecnicoAdm;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Gustavo
 * 
 */

@Entity
@Table (name = "CURSO")
public class Curso extends PersistenceEntity{
    
    @Column (name="NOME", length=100, nullable=false)
    private String nome;
    
    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<MatrizCurricular> matrizCurricular;
    /*
    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Professor> professor;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<TecnicoAdm> tecAdm;

    public List<Professor> getProfessor() {
        return professor;
    }

    public void setProfessor(List<Professor> professor) {
        this.professor = professor;
    }

    public List<TecnicoAdm> getTecAdm() {
        return tecAdm;
    }

    public void setTecAdm(List<TecnicoAdm> tecAdm) {
        this.tecAdm = tecAdm;
    }
    */
   
    
    
    
    /*@OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Servidor cordenador;
    
    public void setServidor(Servidor servidor) {
        this.servidor = servidor;
    }
    public Servidor getServidor() {
        return nome;
    }
    */

    public List<MatrizCurricular> getMatrizCurricular() {
        return matrizCurricular;
    }

    public void setMatrizCurricular(List<MatrizCurricular> matrizCurricular) {
        this.matrizCurricular = matrizCurricular;
    }
    
    
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
}
