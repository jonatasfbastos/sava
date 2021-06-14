/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.infrastructure.support;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * DateUtil é uma classe que implementa conversões de datas
 * 
 * @author itallo007
 */
public final class DateUtil {
    
    // Atributos
    private Date date;
    
    /**
     * Define o formato da data, que nesse caso é: dia/mês/ano
     */
    private final SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    
    
    /**
     * 
     * @param string uma data no formato de String, exemplo: "29/02/2000".
     * @return Date - um objeto do tipo Date no formato de data simples.
     */
    public Date toDate(String string){
        
        try {
            return this.date = format.parse(string);
        } catch (ParseException ex) {
            Logger.getLogger(DateUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    /**
     * 
     * @param date2 um objeto Date de formado simples.
     * @return String - uma data no formato de String, exemplo: "16/10/2018"
     */
    public String toString(Date date2){
        
        return this.format.format(date2);
    }
}
