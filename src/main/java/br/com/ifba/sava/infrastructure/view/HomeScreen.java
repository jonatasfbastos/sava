/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.infrastructure.view;

import br.com.ifba.sava.aluno.model.Aluno;
import br.com.ifba.sava.aluno.view.CadastrarAluno;
import br.com.ifba.sava.curso.model.Curso;
import br.com.ifba.sava.curso.view.MenuCurso;
import br.com.ifba.sava.disciplina.model.Disciplina;
import br.com.ifba.sava.disciplina.view.CadastrarDisciplina;
import br.com.ifba.sava.etapa.model.Etapa;
import br.com.ifba.sava.etapa.view.CadastrarEtapa;
import br.com.ifba.sava.infrastructure.service.FacadeInstance;
import br.com.ifba.sava.matrizcurricular.model.MatrizCurricular;
import br.com.ifba.sava.professor.model.Professor;
import br.com.ifba.sava.professor.view.CadastrarProfessor;
import br.com.ifba.sava.turma.model.Turma;
import br.com.ifba.sava.turma.view.MenuTurma;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author sheor
 */
public class HomeScreen extends javax.swing.JFrame {
   JComboBox<String> combo = new JComboBox<String>();
    /**
     * Creates new form HomeScreen
     */
    public HomeScreen() {
        initComponents();
        pnlInicio.setVisible(true);
        pnlConselhos.setVisible(false);
        pnlDisciplinas.setVisible(false);
        pnlProfessores.setVisible(false);
        pnlAlunos.setVisible(false);
        pnlResponsaveis.setVisible(false);
        pnlCoordenadores.setVisible(false);
        pnlCursos.setVisible(false);
        pnlEtapas.setVisible(false);
       
        
        tabInicio.setBackground(new Color(255,255,255));
        tabAlunos.setBackground(new Color(204,204,255));
        tabDisciplinas.setBackground(new Color(204,204,255));
        tabProfessores.setBackground(new Color(204,204,255));
        tabConselhos.setBackground(new Color(204,204,255));
        tabTecAdm.setBackground(new Color(204,204,255));
        tabCursos.setBackground(new Color(204,204,255));
        tabResponsaveis.setBackground(new Color(204,204,255));
        tabEtapas.setBackground(new Color(204,204,255));
        
        //moque();
        CmbBoxCursos();
        
    }

