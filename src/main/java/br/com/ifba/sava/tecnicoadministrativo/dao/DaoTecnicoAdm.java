/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.tecnicoadministrativo.dao;

import br.com.ifba.sava.infrastructure.dao.BaseDao;
import br.com.ifba.sava.tecnicoadministrativo.model.TecnicoAdm;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author schaidt
 */
public class DaoTecnicoAdm extends BaseDao<TecnicoAdm> implements IDaoTecnicoAdm {
    
    @Override
    public List<TecnicoAdm> FindByNomeTecnicoAdm(String tecnicoAdm){
        String query = "select t from Tecnico t WHERE upper(t.nome) like upper('" + tecnicoAdm +"%')";
        return BaseDao.entityManager.createQuery(query).getResultList();
    }
}
