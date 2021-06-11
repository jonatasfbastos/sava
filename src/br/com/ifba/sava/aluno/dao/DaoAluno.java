/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.aluno.dao;

import br.com.ifba.sava.aluno.model.Aluno;
import static br.com.ifba.sava.aluno.service.ServiceAluno.ALUNO_EXISTE;
import br.com.ifba.sava.ifraestrucutre.dao.BaseDao;
import br.com.ifba.sava.infraestructure.exception.BusinessException;

/**
 *
 * @author Tarcio
 */
public class DaoAluno extends BaseDao<Aluno> implements IDaoAluno{
    //================= CONSTANTES =============================================
    //mensagem de erro se o Aluno for null;
    public final static String ALUNO_NULL = "Aluno null";
    
    //mensagem de erro se o Aluno já existir;
    public final static String ALUNO_EXISTE = "O Aluno já existe,";
    
    //mensagem de erro se o Aluno não existir no banco;
    public final static String ALUNO_NAO_EXISTE = "O Aluno não existe na base de dados";
    
    //mensagem de erro se o Aluno for inválido;
    public final static String ALUNO_INVALIDO = "Aluno inválido";
    
    
    public DaoAluno(){
        super();
    }
    
    @Override
    public Aluno salvarAluno(Aluno aluno){
        if(this.findById(aluno.getId()) == null){
            //Tratamento de exceção; se o anulo não existir
            //Salvando objeto na base de dados
            return this.save(aluno);
        }else{
            throw new BusinessException(ALUNO_EXISTE);
        }
    }
    
    @Override
    public void deleteAluno(Aluno aluno) {
           try {
            this.delete(aluno);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public Aluno updateAluno(Aluno aluno) {
        if(this.findById(aluno.getId()) == null) {
            throw new BusinessException(ALUNO_NAO_EXISTE);
        }
        return this.update(aluno);
    }
    
}