    public HomeScreen(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public void moque() {
        Professor prof = new Professor();
        prof.setNome("Jubileu");
        
        Professor prof2 = new Professor();
        prof2.setNome("Shelda");
        
        FacadeInstance.getInstance().saveProfessor(prof);
        FacadeInstance.getInstance().saveProfessor(prof2);
        
        List<Professor> listProfessors;
        listProfessors = FacadeInstance.getInstance().getAllProfessor();
        
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Pedro");
        
        Aluno aluno2 = new Aluno();
        aluno2.setNome("Shelda");
       
        FacadeInstance.getInstance().saveAluno(aluno1);
        FacadeInstance.getInstance().saveAluno(aluno2);
        
        List<Aluno> listAlunos;
        listAlunos = FacadeInstance.getInstance().getAllAlunos();
        
        Disciplina disciplina = new Disciplina();
        disciplina.setNome("Matematica");
        disciplina.setProfessores(listProfessors);
        FacadeInstance.getInstance().saveDisciplina(disciplina);
        
        Disciplina disciplina2 = new Disciplina();
        disciplina2.setNome("Protugues");
        disciplina.setProfessores(listProfessors);
        FacadeInstance.getInstance().saveDisciplina(disciplina2);
        
        Etapa etapa = new Etapa();
        etapa.setNome("etapa 1");
        etapa.setListDisciplinas(FacadeInstance.getInstance().getAllDisciplinas());
        FacadeInstance.getInstance().saveEtapa(etapa);
        
        Etapa etapa2 = new Etapa();
        etapa2.setNome("etapa 2");
        etapa2.setListDisciplinas(FacadeInstance.getInstance().getAllDisciplinas());
        FacadeInstance.getInstance().saveEtapa(etapa2);
        
        Etapa etapa3 = new Etapa();
        etapa3.setNome("etapa 3");
        etapa3.setListDisciplinas(FacadeInstance.getInstance().getAllDisciplinas());
        FacadeInstance.getInstance().saveEtapa(etapa3);
        
        Turma turma1 = new Turma();
        turma1.setEtapa(etapa);
        turma1.setListAlunos(listAlunos);
        turma1.setNome("ADS1");
        FacadeInstance.getInstance().saveTurma(turma1);
        
        MatrizCurricular matrizCurricular = new MatrizCurricular();
        matrizCurricular.setNome("matrizCurricular 1");
        matrizCurricular.setEtapa(FacadeInstance.getInstance().findEtapaByName(etapa));
        FacadeInstance.getInstance().saveMatrizCurricular(matrizCurricular);
        
        MatrizCurricular matrizCurricular2 = new MatrizCurricular();
        matrizCurricular2.setNome("matrizCurricular 2");
        matrizCurricular2.setEtapa(FacadeInstance.getInstance().findEtapaByName(etapa2));
        FacadeInstance.getInstance().saveMatrizCurricular(matrizCurricular2);
        
        MatrizCurricular matrizCurricular3 = new MatrizCurricular();
        matrizCurricular3.setNome("matrizCurricular 3");
        matrizCurricular3.setEtapa(FacadeInstance.getInstance().findEtapaByName(etapa3));
        FacadeInstance.getInstance().saveMatrizCurricular(matrizCurricular3);
        
        Curso teste = new Curso();
        teste.setNome("Biocombustíveis");
  //      teste.setListAlunos(listAlunos);
      //  teste.setListProfessors(listProfessors);
   //     teste.setMatrizCurricular(matrizCurricular);
        FacadeInstance.getInstance().saveCurso(teste);
        
        Curso teste2 = new Curso();
        teste2.setNome("Informática");
    //    teste2.setMatrizCurricular(matrizCurricular2);
        FacadeInstance.getInstance().saveCurso(teste2); 
        
        Curso teste3 = new Curso();
        teste3.setNome("Eletromecânica");
   //     teste3.setMatrizCurricular(matrizCurricular3);
        FacadeInstance.getInstance().saveCurso(teste3);
    }

    private void CmbBoxCursos() {
        List<Curso> cursos = FacadeInstance.getInstance().getAllCurso();
        for(int i = 0; i < cursos.size(); i++) {
          //  cmbCursosDisciplinas.addItem(cursos.get(i).getNome());
            cmbCursosAlunos.addItem(cursos.get(i).getNome());
        }
    }
    
    void atualizaListaAlunos(List<Aluno> listAlunos) {
        DefaultTableModel dadosAlunos = (DefaultTableModel) tblAlunos.getModel();
        while (tblAlunos.getModel().getRowCount() > 0) {  
           ((DefaultTableModel) tblAlunos.getModel()).removeRow(0);  
        } 


        for(int i = 0; i < listAlunos.size(); i++){
            Object[] dados = {
                listAlunos.get(i).getNome(),
                listAlunos.get(i).getMatricula()
            };
            
            dadosAlunos.addRow(dados);
        }
    }
    
        private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {                                           
            if(tblAlunos.getSelectedRow() != -1 ){
               String clicado = (String) ((DefaultTableModel) tblAlunos.getModel()).getValueAt(tblAlunos.getSelectedRow(), 3);
              
                Aluno aluno = new Aluno();
                //aluno.setCpf(1l);
               // FacadeInstance.getInstance().deleteAluno(aluno);
                ((DefaultTableModel) tblAlunos.getModel()).removeRow(tblAlunos.getSelectedRow());
            }else{
                JOptionPane.showMessageDialog(null, "Selecione uma linha primeiro!", "ERRO", JOptionPane.WARNING_MESSAGE);
            }
    }
        
     private void CmbCursoListener() {
        cmbCursosAlunos.addActionListener((ActionEvent e) -> {
        int comboBoxValor = cmbCursosAlunos.getSelectedIndex();// index do comboBox
        List<Turma> listTurma = FacadeInstance.getInstance().getAllCurso().get(comboBoxValor).getMatrizCurricular().get(0).getEtapa().get(0).getListTurma();
        //atualizaListaAlunos(listAlunos);
        });
    }    
    
    private void CmbTurmaListener() {
        cmbTurmaAluno.addActionListener((ActionEvent e) -> {
        int comboBoxValor = cmbTurmaAluno.getSelectedIndex();// index do comboBox
        List<Aluno> listAlunos = FacadeInstance.getInstance().getAllTurma().get(comboBoxValor).getListAlunos();
        atualizaListaAlunos(listAlunos);
        });
    }
    
   /*  private void CmbBoxDisciplinasListener (){     
        cmbCursosDisciplinas.addActionListener((ActionEvent e) -> {
            String selected = (String)cmbCursosDisciplinas.getSelectedItem();
            
            if("Biocombustíveis".equals(selected)) {
                buscarDisciplinas("Biocombustíveis");
            } else if("Informática".equals(selected)) {
                buscarDisciplinas("Informática"); 
            } else if("Eletromecânica".equals(selected)) {
                buscarDisciplinas("Eletromecânica"); 
            } else {               
            }
      }); 
    }*/
     
    void buscarDisciplinas(String curso) {
        Curso busca = new Curso();
        busca.setNome(curso);
        List<Curso> cursoBio = FacadeInstance.getInstance().findCursoByName(busca);
        //Não pode ter dois cursos com o mesmo nome, sempre vai ser lista na posição zero
      //  List<Etapa> etapas = cursoBio.get(0).getMatrizCurricular().getEtapa();
        List<Disciplina> disciplinas = new ArrayList<>();

  //      for(int i = 0; i < etapas.size(); i++) {

   //         etapas.get(i).getListDisciplinas().forEach(action -> disciplinas.add(action));
    //    }
        
        atualizaListaDisciplinas(disciplinas);
    }
    
    void buscarProfessor(String curso) {
        Curso busca = new Curso();
        busca.setNome(curso);
        List<Curso> cursoBio = FacadeInstance.getInstance().findCursoByName(busca);
        
        List<Professor> professors = new ArrayList<>();
      //  professors = cursoBio.get(0).getListProfessors();
        
        atualizaListaProfessores(professors);
    }
    
    
     
    void atualizaListaProfessores(List<Professor> professores) {
        DefaultTableModel valoresProfessor = (DefaultTableModel) tblProfessores.getModel();
        while (tblProfessores.getModel().getRowCount() > 0) {  
           ((DefaultTableModel) tblProfessores.getModel()).removeRow(0);  
        } 

        for(int i = 0; i< professores.size(); i++){
            Object[] dados = {
                professores.get(i).getNome(),
                professores.get(i).getCpf(),
                professores.get(i).getTelefone(),
                professores.get(i).getEmail()             
            };
            
            valoresProfessor.addRow(dados);
        }
    }
    
    void atualizaListaDisciplinas(List<Disciplina> disciplinas) {
        DefaultTableModel dadosDisciplina = (DefaultTableModel) tblDisciplinas.getModel();
        while (tblDisciplinas.getModel().getRowCount() > 0) {  
           ((DefaultTableModel) tblDisciplinas.getModel()).removeRow(0);  
        } 
        
        for(int i = 0; i <disciplinas.size(); i++){
            Object[] dados = {
                disciplinas.get(i).getNome()
            };
            
            dadosDisciplina.addRow(dados);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlNavBar = new javax.swing.JPanel();
        tabConselhos = new javax.swing.JPanel();
        lblConselho = new javax.swing.JLabel();
        tabDisciplinas = new javax.swing.JPanel();
        lblSubjects = new javax.swing.JLabel();
        tabProfessores = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tabAlunos = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tabTecAdm = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        tabCursos = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        tabResponsaveis = new javax.swing.JPanel();
        lblResponsaveis = new javax.swing.JLabel();
        tabInicio = new javax.swing.JPanel();
        lblInicio = new javax.swing.JLabel();
        tabEtapas = new javax.swing.JPanel();
        lblEtapas = new javax.swing.JLabel();
        pnlTelas = new javax.swing.JPanel();
        pnlInicio = new javax.swing.JPanel();
        pnlMainBarClassCouncil1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlConselhos = new javax.swing.JPanel();
        pnlMainBarClassCouncil = new javax.swing.JPanel();
        btnAddClassCouncil = new javax.swing.JButton();
        txtSearchClassCouncil = new javax.swing.JTextField();
        btnSearchClassCouncil = new javax.swing.JButton();
        jComboBox4 = new javax.swing.JComboBox<>();
        btnCursosConselhos = new javax.swing.JButton();
        BoxTurmaConselho = new javax.swing.JComboBox<>();
        btnTurmaConselho = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtEditarConselho = new javax.swing.JTextField();
        btnEditarConselho = new javax.swing.JButton();
        btnDeletarConselho = new javax.swing.JButton();
        pnlDisciplinas = new javax.swing.JPanel();
        pnlMainBarSubjects = new javax.swing.JPanel();
        btnAddSubjects = new javax.swing.JButton();
        txtSearchSubjects = new javax.swing.JTextField();
        btnSearchSubjects = new javax.swing.JButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        btnMenuTurmasDisciplinas = new javax.swing.JButton();
        spnlSubjects = new javax.swing.JScrollPane();
        tblDisciplinas = new javax.swing.JTable();
        txtEditarDisciplina = new javax.swing.JTextField();
        btnEditarDisciplina = new javax.swing.JButton();
        btnDeletarDisciplinas = new javax.swing.JButton();
        pnlProfessores = new javax.swing.JPanel();
        pnlMainBarTeachers = new javax.swing.JPanel();
        btnAddTeacher = new javax.swing.JButton();
        txtSearchTeachers = new javax.swing.JTextField();
        btnSearchTeachers = new javax.swing.JButton();
        spnlProfessores = new javax.swing.JScrollPane();
        tblProfessores = new javax.swing.JTable();
        txtEditarProfessor = new javax.swing.JTextField();
        btnEditarProfessor = new javax.swing.JButton();
        btnDeletarProfessor = new javax.swing.JButton();
        pnlAlunos = new javax.swing.JPanel();
        pnlMainBarStudents = new javax.swing.JPanel();
        btnAddStudent = new javax.swing.JButton();
        txtSearchStudent = new javax.swing.JTextField();
        btnSearchStudent = new javax.swing.JButton();
        cmbCursosAlunos = new javax.swing.JComboBox<>();
        btnMenuCursoAlunos = new javax.swing.JButton();
        cmbTurmaAluno = new javax.swing.JComboBox<>();
        btnMenuTurmaAlunos = new javax.swing.JButton();
        spnlAlunos = new javax.swing.JScrollPane();
        tblAlunos = new javax.swing.JTable();
        btnEditarAluno = new javax.swing.JButton();
        txtEditarAluno = new javax.swing.JTextField();
        btnDeletarAluno = new javax.swing.JButton();
        pnlCursos = new javax.swing.JPanel();
        pnlMainBarClassCouncil3 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        pnlCoordenadores = new javax.swing.JPanel();
        pnlMainBarClassCouncil2 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnlResponsaveis = new javax.swing.JPanel();
        pnlMainBarClassCouncil4 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        pnlEtapas = new javax.swing.JPanel();
        pnlMainBarClassEtapas = new javax.swing.JPanel();
        btnAddClassEtapas = new javax.swing.JButton();
        txtSearchClassEtapas = new javax.swing.JTextField();
        btnSearchClassEtapas = new javax.swing.JButton();
        jComboBox5 = new javax.swing.JComboBox<>();
        btnMenuTurmaEtapas = new javax.swing.JButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        txtEditarEtapa = new javax.swing.JTextField();
        btnEditarEtapa = new javax.swing.JButton();
        btnDeletarEtapa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        pnlNavBar.setBackground(new java.awt.Color(72, 71, 97));

        tabConselhos.setBackground(new java.awt.Color(255, 255, 255));
        tabConselhos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabConselhosMouseClicked(evt);
            }
        });

