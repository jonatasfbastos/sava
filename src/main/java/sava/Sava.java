/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sava;

import br.com.ifba.sava.curso.model.Curso;
import br.com.ifba.sava.infrastructure.dao.BaseDao;
import br.com.ifba.sava.infrastructure.service.FacadeInstance;
import br.com.ifba.sava.login.usuario.dao.DaoUsuario;
import br.com.ifba.sava.login.usuario.model.Usuario;
import br.com.ifba.sava.turma.model.Turma;
import br.com.ifba.sava.turma.service.ServiceTurma;
import java.util.List;

/**
 *
 * @author jonatasfbastos
 */
public class Sava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Turma turma = new Turma();
        Curso curso = new Curso();
        //List<Curso> curso = (List<Curso>) new Curso();
       
        turma.setNome("Barbosa");
        turma.setAnoLetivo(1);
        
        
        curso.setId(1l);
        turma.setCurso(FacadeInstance.getInstance().findCurso(curso));
        
       // turma.setCurso(curso);
        
        FacadeInstance.getInstance().saveTurma(turma);
        
    }
    
}
