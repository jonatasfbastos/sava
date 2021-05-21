/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.infraestructure.service;

/**
 *
 * @author jonatasfbastos
 */
public class FachadaInstance {
    
    /**
     * Represents the singleton instance of the class.
     */
    private static IFachada fachadaInstance;

    /**
     * Object monitor for synchronize.
     */
    private static final Object MONITOR = new Object();
    
    /**
     * Create a new instance of this class.
     */
    public FachadaInstance() {
        super();
    }
    
    /**
     * Return a new instance of Fachada if there's not.
     * @return 
     */
    public static IFachada getInstance() {
        synchronized (MONITOR) {
            if (fachadaInstance == null) {
                fachadaInstance = new Fachada();
            }
        }
        return fachadaInstance;
    }
}
