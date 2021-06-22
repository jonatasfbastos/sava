/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.turma.service;

import br.com.ifba.sava.infrastructure.exception.BusinessException;
import br.com.ifba.sava.turma.dao.DaoTurma;
import br.com.ifba.sava.turma.model.Turma;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class ServiceTurma implements IServiceTurma{
    //=========================== CONSTANTES ===================================
    //mensagem de erro se o Aluno for null;
    public final static String TURMA_NULL = "Turma null";
    
    //mensagem de erro se o Aluno já existir;
    public final static String TURMA_EXISTE = "A Turma já existe,";
    
    //mensagem de erro se o Aluno não existir no banco;
    public final static String TURMA_NAO_EXISTE = "A Turma não existe na base de dados";
    
    //mensagem de erro se o Aluno for inválido;
    public final static String TURMA_INVALIDO = "A Turma inválida";
    
    //menasgem de erro se o ID da Taurma for nulo
    private static final String ID_REQUIRED = "O id é requerido";
    
    //mensagem de erro se a Turma já foi deletada anteriomente
    private final static String ALREADY_DELETED = "A turma já foi deletado antes, sua operação não pode ser completada";
    
    //============================= OBJETOS ====================================
    private final DaoTurma daoTurma = new DaoTurma();
    
    //============================= MÉTODOS ====================================
    
    @Override
    public Turma saveTurma(Turma turma) {
        if(turma == null){
            throw new BusinessException(TURMA_NULL);
        }else if(daoTurma.findById(turma.getId()) == null){
            throw new BusinessException(TURMA_NAO_EXISTE);
        }
        else{
            return daoTurma.save(turma);
        }
    }
    //ATUALIZAR TURMA
    @Override
    public Turma updateTurma(Turma turma) {
        if(turma == null) {
            throw new BusinessException(TURMA_NULL);
        } else if(daoTurma.findById(turma.getId()) == null) {
            throw new BusinessException(TURMA_NAO_EXISTE);
        } else {
            return daoTurma.update(turma);
        }
    }
    
    //LISTAR TURMA
    @Override
    public List<Turma> getAllTurma() {
        return this.daoTurma.findAll();
    }
    
    //DELETAR TURMA
    @Override
    public void deleteTurma(final Turma turma) {
        if(turma == null){ 
            throw new BusinessException(TURMA_NULL);
        }
        if(turma.getId() == null || turma.getId() < 1){
            throw new BusinessException(ID_REQUIRED);
        }
        final Turma previous = this.daoTurma.findById(turma.getId());
            if(previous == null){
                throw new BusinessException (ALREADY_DELETED);
            }
        this.daoTurma.delete(turma);
    }
    
}
