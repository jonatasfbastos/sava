/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.tecnicoadministrativo.service;

import br.com.ifba.sava.tecnicoadministrativo.model.TecnicoAdm;
import java.util.List;

/**
 *
 * @author schaidt
 */
public interface IServiceTecnicoAdm {
    // Salva tecnico na base de dados
    public abstract TecnicoAdm saveTecnicoAdm(TecnicoAdm tecnicoAdm);
    // Deleta o tecnico da base de dados
    public abstract void deleteTecnicoAdm(TecnicoAdm tecnicoAdm);
    // Metodo que atualiza um tecnico que já existe na base de dados
    public abstract TecnicoAdm  updateTecnicoAdm (TecnicoAdm tecnicoAdm);
    // Metodo que retorna todos os tecnico da base de dados
    public abstract List<TecnicoAdm> getAllTecnicoAdm ();
    // Método que retorna um tecnico pelo Id
    public abstract TecnicoAdm  getByIdTecnicoAdm (Long id);
    // Metodo que busca tecnico na base de dados através do nome
    public abstract List<TecnicoAdm> findByTecnicoAdm (String tecnicoAdm);
}
