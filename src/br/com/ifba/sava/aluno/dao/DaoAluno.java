/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.aluno.dao;

import br.com.ifba.sava.aluno.model.Aluno;
import br.com.ifba.sava.ifraestrucutre.dao.BaseDao;

/**
 *
 * @author Tarcio
 */
public class DaoAluno extends BaseDao<Aluno> implements IDaoAluno{
    
    public DaoAluno(){
        super();
    }
    
    @Override
    public void deleteAluno(Aluno aluno) {
           try {
            this.delete(aluno);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
