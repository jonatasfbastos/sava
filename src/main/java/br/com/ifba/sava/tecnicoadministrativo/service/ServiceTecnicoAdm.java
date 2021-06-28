/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.tecnicoadministrativo.service;

import br.com.ifba.sava.infrastructure.exception.BusinessException;
import br.com.ifba.sava.tecnicoadministrativo.dao.DaoTecnicoAdm;
import br.com.ifba.sava.tecnicoadministrativo.dao.IDaoTecnicoAdm;
import br.com.ifba.sava.tecnicoadministrativo.model.TecnicoAdm;
import java.util.List;

/**
 *
 * @author schaidt
 */
public class ServiceTecnicoAdm implements IServiceTecnicoAdm {
    // Representa a mensagem de erro se o Tecnico for null;
    public final static String TECNICOADM_NULL = "Tecnico null";
    // Representa a mensagem de erro se o Tecnico já existir;
    public final static String TECNICOADM = "O Tecnico já existe, sua operação não pode ser completada";
    // Representa a mensagem de erro se o Tecnico não existir na base de dados;
    public final static String TECNICOADM_NAO_EXISTE = "O Tecnico NÃO existe na base de dados";
    // Representa a mensagem de erro se o Tecnico for inválido;
    public final static String TECNICOADM_INVALIDO = "Tecnico inválido";
    
    private final IDaoTecnicoAdm daoTecnicoAdm = new DaoTecnicoAdm();

    @Override
    public TecnicoAdm saveTecnico(TecnicoAdm tecnicoAdm) {
        if(tecnicoAdm == null){
            // Tratamento de exceção
            throw new BusinessException(TECNICOADM_NULL);
        }
        if(this.validaTecnicoAdm(tecnicoAdm) == false){
            // Tratamento de exceção
           throw new BusinessException(TECNICOADM_INVALIDO);
        }
        if(this.tecnicoAdmExistente(tecnicoAdm)){
            // Tratamento de exceção
            throw new BusinessException(TECNICOADM);
        }
        // Salvando objeto na base de dados
        return daoTecnicoAdm.save(tecnicoAdm);
    }
    
    @Override
    public void deleteTecnicoAdm(TecnicoAdm tecnicoAdm) {
       if(tecnicoAdm == null){
            // Tratamento de exceção
            throw new BusinessException(TECNICOADM_NULL);
        }else if(this.daoTecnicoAdm.findById(tecnicoAdm.getId()) == null) {
            // Tratamento de exceção
            throw new BusinessException(TECNICOADM_NAO_EXISTE);
        }else{
            this.daoTecnicoAdm.delete(tecnicoAdm);
        }
    }

    @Override
    public TecnicoAdm updateTecnicoAdm(TecnicoAdm tecnicoAdm) {
        if(tecnicoAdm == null) {
               // Tratamento de exceção
           throw new BusinessException(TECNICOADM_NULL);

        }else if(this.daoTecnicoAdm.findById(tecnicoAdm.getId()) == null) {
               // Tratamento de exceção
            throw new BusinessException(TECNICOADM_NAO_EXISTE);
            
        }else if(this.validaTecnicoAdm(tecnicoAdm) == false){
               // Tratamento de exceção
               throw new BusinessException(TECNICOADM_INVALIDO);
        }else {
            //Atualiza o objeto na base de dados
            return this.daoTecnicoAdm.update(tecnicoAdm);
           }
    }

    @Override
    public List<TecnicoAdm> getAllTecnicoAdm() {
        return daoTecnicoAdm.findAll();
    }

    @Override
    public TecnicoAdm getByIdTecnicoAdm(Long id) {
         return daoTecnicoAdm.findById(id);
    }

    @Override
    public List<TecnicoAdm> findByTecnicoAdm(String tecnicoAdm) {
        return daoTecnicoAdm.FindByNomeTecnicoAdm(tecnicoAdm);
    }
    
    
    public boolean validaTecnicoAdm(TecnicoAdm tecnicoAdm){
        return true;
    }

    public boolean tecnicoAdmExistente(TecnicoAdm tecnicoAdm) {
        // 
        List<TecnicoAdm> all = this.daoTecnicoAdm.findAll();
        return false;
    }
}
