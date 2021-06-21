/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.professor.service;

import br.com.ifba.sava.infrastructure.exception.BusinessException;
import br.com.ifba.sava.professor.dao.DaoProfessor;
import br.com.ifba.sava.professor.dao.IDaoProfessor;
import br.com.ifba.sava.professor.model.Professor;

/**
 *
 * @author Alírio Rios
 */
public class ServiceProfessor implements IServiceProfessor{
    //=========================== CONSTANTES ===================================
    //mensagem de erro se o Aluno for null;
    public final static String PROFESSOR_NULL = "Professor null";
    
    //mensagem de erro se o Aluno já existir;
    public final static String PROFESSOR_EXISTE = "O Professor já existe,";
    
    //mensagem de erro se o Aluno não existir no banco;
    public final static String PROFESSOR_NAO_EXISTE = "O Professor não existe na base de dados";
    
    //mensagem de erro se o Aluno for inválido;
    public final static String PROFESSOR_INVALIDO = "Professor inválido";
    
    //============================= OBJETOS ====================================
    private final IDaoProfessor daoProfessor = new DaoProfessor();
    
    //============================= MÉTODOS ====================================
    @Override
    public Professor saveProfessor(Professor prof) {
        if(prof == null){
            //Tratamento de exceção; se o professor for NULL/Vazio
            throw new BusinessException(PROFESSOR_NULL);
        } else if(daoProfessor.findById(prof.getId()) != null) {
            throw new BusinessException(PROFESSOR_EXISTE);
        } else {
            return daoProfessor.save(prof);
        }
    }

    @Override
    public void deleteProfessor(Professor prof) {
        if(prof == null){
            //exception professor null
            throw new BusinessException(PROFESSOR_NULL);
        }else if(this.daoProfessor.findById(prof.getId()) == null) {
            //exception professor não existe
            throw new BusinessException(PROFESSOR_NAO_EXISTE);
        }else{
            this.daoProfessor.delete(prof);
        }
    }

    @Override
    public Professor updateProfessor(Professor prof) {
        if(prof == null) {
            throw new BusinessException(PROFESSOR_NULL);
        } else if(daoProfessor.findById(prof.getId()) == null) {
            throw new BusinessException(PROFESSOR_NAO_EXISTE);
        } else {
            return daoProfessor.update(prof);
        }
    }
    @Override
    public List<Professor> getAllProfessor(){
        return this.daoProfessor.findAll();
}

}
