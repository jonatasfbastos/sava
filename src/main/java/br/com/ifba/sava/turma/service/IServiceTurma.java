/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.turma.service;

import br.com.ifba.sava.turma.model.Turma;
import java.util.List;

/**
 *
 * @author Rafael
 */
public interface IServiceTurma {
    //ATUALIZAR TURMA
    public abstract Turma updateTurma(Turma turma);
    //LISTAR TODAS AS TURMAS
    public List<Turma> getAllTurma();
}
