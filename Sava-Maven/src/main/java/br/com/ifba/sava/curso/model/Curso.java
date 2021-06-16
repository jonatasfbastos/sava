/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.curso.model;

import br.com.ifba.sava.aluno.model.Aluno;
import br.com.ifba.sava.infrastructure.model.PersistenceEntity;
import br.com.ifba.sava.disciplina.model.Disciplina;
import br.com.ifba.sava.turma.model.Turma;
import java.util.List;

/**
 *
 * @author pedro_14b4yz1
 */
public class Curso extends PersistenceEntity{
   
    private String nome;
    
    private List<Disciplina> listMaterias;
   
    private List<Turma> listTurmas;
    
    private List<Aluno> listAlunos;
    
}
