/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.tecnicoadministrativo.dao;

import br.com.ifba.sava.infrastructure.dao.IBaseDao;
import br.com.ifba.sava.tecnicoadministrativo.model.TecnicoAdm;
import java.util.List;

/**
 *
 * @author schaidt
 */
public interface IDaoTecnicoAdm extends IBaseDao<TecnicoAdm> {
    
    /**
     *
     * @param tecnicoAdm
     * @return
     */
    public abstract List<TecnicoAdm> FindByNomeTecnicoAdm(String tecnicoAdm);
    
}
