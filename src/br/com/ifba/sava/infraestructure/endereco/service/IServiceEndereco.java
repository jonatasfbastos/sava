/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.infraestructure.endereco.service;

import br.com.ifba.sava.infraestructure.endereco.model.Endereco;
import java.util.List;

/**
 *
 * @author jhinr
 */
public interface IServiceEndereco {
    
    // Método que salva um Endereço na base de dados
    public Endereco saveEndereco(Endereco endereco);
    // Método que salva um Endereço na base de dados
    public Endereco updateEndereco(Endereco endereco);
    // Método que deleta um Endereço da base de dados
    public void deleteEndereco(Endereco endereco);
    // Método que retorna todos Endereços da base de dados
    public List<Endereco> getAllEndereco();
    
}
