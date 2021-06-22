/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.etapa.model;

import br.com.ifba.sava.disciplina.model.Disciplina;
import br.com.ifba.sava.infrastructure.model.PersistenceEntity;
import br.com.ifba.sava.turma.model.Turma;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author jhinr
 */
@Entity
@Table (name = "Etapa")
public class Etapa extends PersistenceEntity{
    
    private List<Disciplina> listDisciplinas;
    private List<Turma> listTurma;
    
    private String nome;
    private String codigo;

    public List<Disciplina> getListDisciplinas() {
        return listDisciplinas;
    }

    public void setListDisciplinas(List<Disciplina> listDisciplinas) {
        this.listDisciplinas = listDisciplinas;
    }

    public List<Turma> getListTurma() {
        return listTurma;
    }

    public void setListTurma(List<Turma> listTurma) {
        this.listTurma = listTurma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
}
