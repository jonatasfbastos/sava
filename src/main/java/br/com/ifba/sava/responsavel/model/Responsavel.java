/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.responsavel.model;
import br.com.ifba.sava.aluno.model.Aluno;
import br.com.ifba.sava.infrastructure.pessoa.model.Pessoa;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Monique
 */
@Entity
@Table (name = "RESPONSAVEL")
public class Responsavel extends Pessoa {
    
    @OneToMany (fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Aluno> listAlunos;

    public List<Aluno> getListAlunos() {
        return listAlunos;
    }

    public void setListAlunos(List<Aluno> listAlunos) {
        this.listAlunos = listAlunos;
    }
    
}
