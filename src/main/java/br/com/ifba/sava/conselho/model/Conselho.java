/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.conselho.model;

import br.com.ifba.sava.infrastructure.model.PersistenceEntity;
import javax.persistence.Entity;
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
    
    
}
