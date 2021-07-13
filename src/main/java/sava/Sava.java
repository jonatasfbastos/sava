/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sava;

import br.com.ifba.sava.aluno.model.Aluno;
import br.com.ifba.sava.curso.model.Curso;
import br.com.ifba.sava.disciplina.model.Disciplina;
import br.com.ifba.sava.etapa.model.Etapa;
import br.com.ifba.sava.infrastructure.dao.BaseDao;
import br.com.ifba.sava.infrastructure.service.FacadeInstance;
import br.com.ifba.sava.login.usuario.dao.DaoUsuario;
import br.com.ifba.sava.login.usuario.model.Usuario;
import br.com.ifba.sava.matrizcurricular.model.MatrizCurricular;
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
        
        Aluno aluno = new Aluno();
        aluno.setCpf("123");
        FacadeInstance.getInstance().deleteAluno(aluno);
        
        // TODO code application logic here

       /* Turma turma = new Turma();
        Curso curso = new Curso();
       
        turma.setNome("Barbosa");
        turma.setAnoLetivo(1);
        
        curso.setId(1l);
        turma.setCurso(FacadeInstance.getInstance().findCurso(curso));
        
        FacadeInstance.getInstance().saveTurma(turma);*/
       

      /* Disciplina disciplina = new Disciplina();
       disciplina.setNome("disciplina 1");
       FacadeInstance.getInstance().saveDisciplina(disciplina);
       disciplina.setNome("disciplina 2");
       FacadeInstance.getInstance().saveDisciplina(disciplina);
       
       //faco etapa
       Etapa etapa = new Etapa();
       etapa.setNome("etapa 1");
       etapa.setListDisciplinas(FacadeInstance.getInstance().getAllDisciplinas());
       FacadeInstance.getInstance().saveEtapa(etapa);
       //
       //faco MatriCurricular
       MatrizCurricular matrizCurricular = new MatrizCurricular();
       matrizCurricular.setNome("matrizCurricular 1");
       matrizCurricular.setEtapa(FacadeInstance.getInstance().getAllEtapa());
       FacadeInstance.getInstance().saveMatrizCurricular(matrizCurricular);
       //
       //faco MatriCurricular
       Curso curso = new Curso();
       curso.setNome("Curso 1");
       curso.setMatrizCurricular(matrizCurricular);
       FacadeInstance.getInstance().saveCurso(curso);
       //
       
      
        System.out.println(FacadeInstance.getInstance().getAllEtapa().get(0).getListDisciplinas().get(0).getNome()); 
       */
       
       
       
    }
    
}
