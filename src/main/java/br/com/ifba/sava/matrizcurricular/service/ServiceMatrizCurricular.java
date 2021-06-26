/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.matrizcurricular.service;

import br.com.ifba.sava.infrastructure.exception.BusinessException;
import br.com.ifba.sava.matrizcurricular.dao.DaoMatrizCurricular;
import br.com.ifba.sava.matrizcurricular.dao.IDaoMatrizCurricular;
import br.com.ifba.sava.matrizcurricular.model.MatrizCurricular;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class ServiceMatrizCurricular implements IServiceMatrizCurricular{
    
    //mensagem de erro se a Disciplina for null;
    public final static String MATRIZCURRICULAR_NULL = "MATRIZ CURRICULAR null";
    
    //mensagem de erro se a Disciplina já existir;
    public final static String MATRIZCURRICULAR_EXISTE = "MATRIZ CURRICULAR já existe,";
    
    //mensagem de erro se a Disciplina não existir no banco;
    public final static String MATRIZCURRICULAR_NAO_EXISTE = "MATRIZ CURRICULAR não existe na base de dados";
    
    //mensagem de erro se a Disciplina for inválida;
    public final static String MATRIZCURRICULAR_INVALIDO = "MATRIZ CURRICULAR inválido";
    
    private IDaoMatrizCurricular daoMatrizCurricular = new DaoMatrizCurricular();
    
    @Override
    public MatrizCurricular saveMatrizCurricular(MatrizCurricular matrizCurricular) {
        if(matrizCurricular == null) {
            throw new BusinessException(MATRIZCURRICULAR_NULL);
        } else if(daoMatrizCurricular.findById(matrizCurricular.getId()) != null) {
            throw new BusinessException(MATRIZCURRICULAR_EXISTE);
        } else {
            return daoMatrizCurricular.save(matrizCurricular);
        }
    }
    
    @Override
    public List<MatrizCurricular> getAllMatrizCurricular() {
        return daoMatrizCurricular.findAll();
    }
    
    public MatrizCurricular updateMatrizCurricular(MatrizCurricular matrizCurricular) {
          if(matrizCurricular == null) {
            throw new BusinessException(MATRIZCURRICULAR_NULL);
        } else if(daoMatrizCurricular.findById(matrizCurricular.getId()) == null) {
            throw new BusinessException(MATRIZCURRICULAR_NAO_EXISTE);
        } else {
            return daoMatrizCurricular.update(matrizCurricular);
        }
    }
   
    public void deleteMatrizCurricular(MatrizCurricular matrizCurricular) {
        if(matrizCurricular == null) {
            throw new BusinessException(MATRIZCURRICULAR_NULL);
        } else if(daoMatrizCurricular.findById(matrizCurricular.getId()) == null) {
            throw new BusinessException(MATRIZCURRICULAR_NAO_EXISTE);
        } else {
            daoMatrizCurricular.delete(matrizCurricular);
        }
    }

  
}
