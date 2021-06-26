/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.curso.service;

import br.com.ifba.sava.curso.model.Curso;

/**
 *
 * @author Gusdb
 */
public interface IServiceCurso {
    
    public abstract Curso saveCurso (Curso curso);//salvar curso
    public abstract void deleteCurso (Curso curso);//deletar curso
    public abstract Curso updateCurso(Curso curso);//atualizar curso
    public abstract Curso findCurso(Curso curso);//uscar curso
}
