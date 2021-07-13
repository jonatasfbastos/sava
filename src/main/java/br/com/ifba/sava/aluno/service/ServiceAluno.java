/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.aluno.service;

import br.com.ifba.sava.aluno.dao.DaoAluno;
import br.com.ifba.sava.aluno.dao.IDaoAluno;
import br.com.ifba.sava.aluno.model.Aluno;
import br.com.ifba.sava.infrastructure.exception.BusinessException;
import java.util.List;

/**
 *
 * @author Tarcio
 */
public class ServiceAluno implements IServiceAluno{
    //================= CONSTANTES =============================================
    
    //mensagem de erro se o Aluno for null;
    public final static String ALUNO_NULL = "Aluno null";
    
    //mensagem de erro se o Aluno já existir;
    public final static String ALUNO_EXISTE = "O Aluno já existe,";
    
    //mensagem de erro se o Aluno não existir no banco;
    public final static String ALUNO_NAO_EXISTE = "O Aluno não existe na base de dados";
    
    //mensagem de erro se o Aluno for inválido;
    public final static String ALUNO_INVALIDO = "Aluno inválido";
    
    //================= OBJETO =================================================
    private final IDaoAluno daoAluno = new DaoAluno();
    
    //================= MÉTODOS ================================================
    @Override
    public Aluno saveAluno(Aluno aluno){
        if(aluno == null){
            //Tratamento de exceção; se o aluno for NULL/Vazio
            throw new BusinessException(ALUNO_NULL);
        } else if(daoAluno.findById(aluno.getId()) != null) {
            throw new BusinessException(ALUNO_EXISTE);
        } else {
            return daoAluno.save(aluno);
        }  
    }
     @Override
    public List<Aluno> getAllAluno() {
        return this.daoAluno.findAll();
    }

    @Override
    public void deleteAluno(Aluno aluno) {
         if(aluno == null){
            //exception aluno null
            throw new BusinessException(ALUNO_NULL);
        }else if(this.daoAluno.findById(aluno.getId()) != null) {
            this.daoAluno.delete(aluno);
            return;
        }else if(this.daoAluno.findBycpf(aluno, aluno.getCpf()) != null) {
            this.daoAluno.deleteByCpf(aluno,aluno.getCpf());
            return;
        }
            throw new BusinessException(ALUNO_NAO_EXISTE);    

    }

    @Override
    public Aluno updateAluno(Aluno aluno) {
        if(aluno == null) {
            throw new BusinessException(ALUNO_NULL);
        } else if(daoAluno.findById(aluno.getId()) == null) {
            throw new BusinessException(ALUNO_NAO_EXISTE);
        } else {
            return daoAluno.update(aluno);
        }
    }
    
    @Override
    public List<Aluno> findByName(String name) {
        if(name == null) {
            throw new BusinessException("Nome null");
        } else if(name.isEmpty()) {
            throw new BusinessException("Nome vazio");
        } else {
            return daoAluno.findByName(name);
        }
    }
    
}
