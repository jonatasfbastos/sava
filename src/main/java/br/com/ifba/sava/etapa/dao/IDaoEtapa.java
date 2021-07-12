/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.etapa.dao;

import br.com.ifba.sava.etapa.model.Etapa;
import br.com.ifba.sava.infrastructure.dao.IBaseDao;
import java.util.List;

/**
 *
 * @author jhinr
 */
public interface IDaoEtapa extends IBaseDao<Etapa>{
    
    public List<Etapa> findEtapaByName(Etapa etapa);
}
