/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.professor.model;

import br.com.ifba.sava.infrastructure.servidor.model.Servidor;
import javax.persistence.Entity;
import javax.persistence.Table;
/**
 *
 * @author Alírio Rios
 */

@Entity
@Table(name = "PROFESSOR")
public class Professor extends Servidor{

}