        lblConselho.setBackground(new java.awt.Color(204, 204, 204));
        lblConselho.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblConselho.setForeground(new java.awt.Color(72, 71, 97));
        lblConselho.setText("Conselhos");

        javax.swing.GroupLayout tabConselhosLayout = new javax.swing.GroupLayout(tabConselhos);
        tabConselhos.setLayout(tabConselhosLayout);
        tabConselhosLayout.setHorizontalGroup(
            tabConselhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabConselhosLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(lblConselho)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabConselhosLayout.setVerticalGroup(
            tabConselhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblConselho, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        tabDisciplinas.setBackground(new java.awt.Color(255, 255, 255));
        tabDisciplinas.setPreferredSize(new java.awt.Dimension(216, 50));
        tabDisciplinas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabDisciplinasMouseClicked(evt);
            }
        });
        tabDisciplinas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSubjects.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSubjects.setForeground(new java.awt.Color(72, 71, 97));
        lblSubjects.setText("Disciplinas");
        tabDisciplinas.add(lblSubjects, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, 50));

        tabProfessores.setBackground(new java.awt.Color(255, 255, 255));
        tabProfessores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabProfessoresMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(72, 71, 97));
        jLabel3.setText("Professores");

        javax.swing.GroupLayout tabProfessoresLayout = new javax.swing.GroupLayout(tabProfessores);
        tabProfessores.setLayout(tabProfessoresLayout);
        tabProfessoresLayout.setHorizontalGroup(
            tabProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabProfessoresLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabProfessoresLayout.setVerticalGroup(
            tabProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        tabAlunos.setBackground(new java.awt.Color(255, 255, 255));
        tabAlunos.setPreferredSize(new java.awt.Dimension(216, 50));
        tabAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabAlunosMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(72, 71, 97));
        jLabel4.setText("Alunos");

        javax.swing.GroupLayout tabAlunosLayout = new javax.swing.GroupLayout(tabAlunos);
        tabAlunos.setLayout(tabAlunosLayout);
        tabAlunosLayout.setHorizontalGroup(
            tabAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabAlunosLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabAlunosLayout.setVerticalGroup(
            tabAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        tabTecAdm.setBackground(new java.awt.Color(255, 255, 255));
        tabTecAdm.setPreferredSize(new java.awt.Dimension(216, 50));
        tabTecAdm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabTecAdmMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(72, 71, 97));
        jLabel5.setText("Tec Administrativo");

        javax.swing.GroupLayout tabTecAdmLayout = new javax.swing.GroupLayout(tabTecAdm);
        tabTecAdm.setLayout(tabTecAdmLayout);
        tabTecAdmLayout.setHorizontalGroup(
            tabTecAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabTecAdmLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabTecAdmLayout.setVerticalGroup(
            tabTecAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        tabCursos.setBackground(new java.awt.Color(255, 255, 255));
        tabCursos.setPreferredSize(new java.awt.Dimension(216, 50));
        tabCursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabCursosMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(72, 71, 97));
        jLabel6.setText("Cursos");

        javax.swing.GroupLayout tabCursosLayout = new javax.swing.GroupLayout(tabCursos);
        tabCursos.setLayout(tabCursosLayout);
        tabCursosLayout.setHorizontalGroup(
            tabCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCursosLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabCursosLayout.setVerticalGroup(
            tabCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        tabResponsaveis.setBackground(new java.awt.Color(255, 255, 255));
        tabResponsaveis.setPreferredSize(new java.awt.Dimension(216, 50));
        tabResponsaveis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabResponsaveisMouseClicked(evt);
            }
        });

        lblResponsaveis.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblResponsaveis.setForeground(new java.awt.Color(72, 71, 97));
        lblResponsaveis.setText("Responsáveis");

        javax.swing.GroupLayout tabResponsaveisLayout = new javax.swing.GroupLayout(tabResponsaveis);
        tabResponsaveis.setLayout(tabResponsaveisLayout);
        tabResponsaveisLayout.setHorizontalGroup(
            tabResponsaveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabResponsaveisLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(lblResponsaveis, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabResponsaveisLayout.setVerticalGroup(
            tabResponsaveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblResponsaveis, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        tabInicio.setBackground(new java.awt.Color(255, 255, 255));
        tabInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabInicioMouseClicked(evt);
            }
        });

        lblInicio.setBackground(new java.awt.Color(204, 204, 204));
        lblInicio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblInicio.setForeground(new java.awt.Color(72, 71, 97));
        lblInicio.setText("Início");

        javax.swing.GroupLayout tabInicioLayout = new javax.swing.GroupLayout(tabInicio);
        tabInicio.setLayout(tabInicioLayout);
        tabInicioLayout.setHorizontalGroup(
            tabInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabInicioLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(lblInicio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabInicioLayout.setVerticalGroup(
            tabInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        tabEtapas.setBackground(new java.awt.Color(255, 255, 255));
        tabEtapas.setPreferredSize(new java.awt.Dimension(216, 50));
        tabEtapas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabEtapasMouseClicked(evt);
            }
        });
        tabEtapas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEtapas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEtapas.setForeground(new java.awt.Color(72, 71, 97));
        lblEtapas.setText("Etapas");
        tabEtapas.add(lblEtapas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, 50));

        javax.swing.GroupLayout pnlNavBarLayout = new javax.swing.GroupLayout(pnlNavBar);
        pnlNavBar.setLayout(pnlNavBarLayout);
        pnlNavBarLayout.setHorizontalGroup(
            pnlNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabDisciplinas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabProfessores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabCursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabResponsaveis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabConselhos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabAlunos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabTecAdm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlNavBarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tabEtapas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlNavBarLayout.setVerticalGroup(
            pnlNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNavBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tabInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabConselhos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabProfessores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabTecAdm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabResponsaveis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabEtapas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlTelas.setBackground(new java.awt.Color(255, 255, 255));
        pnlTelas.setLayout(new javax.swing.OverlayLayout(pnlTelas));

        pnlInicio.setBackground(new java.awt.Color(72, 71, 97));

        pnlMainBarClassCouncil1.setBackground(new java.awt.Color(72, 71, 97));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Opa admin");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel1)
                .addContainerGap(160, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel1)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlMainBarClassCouncil1Layout = new javax.swing.GroupLayout(pnlMainBarClassCouncil1);
        pnlMainBarClassCouncil1.setLayout(pnlMainBarClassCouncil1Layout);
        pnlMainBarClassCouncil1Layout.setHorizontalGroup(
            pnlMainBarClassCouncil1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainBarClassCouncil1Layout.createSequentialGroup()
                .addContainerGap(278, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(296, Short.MAX_VALUE))
        );
        pnlMainBarClassCouncil1Layout.setVerticalGroup(
            pnlMainBarClassCouncil1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainBarClassCouncil1Layout.createSequentialGroup()
                .addContainerGap(206, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlInicioLayout = new javax.swing.GroupLayout(pnlInicio);
        pnlInicio.setLayout(pnlInicioLayout);
        pnlInicioLayout.setHorizontalGroup(
            pnlInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMainBarClassCouncil1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlInicioLayout.setVerticalGroup(
            pnlInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMainBarClassCouncil1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlTelas.add(pnlInicio);

        pnlConselhos.setBackground(new java.awt.Color(72, 71, 97));

        pnlMainBarClassCouncil.setBackground(new java.awt.Color(72, 71, 97));

        btnAddClassCouncil.setText("Adicionar Conselho");
        btnAddClassCouncil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddClassCouncilActionPerformed(evt);
            }
        });

        txtSearchClassCouncil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchClassCouncilActionPerformed(evt);
            }
        });

        btnSearchClassCouncil.setText("Buscar");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Curso 1", "Curso 2", "Curso 3" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        btnCursosConselhos.setText("+");
        btnCursosConselhos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCursosConselhosActionPerformed(evt);
            }
        });

        BoxTurmaConselho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Curso 1", "Curso 2", "Curso 3" }));
        BoxTurmaConselho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxTurmaConselhoActionPerformed(evt);
            }
        });

        btnTurmaConselho.setText("+");
        btnTurmaConselho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTurmaConselhoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMainBarClassCouncilLayout = new javax.swing.GroupLayout(pnlMainBarClassCouncil);
        pnlMainBarClassCouncil.setLayout(pnlMainBarClassCouncilLayout);
        pnlMainBarClassCouncilLayout.setHorizontalGroup(
            pnlMainBarClassCouncilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainBarClassCouncilLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(pnlMainBarClassCouncilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BoxTurmaConselho, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMainBarClassCouncilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainBarClassCouncilLayout.createSequentialGroup()
                        .addComponent(btnCursosConselhos, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(txtSearchClassCouncil, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchClassCouncil, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(btnAddClassCouncil, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(pnlMainBarClassCouncilLayout.createSequentialGroup()
                        .addComponent(btnTurmaConselho, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlMainBarClassCouncilLayout.setVerticalGroup(
            pnlMainBarClassCouncilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainBarClassCouncilLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMainBarClassCouncilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlMainBarClassCouncilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCursosConselhos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlMainBarClassCouncilLayout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addGroup(pnlMainBarClassCouncilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSearchClassCouncil, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddClassCouncil, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSearchClassCouncil, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlMainBarClassCouncilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BoxTurmaConselho, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTurmaConselho, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CodigoConselho", "Trimeste", "AnoLetivo", "CodigoAta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(2).setHeaderValue("AnoLetivo");
            jTable1.getColumnModel().getColumn(3).setHeaderValue("CodigoAta");
        }

        btnEditarConselho.setText("Editar");

        btnDeletarConselho.setText("Deletar");

        javax.swing.GroupLayout pnlConselhosLayout = new javax.swing.GroupLayout(pnlConselhos);
        pnlConselhos.setLayout(pnlConselhosLayout);
        pnlConselhosLayout.setHorizontalGroup(
            pnlConselhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMainBarClassCouncil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlConselhosLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(btnEditarConselho, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDeletarConselho, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addGroup(pnlConselhosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(pnlConselhosLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(txtEditarConselho, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlConselhosLayout.setVerticalGroup(
            pnlConselhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConselhosLayout.createSequentialGroup()
                .addComponent(pnlMainBarClassCouncil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtEditarConselho, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlConselhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarConselho, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletarConselho, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(131, Short.MAX_VALUE))
        );

        pnlTelas.add(pnlConselhos);

        pnlDisciplinas.setBackground(new java.awt.Color(72, 71, 97));

        pnlMainBarSubjects.setBackground(new java.awt.Color(72, 71, 97));

        btnAddSubjects.setText("Adicionar Disciplina");
        btnAddSubjects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSubjectsActionPerformed(evt);
            }
        });

        txtSearchSubjects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchSubjectsActionPerformed(evt);
            }
        });

        btnSearchSubjects.setText("Buscar");
        btnSearchSubjects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchSubjectsActionPerformed(evt);
            }
        });

        jRadioButton4.setText("Turma1");

        jRadioButton5.setText("Turma2");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        jRadioButton6.setText("Turma3");

        btnMenuTurmasDisciplinas.setText("+");
        btnMenuTurmasDisciplinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuTurmasDisciplinasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMainBarSubjectsLayout = new javax.swing.GroupLayout(pnlMainBarSubjects);
        pnlMainBarSubjects.setLayout(pnlMainBarSubjectsLayout);
        pnlMainBarSubjectsLayout.setHorizontalGroup(
            pnlMainBarSubjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainBarSubjectsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton5)
                .addGroup(pnlMainBarSubjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainBarSubjectsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtSearchSubjects, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearchSubjects, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(btnAddSubjects, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMainBarSubjectsLayout.createSequentialGroup()
                        .addComponent(jRadioButton6)
                        .addGap(18, 18, 18)
                        .addComponent(btnMenuTurmasDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlMainBarSubjectsLayout.setVerticalGroup(
            pnlMainBarSubjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainBarSubjectsLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(pnlMainBarSubjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearchSubjects, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddSubjects, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearchSubjects, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(pnlMainBarSubjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton6)
                    .addComponent(btnMenuTurmasDisciplinas)))
        );

        tblDisciplinas.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        tblDisciplinas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Professor", "Etapa", "Codigo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spnlSubjects.setViewportView(tblDisciplinas);

        btnEditarDisciplina.setText("Editar");

        btnDeletarDisciplinas.setText("Deletar");

        javax.swing.GroupLayout pnlDisciplinasLayout = new javax.swing.GroupLayout(pnlDisciplinas);
        pnlDisciplinas.setLayout(pnlDisciplinasLayout);
        pnlDisciplinasLayout.setHorizontalGroup(
            pnlDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDisciplinasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spnlSubjects, javax.swing.GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(pnlMainBarSubjects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlDisciplinasLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(btnEditarDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDeletarDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(pnlDisciplinasLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(txtEditarDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDisciplinasLayout.setVerticalGroup(
            pnlDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDisciplinasLayout.createSequentialGroup()
                .addComponent(pnlMainBarSubjects, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnlSubjects, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtEditarDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletarDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        pnlTelas.add(pnlDisciplinas);

        pnlProfessores.setBackground(new java.awt.Color(72, 71, 97));

        pnlMainBarTeachers.setBackground(new java.awt.Color(72, 71, 97));

        btnAddTeacher.setText("Adicionar Professor");
        btnAddTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTeacherActionPerformed(evt);
            }
        });

        txtSearchTeachers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchTeachersActionPerformed(evt);
            }
        });

        btnSearchTeachers.setText("Buscar");

        javax.swing.GroupLayout pnlMainBarTeachersLayout = new javax.swing.GroupLayout(pnlMainBarTeachers);
        pnlMainBarTeachers.setLayout(pnlMainBarTeachersLayout);
        pnlMainBarTeachersLayout.setHorizontalGroup(
            pnlMainBarTeachersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainBarTeachersLayout.createSequentialGroup()
                .addGap(138, 343, Short.MAX_VALUE)
                .addComponent(txtSearchTeachers, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearchTeachers, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121)
                .addComponent(btnAddTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlMainBarTeachersLayout.setVerticalGroup(
            pnlMainBarTeachersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainBarTeachersLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(pnlMainBarTeachersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearchTeachers, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearchTeachers, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        tblProfessores.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        tblProfessores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Tefelefone", "Email", "Login", "Senha", "Siap", "TipoUsuario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spnlProfessores.setViewportView(tblProfessores);

        btnEditarProfessor.setText("Editar");

        btnDeletarProfessor.setText("Deletar");

        javax.swing.GroupLayout pnlProfessoresLayout = new javax.swing.GroupLayout(pnlProfessores);
        pnlProfessores.setLayout(pnlProfessoresLayout);
        pnlProfessoresLayout.setHorizontalGroup(
            pnlProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMainBarTeachers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlProfessoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spnlProfessores, javax.swing.GroupLayout.DEFAULT_SIZE, 951, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlProfessoresLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(txtEditarProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlProfessoresLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(btnEditarProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDeletarProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        pnlProfessoresLayout.setVerticalGroup(
            pnlProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProfessoresLayout.createSequentialGroup()
                .addComponent(pnlMainBarTeachers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnlProfessores, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(txtEditarProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletarProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pnlTelas.add(pnlProfessores);

        pnlAlunos.setBackground(new java.awt.Color(72, 71, 97));

        pnlMainBarStudents.setBackground(new java.awt.Color(72, 71, 97));

        btnAddStudent.setText("Adicionar Aluno");
        btnAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStudentActionPerformed(evt);
            }
        });

        txtSearchStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchStudentActionPerformed(evt);
            }
        });

        btnSearchStudent.setText("Buscar");
        btnSearchStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchStudentActionPerformed(evt);
            }
        });

        btnMenuCursoAlunos.setText("+");
        btnMenuCursoAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuCursoAlunosActionPerformed(evt);
            }
        });

        btnMenuTurmaAlunos.setText("+");
        btnMenuTurmaAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuTurmaAlunosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMainBarStudentsLayout = new javax.swing.GroupLayout(pnlMainBarStudents);
        pnlMainBarStudents.setLayout(pnlMainBarStudentsLayout);
        pnlMainBarStudentsLayout.setHorizontalGroup(
            pnlMainBarStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainBarStudentsLayout.createSequentialGroup()
                .addGroup(pnlMainBarStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainBarStudentsLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(cmbCursosAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMenuCursoAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMainBarStudentsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cmbTurmaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMenuTurmaAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(txtSearchStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearchStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addComponent(btnAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        pnlMainBarStudentsLayout.setVerticalGroup(
            pnlMainBarStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainBarStudentsLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(pnlMainBarStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainBarStudentsLayout.createSequentialGroup()
                        .addGroup(pnlMainBarStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearchStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearchStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42))
                    .addGroup(pnlMainBarStudentsLayout.createSequentialGroup()
                        .addGroup(pnlMainBarStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMenuCursoAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbCursosAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlMainBarStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbTurmaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMenuTurmaAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        tblAlunos.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        tblAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Telefone", "Email", "Cpf", "Login", "Senha", "TipoUsuario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spnlAlunos.setViewportView(tblAlunos);

        btnEditarAluno.setText("Editar");
        btnEditarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarAlunoActionPerformed(evt);
            }
        });

        btnDeletarAluno.setText("Deletar");

        javax.swing.GroupLayout pnlAlunosLayout = new javax.swing.GroupLayout(pnlAlunos);
        pnlAlunos.setLayout(pnlAlunosLayout);
        pnlAlunosLayout.setHorizontalGroup(
            pnlAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAlunosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlMainBarStudents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlAlunosLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(btnEditarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlAlunosLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(txtEditarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDeletarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
            .addGroup(pnlAlunosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spnlAlunos)
                .addContainerGap())
        );
        pnlAlunosLayout.setVerticalGroup(
            pnlAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAlunosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlMainBarStudents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(spnlAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(pnlAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEditarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnEditarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        pnlTelas.add(pnlAlunos);

        pnlCursos.setBackground(new java.awt.Color(72, 71, 97));

        pnlMainBarClassCouncil3.setBackground(new java.awt.Color(72, 71, 97));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Opa curso");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel7)
                .addContainerGap(160, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel7)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlMainBarClassCouncil3Layout = new javax.swing.GroupLayout(pnlMainBarClassCouncil3);
        pnlMainBarClassCouncil3.setLayout(pnlMainBarClassCouncil3Layout);
        pnlMainBarClassCouncil3Layout.setHorizontalGroup(
            pnlMainBarClassCouncil3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainBarClassCouncil3Layout.createSequentialGroup()
                .addContainerGap(308, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(244, 244, 244))
        );
        pnlMainBarClassCouncil3Layout.setVerticalGroup(
            pnlMainBarClassCouncil3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainBarClassCouncil3Layout.createSequentialGroup()
                .addContainerGap(166, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout pnlCursosLayout = new javax.swing.GroupLayout(pnlCursos);
        pnlCursos.setLayout(pnlCursosLayout);
        pnlCursosLayout.setHorizontalGroup(
            pnlCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMainBarClassCouncil3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlCursosLayout.setVerticalGroup(
            pnlCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCursosLayout.createSequentialGroup()
                .addComponent(pnlMainBarClassCouncil3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 141, Short.MAX_VALUE))
        );

        pnlTelas.add(pnlCursos);

        pnlCoordenadores.setBackground(new java.awt.Color(72, 71, 97));

        pnlMainBarClassCouncil2.setBackground(new java.awt.Color(72, 71, 97));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Opa coordenador");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel2)
                .addContainerGap(160, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel2)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlMainBarClassCouncil2Layout = new javax.swing.GroupLayout(pnlMainBarClassCouncil2);
        pnlMainBarClassCouncil2.setLayout(pnlMainBarClassCouncil2Layout);
        pnlMainBarClassCouncil2Layout.setHorizontalGroup(
            pnlMainBarClassCouncil2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainBarClassCouncil2Layout.createSequentialGroup()
                .addContainerGap(263, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(244, 244, 244))
        );
        pnlMainBarClassCouncil2Layout.setVerticalGroup(
            pnlMainBarClassCouncil2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainBarClassCouncil2Layout.createSequentialGroup()
                .addContainerGap(166, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout pnlCoordenadoresLayout = new javax.swing.GroupLayout(pnlCoordenadores);
        pnlCoordenadores.setLayout(pnlCoordenadoresLayout);
        pnlCoordenadoresLayout.setHorizontalGroup(
            pnlCoordenadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMainBarClassCouncil2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlCoordenadoresLayout.setVerticalGroup(
            pnlCoordenadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCoordenadoresLayout.createSequentialGroup()
                .addComponent(pnlMainBarClassCouncil2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 141, Short.MAX_VALUE))
        );

        pnlTelas.add(pnlCoordenadores);

        pnlResponsaveis.setBackground(new java.awt.Color(72, 71, 97));

        pnlMainBarClassCouncil4.setBackground(new java.awt.Color(72, 71, 97));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Opa responsavel");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel8)
                .addContainerGap(160, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel8)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlMainBarClassCouncil4Layout = new javax.swing.GroupLayout(pnlMainBarClassCouncil4);
        pnlMainBarClassCouncil4.setLayout(pnlMainBarClassCouncil4Layout);
        pnlMainBarClassCouncil4Layout.setHorizontalGroup(
            pnlMainBarClassCouncil4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainBarClassCouncil4Layout.createSequentialGroup()
                .addContainerGap(270, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(244, 244, 244))
        );
        pnlMainBarClassCouncil4Layout.setVerticalGroup(
            pnlMainBarClassCouncil4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainBarClassCouncil4Layout.createSequentialGroup()
                .addContainerGap(166, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout pnlResponsaveisLayout = new javax.swing.GroupLayout(pnlResponsaveis);
        pnlResponsaveis.setLayout(pnlResponsaveisLayout);
        pnlResponsaveisLayout.setHorizontalGroup(
            pnlResponsaveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMainBarClassCouncil4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlResponsaveisLayout.setVerticalGroup(
            pnlResponsaveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResponsaveisLayout.createSequentialGroup()
                .addComponent(pnlMainBarClassCouncil4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 141, Short.MAX_VALUE))
        );

        pnlTelas.add(pnlResponsaveis);

        pnlEtapas.setBackground(new java.awt.Color(72, 71, 97));

        pnlMainBarClassEtapas.setBackground(new java.awt.Color(72, 71, 97));

        btnAddClassEtapas.setText("Adicionar Etapa");
        btnAddClassEtapas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddClassEtapasActionPerformed(evt);
            }
        });

        txtSearchClassEtapas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchClassEtapasActionPerformed(evt);
            }
        });

        btnSearchClassEtapas.setText("Buscar");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Curso 1", "Curso 2", "Curso 3" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        btnMenuTurmaEtapas.setText("+");
        btnMenuTurmaEtapas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuTurmaEtapasActionPerformed(evt);
            }
        });

        jRadioButton13.setText("Turma1");

        jRadioButton14.setText("Turma2");

        jRadioButton15.setText("Turma3");

        jButton3.setText("+");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMainBarClassEtapasLayout = new javax.swing.GroupLayout(pnlMainBarClassEtapas);
        pnlMainBarClassEtapas.setLayout(pnlMainBarClassEtapasLayout);
        pnlMainBarClassEtapasLayout.setHorizontalGroup(
            pnlMainBarClassEtapasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainBarClassEtapasLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnlMainBarClassEtapasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnlMainBarClassEtapasLayout.createSequentialGroup()
                        .addComponent(jRadioButton13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton14))
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMainBarClassEtapasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainBarClassEtapasLayout.createSequentialGroup()
                        .addComponent(btnMenuTurmaEtapas, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addComponent(txtSearchClassEtapas, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchClassEtapas, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(btnAddClassEtapas, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(pnlMainBarClassEtapasLayout.createSequentialGroup()
                        .addComponent(jRadioButton15)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlMainBarClassEtapasLayout.setVerticalGroup(
            pnlMainBarClassEtapasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainBarClassEtapasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMainBarClassEtapasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlMainBarClassEtapasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnMenuTurmaEtapas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlMainBarClassEtapasLayout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addGroup(pnlMainBarClassEtapasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSearchClassEtapas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddClassEtapas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSearchClassEtapas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlMainBarClassEtapasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton13)
                    .addComponent(jRadioButton14)
                    .addComponent(jRadioButton15)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Código"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        btnEditarEtapa.setText("Editar");

        btnDeletarEtapa.setText("Deletar");

        javax.swing.GroupLayout pnlEtapasLayout = new javax.swing.GroupLayout(pnlEtapas);
        pnlEtapas.setLayout(pnlEtapasLayout);
        pnlEtapasLayout.setHorizontalGroup(
            pnlEtapasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMainBarClassEtapas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlEtapasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(pnlEtapasLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(txtEditarEtapa, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlEtapasLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(btnEditarEtapa, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDeletarEtapa, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
        );
        pnlEtapasLayout.setVerticalGroup(
            pnlEtapasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEtapasLayout.createSequentialGroup()
                .addComponent(pnlMainBarClassEtapas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtEditarEtapa, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEtapasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarEtapa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletarEtapa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pnlTelas.add(pnlEtapas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlNavBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlNavBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlTelas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchStudentActionPerformed

    private void txtSearchTeachersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchTeachersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchTeachersActionPerformed

    private void txtSearchClassCouncilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchClassCouncilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchClassCouncilActionPerformed

    private void txtSearchSubjectsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchSubjectsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchSubjectsActionPerformed

    private void tabAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabAlunosMouseClicked
        pnlConselhos.setVisible(false);
        pnlDisciplinas.setVisible(false);
        pnlProfessores.setVisible(false);
        pnlInicio.setVisible(false);
        pnlResponsaveis.setVisible(false);
        pnlCoordenadores.setVisible(false);
        pnlAlunos.setVisible(true);
        pnlCursos.setVisible(false);        
        pnlEtapas.setVisible(false);

        tabAlunos.setBackground(new Color(255,255,255));
        tabInicio.setBackground(new Color(204,204,255));
        tabDisciplinas.setBackground(new Color(204,204,255));
        tabProfessores.setBackground(new Color(204,204,255));
        tabConselhos.setBackground(new Color(204,204,255));
        tabTecAdm.setBackground(new Color(204,204,255));
        tabCursos.setBackground(new Color(204,204,255));
        tabResponsaveis.setBackground(new Color(204,204,255));
        tabEtapas.setBackground(new Color(204,204,255));
        

        CmbTurmaListener();
        
    }//GEN-LAST:event_tabAlunosMouseClicked

    private void tabProfessoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabProfessoresMouseClicked
        pnlProfessores.setVisible(true);
        pnlConselhos.setVisible(false);
        pnlDisciplinas.setVisible(false);
        pnlAlunos.setVisible(false);
        pnlInicio.setVisible(false);
        pnlResponsaveis.setVisible(false);
        pnlCoordenadores.setVisible(false);
        pnlCursos.setVisible(false);
        pnlEtapas.setVisible(false);
        
        tabProfessores.setBackground(new Color(255,255,255));
        tabInicio.setBackground(new Color(204,204,255));
        tabDisciplinas.setBackground(new Color(204,204,255));
        tabAlunos.setBackground(new Color(204,204,255));
        tabConselhos.setBackground(new Color(204,204,255));
        tabTecAdm.setBackground(new Color(204,204,255));
        tabCursos.setBackground(new Color(204,204,255));
        tabResponsaveis.setBackground(new Color(204,204,255));
        tabEtapas.setBackground(new Color(204,204,255));
        
    }//GEN-LAST:event_tabProfessoresMouseClicked

    private void tabDisciplinasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabDisciplinasMouseClicked
        pnlDisciplinas.setVisible(true);
        pnlProfessores.setVisible(false);
        pnlConselhos.setVisible(false);
        pnlAlunos.setVisible(false);
        pnlInicio.setVisible(false);
        pnlResponsaveis.setVisible(false);
        pnlCoordenadores.setVisible(false);
        pnlCursos.setVisible(false);
        pnlEtapas.setVisible(false);
     //   CmbBoxDisciplinasListener();

        tabDisciplinas.setBackground(new Color(255,255,255));
        tabInicio.setBackground(new Color(204,204,255));
        tabProfessores.setBackground(new Color(204,204,255));
        tabAlunos.setBackground(new Color(204,204,255));
        tabConselhos.setBackground(new Color(204,204,255));
        tabTecAdm.setBackground(new Color(204,204,255));
        tabCursos.setBackground(new Color(204,204,255));
        tabResponsaveis.setBackground(new Color(204,204,255));
        tabEtapas.setBackground(new Color(204,204,255));
        
    }//GEN-LAST:event_tabDisciplinasMouseClicked

    private void tabConselhosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabConselhosMouseClicked
        pnlConselhos.setVisible(true);
        pnlDisciplinas.setVisible(false);
        pnlProfessores.setVisible(false);
        pnlAlunos.setVisible(false);
        pnlInicio.setVisible(false);
        pnlResponsaveis.setVisible(false);
        pnlCoordenadores.setVisible(false);
        pnlCursos.setVisible(false);
        pnlEtapas.setVisible(false);

        tabConselhos.setBackground(new Color(255,255,255));
        tabDisciplinas.setBackground(new Color(204,204,255));
        tabInicio.setBackground(new Color(204,204,255));
        tabProfessores.setBackground(new Color(204,204,255));
        tabAlunos.setBackground(new Color(204,204,255));
        tabTecAdm.setBackground(new Color(204,204,255));
        tabCursos.setBackground(new Color(204,204,255));
        tabResponsaveis.setBackground(new Color(204,204,255));
        tabEtapas.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_tabConselhosMouseClicked

    private void btnAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStudentActionPerformed
       this.dispose();
       CadastrarAluno tela1 = new CadastrarAluno();
       tela1.setVisible(true);
    }//GEN-LAST:event_btnAddStudentActionPerformed

    private void btnAddTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTeacherActionPerformed
       CadastrarProfessor tela = new CadastrarProfessor();
       this.dispose();
       tela.setVisible(true);
    }//GEN-LAST:event_btnAddTeacherActionPerformed

    private void btnAddSubjectsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSubjectsActionPerformed
        CadastrarDisciplina tela = new CadastrarDisciplina();
        this.dispose();
        tela.setVisible(true);

    }//GEN-LAST:event_btnAddSubjectsActionPerformed

    private void btnSearchSubjectsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchSubjectsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchSubjectsActionPerformed

    private void tabTecAdmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabTecAdmMouseClicked
        pnlCoordenadores.setVisible(true);
        pnlConselhos.setVisible(false);
        pnlDisciplinas.setVisible(false);
        pnlProfessores.setVisible(false);
        pnlAlunos.setVisible(false);
        pnlInicio.setVisible(false);
        pnlResponsaveis.setVisible(false);
        pnlCursos.setVisible(false);
        pnlEtapas.setVisible(false);
        
        tabTecAdm.setBackground(new Color(255,255,255));
        tabConselhos.setBackground(new Color(204,204,255));
        tabDisciplinas.setBackground(new Color(204,204,255));
        tabInicio.setBackground(new Color(204,204,255));
        tabProfessores.setBackground(new Color(204,204,255));
        tabAlunos.setBackground(new Color(204,204,255));
        tabCursos.setBackground(new Color(204,204,255));
        tabResponsaveis.setBackground(new Color(204,204,255));
        tabEtapas.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_tabTecAdmMouseClicked

    private void tabCursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabCursosMouseClicked
        pnlCursos.setVisible(true);
        pnlCoordenadores.setVisible(false);
        pnlConselhos.setVisible(false);
        pnlDisciplinas.setVisible(false);
        pnlProfessores.setVisible(false);
        pnlAlunos.setVisible(false);
        pnlInicio.setVisible(false);
        pnlResponsaveis.setVisible(false);
        pnlEtapas.setVisible(false);

        tabCursos.setBackground(new Color(255,255,255));
        tabTecAdm.setBackground(new Color(204,204,255));
        tabConselhos.setBackground(new Color(204,204,255));
        tabDisciplinas.setBackground(new Color(204,204,255));
        tabInicio.setBackground(new Color(204,204,255));
        tabProfessores.setBackground(new Color(204,204,255));
        tabAlunos.setBackground(new Color(204,204,255));
        tabResponsaveis.setBackground(new Color(204,204,255));
        tabEtapas.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_tabCursosMouseClicked

    private void tabResponsaveisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabResponsaveisMouseClicked
        pnlResponsaveis.setVisible(true);
        pnlCursos.setVisible(false);
        pnlCoordenadores.setVisible(false);
        pnlConselhos.setVisible(false);
        pnlDisciplinas.setVisible(false);
        pnlProfessores.setVisible(false);
        pnlAlunos.setVisible(false);
        pnlInicio.setVisible(false);
        pnlEtapas.setVisible(false);

        tabResponsaveis.setBackground(new Color(255,255,255));
        tabTecAdm.setBackground(new Color(204,204,255));
        tabConselhos.setBackground(new Color(204,204,255));
        tabDisciplinas.setBackground(new Color(204,204,255));
        tabInicio.setBackground(new Color(204,204,255));
        tabProfessores.setBackground(new Color(204,204,255));
        tabAlunos.setBackground(new Color(204,204,255));
        tabCursos.setBackground(new Color(204,204,255));
        tabEtapas.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_tabResponsaveisMouseClicked

    private void tabInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabInicioMouseClicked
        pnlInicio.setVisible(true);
        pnlResponsaveis.setVisible(false);
        pnlCursos.setVisible(false);
        pnlCoordenadores.setVisible(false);
        pnlConselhos.setVisible(false);
        pnlDisciplinas.setVisible(false);
        pnlProfessores.setVisible(false);
        pnlAlunos.setVisible(false);
        pnlResponsaveis.setVisible(false);
        pnlEtapas.setVisible(false);
        
        tabInicio.setBackground(new Color(255,255,255));
        tabTecAdm.setBackground(new Color(204,204,255));
        tabConselhos.setBackground(new Color(204,204,255));
        tabDisciplinas.setBackground(new Color(204,204,255));
        tabResponsaveis.setBackground(new Color(204,204,255));
        tabProfessores.setBackground(new Color(204,204,255));
        tabAlunos.setBackground(new Color(204,204,255));
        tabCursos.setBackground(new Color(204,204,255));
        tabEtapas.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_tabInicioMouseClicked

    private void btnSearchStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchStudentActionPerformed
       
    }//GEN-LAST:event_btnSearchStudentActionPerformed

    private void btnAddClassCouncilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddClassCouncilActionPerformed
        MenuTurma telaTurma = new MenuTurma();
        this.dispose();
        telaTurma.setVisible(true);
    }//GEN-LAST:event_btnAddClassCouncilActionPerformed

    private void btnCursosConselhosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCursosConselhosActionPerformed
        MenuCurso telaCurso = new MenuCurso();
        this.dispose();
        telaCurso.setVisible(true);
    }//GEN-LAST:event_btnCursosConselhosActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void btnMenuCursoAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuCursoAlunosActionPerformed
        MenuCurso telaCurso = new MenuCurso();
        this.dispose();
        telaCurso.setVisible(true);
    }//GEN-LAST:event_btnMenuCursoAlunosActionPerformed

    private void tabEtapasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabEtapasMouseClicked
        pnlEtapas.setVisible(true);
        pnlInicio.setVisible(false);
        pnlResponsaveis.setVisible(false);
        pnlCursos.setVisible(false);
        pnlCoordenadores.setVisible(false);
        pnlConselhos.setVisible(false);
        pnlDisciplinas.setVisible(false);
        pnlProfessores.setVisible(false);
        pnlAlunos.setVisible(false);
        pnlResponsaveis.setVisible(false);
        
        tabInicio.setBackground(new Color(204,204,255));
        tabTecAdm.setBackground(new Color(204,204,255));
        tabConselhos.setBackground(new Color(204,204,255));
        tabDisciplinas.setBackground(new Color(204,204,255));
        tabResponsaveis.setBackground(new Color(204,204,255));
        tabProfessores.setBackground(new Color(204,204,255));
        tabAlunos.setBackground(new Color(204,204,255));
        tabCursos.setBackground(new Color(204,204,255));
        tabEtapas.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_tabEtapasMouseClicked

    private void btnAddClassEtapasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddClassEtapasActionPerformed
        CadastrarEtapa tela = new CadastrarEtapa();
        this.dispose();
        tela.setVisible(true);
    }//GEN-LAST:event_btnAddClassEtapasActionPerformed

    private void txtSearchClassEtapasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchClassEtapasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchClassEtapasActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void btnMenuTurmaEtapasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuTurmaEtapasActionPerformed
        // TODO add your handling code here:
        MenuCurso telaCurso = new MenuCurso();
        this.dispose();
        telaCurso.setVisible(true);
    }//GEN-LAST:event_btnMenuTurmaEtapasActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        MenuTurma telaTurma = new MenuTurma();
        this.dispose();
        telaTurma.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BoxTurmaConselhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxTurmaConselhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxTurmaConselhoActionPerformed

    private void btnTurmaConselhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTurmaConselhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTurmaConselhoActionPerformed

    private void btnMenuTurmaAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuTurmaAlunosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMenuTurmaAlunosActionPerformed

    private void btnMenuTurmasDisciplinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuTurmasDisciplinasActionPerformed
        // TODO add your handling code here:
        MenuTurma telaTurma = new MenuTurma();
        this.dispose();
        telaTurma.setVisible(true);
    }//GEN-LAST:event_btnMenuTurmasDisciplinasActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void btnEditarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarAlunoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        HomeScreen tela = new HomeScreen();
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                tela.setVisible(true);
                System.out.println("teste");
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BoxTurmaConselho;
    private javax.swing.JButton btnAddClassCouncil;
    private javax.swing.JButton btnAddClassEtapas;
    private javax.swing.JButton btnAddStudent;
    private javax.swing.JButton btnAddSubjects;
    private javax.swing.JButton btnAddTeacher;
    private javax.swing.JButton btnCursosConselhos;
    private javax.swing.JButton btnDeletarAluno;
    private javax.swing.JButton btnDeletarConselho;
    private javax.swing.JButton btnDeletarDisciplinas;
    private javax.swing.JButton btnDeletarEtapa;
    private javax.swing.JButton btnDeletarProfessor;
    private javax.swing.JButton btnEditarAluno;
    private javax.swing.JButton btnEditarConselho;
    private javax.swing.JButton btnEditarDisciplina;
    private javax.swing.JButton btnEditarEtapa;
    private javax.swing.JButton btnEditarProfessor;
    private javax.swing.JButton btnMenuCursoAlunos;
    private javax.swing.JButton btnMenuTurmaAlunos;
    private javax.swing.JButton btnMenuTurmaEtapas;
    private javax.swing.JButton btnMenuTurmasDisciplinas;
    private javax.swing.JButton btnSearchClassCouncil;
    private javax.swing.JButton btnSearchClassEtapas;
    private javax.swing.JButton btnSearchStudent;
    private javax.swing.JButton btnSearchSubjects;
    private javax.swing.JButton btnSearchTeachers;
    private javax.swing.JButton btnTurmaConselho;
    private javax.swing.JComboBox<String> cmbCursosAlunos;
    private javax.swing.JComboBox<String> cmbTurmaAluno;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblConselho;
    private javax.swing.JLabel lblEtapas;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblResponsaveis;
    private javax.swing.JLabel lblSubjects;
    private javax.swing.JPanel pnlAlunos;
    private javax.swing.JPanel pnlConselhos;
    private javax.swing.JPanel pnlCoordenadores;
    private javax.swing.JPanel pnlCursos;
    private javax.swing.JPanel pnlDisciplinas;
    private javax.swing.JPanel pnlEtapas;
    private javax.swing.JPanel pnlInicio;
    private javax.swing.JPanel pnlMainBarClassCouncil;
    private javax.swing.JPanel pnlMainBarClassCouncil1;
    private javax.swing.JPanel pnlMainBarClassCouncil2;
    private javax.swing.JPanel pnlMainBarClassCouncil3;
    private javax.swing.JPanel pnlMainBarClassCouncil4;
    private javax.swing.JPanel pnlMainBarClassEtapas;
    private javax.swing.JPanel pnlMainBarStudents;
    private javax.swing.JPanel pnlMainBarSubjects;
    private javax.swing.JPanel pnlMainBarTeachers;
    private javax.swing.JPanel pnlNavBar;
    private javax.swing.JPanel pnlProfessores;
    private javax.swing.JPanel pnlResponsaveis;
    private javax.swing.JPanel pnlTelas;
    private javax.swing.JScrollPane spnlAlunos;
    private javax.swing.JScrollPane spnlProfessores;
    private javax.swing.JScrollPane spnlSubjects;
    private javax.swing.JPanel tabAlunos;
    private javax.swing.JPanel tabConselhos;
    private javax.swing.JPanel tabCursos;
    private javax.swing.JPanel tabDisciplinas;
    private javax.swing.JPanel tabEtapas;
    private javax.swing.JPanel tabInicio;
    private javax.swing.JPanel tabProfessores;
    private javax.swing.JPanel tabResponsaveis;
    private javax.swing.JPanel tabTecAdm;
    private javax.swing.JTable tblAlunos;
    private javax.swing.JTable tblDisciplinas;
    private javax.swing.JTable tblProfessores;
    private javax.swing.JTextField txtEditarAluno;
    private javax.swing.JTextField txtEditarConselho;
    private javax.swing.JTextField txtEditarDisciplina;
    private javax.swing.JTextField txtEditarEtapa;
    private javax.swing.JTextField txtEditarProfessor;
    private javax.swing.JTextField txtSearchClassCouncil;
    private javax.swing.JTextField txtSearchClassEtapas;
    private javax.swing.JTextField txtSearchStudent;
    private javax.swing.JTextField txtSearchSubjects;
    private javax.swing.JTextField txtSearchTeachers;
    // End of variables declaration//GEN-END:variables
}
