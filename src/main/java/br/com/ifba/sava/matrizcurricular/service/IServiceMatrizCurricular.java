/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.matrizcurricular.service;

import br.com.ifba.sava.matrizcurricular.model.MatrizCurricular;
import java.util.List;

/**
 *
 * @author Rafael
 */
public interface IServiceMatrizCurricular {
    
   public abstract MatrizCurricular saveMatrizCurricular(MatrizCurricular matrizCurricular);
    public List<MatrizCurricular> getAllMatrizCurricular();
    public MatrizCurricular updateMatrizCurricular(MatrizCurricular matrizCurricular);
    public abstract void removeMatrizCurricular(MatrizCurricular matrizCurricular);
    
}
