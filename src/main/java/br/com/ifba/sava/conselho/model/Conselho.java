/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.conselho.model;

import br.com.ifba.sava.aluno.model.Aluno;
import br.com.ifba.sava.infrastructure.model.PersistenceEntity;
import br.com.ifba.sava.infrastructure.servidor.model.Servidor;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Tarcio
 */
@Entity
@Table(name = "Conselho")
public class Conselho extends PersistenceEntity{
    
    private String codigoConselho;
    private String trimestre;
    private String anoLetivo;
    private String codigoAta;
    
    @OneToMany (fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Aluno> listaAluno;
    
    @OneToMany (fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Servidor> listaServidor;

    public String getCodigoConselho() {
        return codigoConselho;
    }

    public void setCodigoConselho(String codigoConselho) {
        this.codigoConselho = codigoConselho;
    }

    public String getTrimestre() {
        return trimestre;
    }

    public void setTrimestre(String trimestre) {
        this.trimestre = trimestre;
    }

    public String getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(String anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    public String getCodigoAta() {
        return codigoAta;
    }

    public void setCodigoAta(String codigoAta) {
        this.codigoAta = codigoAta;
    }

    public List<Aluno> getListaAluno() {
        return listaAluno;
    }

    public void setListaAluno(List<Aluno> listaAluno) {
        this.listaAluno = listaAluno;
    }

    public List<Servidor> getListaServidor() {
        return listaServidor;
    }

    public void setListaServidor(List<Servidor> listaServidor) {
        this.listaServidor = listaServidor;
    }
    
    
}
