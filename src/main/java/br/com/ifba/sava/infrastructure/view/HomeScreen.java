/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.infrastructure.view;

import br.com.ifba.sava.aluno.model.Aluno;
import br.com.ifba.sava.aluno.view.CadastrarAluno;
import br.com.ifba.sava.disciplina.view.CadastrarDisciplina;
import br.com.ifba.sava.infrastructure.service.Facade;
import br.com.ifba.sava.infrastructure.service.FacadeInstance;
import br.com.ifba.sava.professor.view.CadastrarProfessor;
import java.awt.Color;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sheor
 */
public class HomeScreen extends javax.swing.JFrame {
    
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
        
        tabInicio.setBackground(new Color(255,255,255));
        tabAlunos.setBackground(new Color(204,204,255));
        tabDisciplinas.setBackground(new Color(204,204,255));
        tabProfessores.setBackground(new Color(204,204,255));
        tabConselhos.setBackground(new Color(204,204,255));
        tabCoordenadores.setBackground(new Color(204,204,255));
        tabCursos.setBackground(new Color(204,204,255));
        tabResponsaveis.setBackground(new Color(204,204,255));
        
    }
    void atualizaListaAlunos() {
        DefaultTableModel valores = (DefaultTableModel) tblStudents.getModel();
        while (tblStudents.getModel().getRowCount() > 0) {  
           ((DefaultTableModel) tblStudents.getModel()).removeRow(0);  
        } 

        List<Aluno> aluno = FacadeInstance.getInstance().getAllAlunos();
        for(int i = 0;i<aluno.size();i++){
            Object[] dados = {
                aluno.get(i).getNome(),
                aluno.get(i).getSobrenome(),
                aluno.get(i).getMatricula()
            };
            System.out.println("*********************************************");
            System.out.println("matricula aq: " + aluno.get(i).getMatricula());
            valores.addRow(dados);
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
        tabCoordenadores = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        tabCursos = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        tabResponsaveis = new javax.swing.JPanel();
        lblResponsaveis = new javax.swing.JLabel();
        tabInicio = new javax.swing.JPanel();
        lblInicio = new javax.swing.JLabel();
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
        pnlDisciplinas = new javax.swing.JPanel();
        pnlMainBarSubjects = new javax.swing.JPanel();
        btnAddSubjects = new javax.swing.JButton();
        txtSearchSubjects = new javax.swing.JTextField();
        btnSearchSubjects = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        spnlSubjects = new javax.swing.JScrollPane();
        tblSubjects = new javax.swing.JTable();
        pnlProfessores = new javax.swing.JPanel();
        pnlMainBarTeachers = new javax.swing.JPanel();
        btnAddTeacher = new javax.swing.JButton();
        txtSearchTeachers = new javax.swing.JTextField();
        btnSearchTeachers = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        spnlTeachers = new javax.swing.JScrollPane();
        tblTeachers = new javax.swing.JTable();
        pnlAlunos = new javax.swing.JPanel();
        pnlMainBarStudents = new javax.swing.JPanel();
        btnAddStudent = new javax.swing.JButton();
        txtSearchStudent = new javax.swing.JTextField();
        btnSearchStudent = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        spnlStudents = new javax.swing.JScrollPane();
        tblStudents = new javax.swing.JTable();
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

        tabCoordenadores.setBackground(new java.awt.Color(255, 255, 255));
        tabCoordenadores.setPreferredSize(new java.awt.Dimension(216, 50));
        tabCoordenadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabCoordenadoresMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(72, 71, 97));
        jLabel5.setText("Coordenadores");

        javax.swing.GroupLayout tabCoordenadoresLayout = new javax.swing.GroupLayout(tabCoordenadores);
        tabCoordenadores.setLayout(tabCoordenadoresLayout);
        tabCoordenadoresLayout.setHorizontalGroup(
            tabCoordenadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabCoordenadoresLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(51, 51, 51))
        );
        tabCoordenadoresLayout.setVerticalGroup(
            tabCoordenadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabResponsaveisLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblResponsaveis, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
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

        javax.swing.GroupLayout pnlNavBarLayout = new javax.swing.GroupLayout(pnlNavBar);
        pnlNavBar.setLayout(pnlNavBarLayout);
        pnlNavBarLayout.setHorizontalGroup(
            pnlNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabDisciplinas, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
            .addComponent(tabProfessores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabCoordenadores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
            .addComponent(tabCursos, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
            .addComponent(tabResponsaveis, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
            .addComponent(tabConselhos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabAlunos, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
            .addComponent(tabInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlNavBarLayout.setVerticalGroup(
            pnlNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNavBarLayout.createSequentialGroup()
                .addGap(52, 52, 52)
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
                .addComponent(tabCoordenadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabResponsaveis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(305, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(244, 244, 244))
        );
        pnlMainBarClassCouncil1Layout.setVerticalGroup(
            pnlMainBarClassCouncil1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainBarClassCouncil1Layout.createSequentialGroup()
                .addContainerGap(166, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout pnlInicioLayout = new javax.swing.GroupLayout(pnlInicio);
        pnlInicio.setLayout(pnlInicioLayout);
        pnlInicioLayout.setHorizontalGroup(
            pnlInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMainBarClassCouncil1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlInicioLayout.setVerticalGroup(
            pnlInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInicioLayout.createSequentialGroup()
                .addComponent(pnlMainBarClassCouncil1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 121, Short.MAX_VALUE))
        );

        pnlTelas.add(pnlInicio);

        pnlConselhos.setBackground(new java.awt.Color(72, 71, 97));

        pnlMainBarClassCouncil.setBackground(new java.awt.Color(72, 71, 97));

        btnAddClassCouncil.setText("Adicionar Conselho");

        txtSearchClassCouncil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchClassCouncilActionPerformed(evt);
            }
        });

        btnSearchClassCouncil.setText("Buscar");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Turma 1", "Turma 2", "Turma 3", "Turma 4" }));

        javax.swing.GroupLayout pnlMainBarClassCouncilLayout = new javax.swing.GroupLayout(pnlMainBarClassCouncil);
        pnlMainBarClassCouncil.setLayout(pnlMainBarClassCouncilLayout);
        pnlMainBarClassCouncilLayout.setHorizontalGroup(
            pnlMainBarClassCouncilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainBarClassCouncilLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(txtSearchClassCouncil, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearchClassCouncil, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(btnAddClassCouncil, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        pnlMainBarClassCouncilLayout.setVerticalGroup(
            pnlMainBarClassCouncilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainBarClassCouncilLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMainBarClassCouncilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlMainBarClassCouncilLayout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addGroup(pnlMainBarClassCouncilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearchClassCouncil, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearchClassCouncil, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddClassCouncil, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout pnlConselhosLayout = new javax.swing.GroupLayout(pnlConselhos);
        pnlConselhos.setLayout(pnlConselhosLayout);
        pnlConselhosLayout.setHorizontalGroup(
            pnlConselhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMainBarClassCouncil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlConselhosLayout.setVerticalGroup(
            pnlConselhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConselhosLayout.createSequentialGroup()
                .addComponent(pnlMainBarClassCouncil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 542, Short.MAX_VALUE))
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

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout pnlMainBarSubjectsLayout = new javax.swing.GroupLayout(pnlMainBarSubjects);
        pnlMainBarSubjects.setLayout(pnlMainBarSubjectsLayout);
        pnlMainBarSubjectsLayout.setHorizontalGroup(
            pnlMainBarSubjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainBarSubjectsLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSearchSubjects, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearchSubjects, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(btnAddSubjects, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        pnlMainBarSubjectsLayout.setVerticalGroup(
            pnlMainBarSubjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainBarSubjectsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMainBarSubjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlMainBarSubjectsLayout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addGroup(pnlMainBarSubjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearchSubjects, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearchSubjects, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddSubjects, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(22, 22, 22))
        );

        tblSubjects.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        tblSubjects.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Professor", "Matriculados"
            }
        ));
        spnlSubjects.setViewportView(tblSubjects);
        if (tblSubjects.getColumnModel().getColumnCount() > 0) {
            tblSubjects.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout pnlDisciplinasLayout = new javax.swing.GroupLayout(pnlDisciplinas);
        pnlDisciplinas.setLayout(pnlDisciplinasLayout);
        pnlDisciplinasLayout.setHorizontalGroup(
            pnlDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDisciplinasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spnlSubjects, javax.swing.GroupLayout.DEFAULT_SIZE, 886, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(pnlMainBarSubjects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlDisciplinasLayout.setVerticalGroup(
            pnlDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDisciplinasLayout.createSequentialGroup()
                .addComponent(pnlMainBarSubjects, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnlSubjects, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Turma 1", "Turma 2", "Turma 3", "Turma 4" }));

        javax.swing.GroupLayout pnlMainBarTeachersLayout = new javax.swing.GroupLayout(pnlMainBarTeachers);
        pnlMainBarTeachers.setLayout(pnlMainBarTeachersLayout);
        pnlMainBarTeachersLayout.setHorizontalGroup(
            pnlMainBarTeachersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainBarTeachersLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSearchTeachers, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearchTeachers, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(btnAddTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        pnlMainBarTeachersLayout.setVerticalGroup(
            pnlMainBarTeachersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainBarTeachersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMainBarTeachersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainBarTeachersLayout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addGroup(pnlMainBarTeachersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearchTeachers, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearchTeachers, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(22, 22, 22))
        );

        tblTeachers.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        tblTeachers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Data de nascimento", "Cidade"
            }
        ));
        spnlTeachers.setViewportView(tblTeachers);
        if (tblTeachers.getColumnModel().getColumnCount() > 0) {
            tblTeachers.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout pnlProfessoresLayout = new javax.swing.GroupLayout(pnlProfessores);
        pnlProfessores.setLayout(pnlProfessoresLayout);
        pnlProfessoresLayout.setHorizontalGroup(
            pnlProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMainBarTeachers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlProfessoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spnlTeachers, javax.swing.GroupLayout.DEFAULT_SIZE, 886, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlProfessoresLayout.setVerticalGroup(
            pnlProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProfessoresLayout.createSequentialGroup()
                .addComponent(pnlMainBarTeachers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnlTeachers, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
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

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Turma 1", "Turma 2", "Turma 3", "Turma 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMainBarStudentsLayout = new javax.swing.GroupLayout(pnlMainBarStudents);
        pnlMainBarStudents.setLayout(pnlMainBarStudentsLayout);
        pnlMainBarStudentsLayout.setHorizontalGroup(
            pnlMainBarStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainBarStudentsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(txtSearchStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearchStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addComponent(btnAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        pnlMainBarStudentsLayout.setVerticalGroup(
            pnlMainBarStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainBarStudentsLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(pnlMainBarStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        tblStudents.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        tblStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Sobrenome", "Matricula"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spnlStudents.setViewportView(tblStudents);
        if (tblStudents.getColumnModel().getColumnCount() > 0) {
            tblStudents.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout pnlAlunosLayout = new javax.swing.GroupLayout(pnlAlunos);
        pnlAlunos.setLayout(pnlAlunosLayout);
        pnlAlunosLayout.setHorizontalGroup(
            pnlAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMainBarStudents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlAlunosLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(spnlStudents, javax.swing.GroupLayout.DEFAULT_SIZE, 886, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pnlAlunosLayout.setVerticalGroup(
            pnlAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAlunosLayout.createSequentialGroup()
                .addComponent(pnlMainBarStudents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 542, Short.MAX_VALUE))
            .addGroup(pnlAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlAlunosLayout.createSequentialGroup()
                    .addGap(76, 76, 76)
                    .addComponent(spnlStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addGap(0, 121, Short.MAX_VALUE))
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
                .addGap(0, 121, Short.MAX_VALUE))
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
                .addGap(0, 121, Short.MAX_VALUE))
        );

        pnlTelas.add(pnlResponsaveis);

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


        tabAlunos.setBackground(new Color(255,255,255));
        tabInicio.setBackground(new Color(204,204,255));
        tabDisciplinas.setBackground(new Color(204,204,255));
        tabProfessores.setBackground(new Color(204,204,255));
        tabConselhos.setBackground(new Color(204,204,255));
        tabCoordenadores.setBackground(new Color(204,204,255));
        tabCursos.setBackground(new Color(204,204,255));
        tabResponsaveis.setBackground(new Color(204,204,255));
        
        atualizaListaAlunos();
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
        
        tabProfessores.setBackground(new Color(255,255,255));
        tabInicio.setBackground(new Color(204,204,255));
        tabDisciplinas.setBackground(new Color(204,204,255));
        tabAlunos.setBackground(new Color(204,204,255));
        tabConselhos.setBackground(new Color(204,204,255));
        tabCoordenadores.setBackground(new Color(204,204,255));
        tabCursos.setBackground(new Color(204,204,255));
        tabResponsaveis.setBackground(new Color(204,204,255));
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

        tabDisciplinas.setBackground(new Color(255,255,255));
        tabInicio.setBackground(new Color(204,204,255));
        tabProfessores.setBackground(new Color(204,204,255));
        tabAlunos.setBackground(new Color(204,204,255));
        tabConselhos.setBackground(new Color(204,204,255));
        tabCoordenadores.setBackground(new Color(204,204,255));
        tabCursos.setBackground(new Color(204,204,255));
        tabResponsaveis.setBackground(new Color(204,204,255));
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

        tabConselhos.setBackground(new Color(255,255,255));
        tabDisciplinas.setBackground(new Color(204,204,255));
        tabInicio.setBackground(new Color(204,204,255));
        tabProfessores.setBackground(new Color(204,204,255));
        tabAlunos.setBackground(new Color(204,204,255));
        tabCoordenadores.setBackground(new Color(204,204,255));
        tabCursos.setBackground(new Color(204,204,255));
        tabResponsaveis.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_tabConselhosMouseClicked

    private void btnAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStudentActionPerformed
        this.dispose();
       CadastrarAluno tela1 = new CadastrarAluno();
       tela1.setVisible(true);
    }//GEN-LAST:event_btnAddStudentActionPerformed

    private void btnAddTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTeacherActionPerformed
       CadastrarProfessor tela = new CadastrarProfessor();
       //HomeScreen aq = new HomeScreen();
       //tela1.dispose();
       tela.setVisible(true);
    }//GEN-LAST:event_btnAddTeacherActionPerformed

    private void btnAddSubjectsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSubjectsActionPerformed
        CadastrarDisciplina tela = new CadastrarDisciplina();
        tela.setVisible(true);

    }//GEN-LAST:event_btnAddSubjectsActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnSearchSubjectsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchSubjectsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchSubjectsActionPerformed

    private void tabCoordenadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabCoordenadoresMouseClicked
        pnlCoordenadores.setVisible(true);
        pnlConselhos.setVisible(false);
        pnlDisciplinas.setVisible(false);
        pnlProfessores.setVisible(false);
        pnlAlunos.setVisible(false);
        pnlInicio.setVisible(false);
        pnlResponsaveis.setVisible(false);
        pnlCursos.setVisible(false);
        
        tabCoordenadores.setBackground(new Color(255,255,255));
        tabConselhos.setBackground(new Color(204,204,255));
        tabDisciplinas.setBackground(new Color(204,204,255));
        tabInicio.setBackground(new Color(204,204,255));
        tabProfessores.setBackground(new Color(204,204,255));
        tabAlunos.setBackground(new Color(204,204,255));
        tabCursos.setBackground(new Color(204,204,255));
        tabResponsaveis.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_tabCoordenadoresMouseClicked

    private void tabCursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabCursosMouseClicked
        pnlCursos.setVisible(true);
        pnlCoordenadores.setVisible(false);
        pnlConselhos.setVisible(false);
        pnlDisciplinas.setVisible(false);
        pnlProfessores.setVisible(false);
        pnlAlunos.setVisible(false);
        pnlInicio.setVisible(false);
        pnlResponsaveis.setVisible(false);

        tabCursos.setBackground(new Color(255,255,255));
        tabCoordenadores.setBackground(new Color(204,204,255));
        tabConselhos.setBackground(new Color(204,204,255));
        tabDisciplinas.setBackground(new Color(204,204,255));
        tabInicio.setBackground(new Color(204,204,255));
        tabProfessores.setBackground(new Color(204,204,255));
        tabAlunos.setBackground(new Color(204,204,255));
        tabResponsaveis.setBackground(new Color(204,204,255));
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

        tabResponsaveis.setBackground(new Color(255,255,255));
        tabCoordenadores.setBackground(new Color(204,204,255));
        tabConselhos.setBackground(new Color(204,204,255));
        tabDisciplinas.setBackground(new Color(204,204,255));
        tabInicio.setBackground(new Color(204,204,255));
        tabProfessores.setBackground(new Color(204,204,255));
        tabAlunos.setBackground(new Color(204,204,255));
        tabCursos.setBackground(new Color(204,204,255));
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
        
        tabInicio.setBackground(new Color(255,255,255));
        tabCoordenadores.setBackground(new Color(204,204,255));
        tabConselhos.setBackground(new Color(204,204,255));
        tabDisciplinas.setBackground(new Color(204,204,255));
        tabResponsaveis.setBackground(new Color(204,204,255));
        tabProfessores.setBackground(new Color(204,204,255));
        tabAlunos.setBackground(new Color(204,204,255));
        tabCursos.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_tabInicioMouseClicked

    private void btnSearchStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchStudentActionPerformed
        
    }//GEN-LAST:event_btnSearchStudentActionPerformed

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
    private javax.swing.JButton btnAddClassCouncil;
    private javax.swing.JButton btnAddStudent;
    private javax.swing.JButton btnAddSubjects;
    private javax.swing.JButton btnAddTeacher;
    private javax.swing.JButton btnSearchClassCouncil;
    private javax.swing.JButton btnSearchStudent;
    private javax.swing.JButton btnSearchSubjects;
    private javax.swing.JButton btnSearchTeachers;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
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
    private javax.swing.JLabel lblConselho;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblResponsaveis;
    private javax.swing.JLabel lblSubjects;
    private javax.swing.JPanel pnlAlunos;
    private javax.swing.JPanel pnlConselhos;
    private javax.swing.JPanel pnlCoordenadores;
    private javax.swing.JPanel pnlCursos;
    private javax.swing.JPanel pnlDisciplinas;
    private javax.swing.JPanel pnlInicio;
    private javax.swing.JPanel pnlMainBarClassCouncil;
    private javax.swing.JPanel pnlMainBarClassCouncil1;
    private javax.swing.JPanel pnlMainBarClassCouncil2;
    private javax.swing.JPanel pnlMainBarClassCouncil3;
    private javax.swing.JPanel pnlMainBarClassCouncil4;
    private javax.swing.JPanel pnlMainBarStudents;
    private javax.swing.JPanel pnlMainBarSubjects;
    private javax.swing.JPanel pnlMainBarTeachers;
    private javax.swing.JPanel pnlNavBar;
    private javax.swing.JPanel pnlProfessores;
    private javax.swing.JPanel pnlResponsaveis;
    private javax.swing.JPanel pnlTelas;
    private javax.swing.JScrollPane spnlStudents;
    private javax.swing.JScrollPane spnlSubjects;
    private javax.swing.JScrollPane spnlTeachers;
    private javax.swing.JPanel tabAlunos;
    private javax.swing.JPanel tabConselhos;
    private javax.swing.JPanel tabCoordenadores;
    private javax.swing.JPanel tabCursos;
    private javax.swing.JPanel tabDisciplinas;
    private javax.swing.JPanel tabInicio;
    private javax.swing.JPanel tabProfessores;
    private javax.swing.JPanel tabResponsaveis;
    private javax.swing.JTable tblStudents;
    private javax.swing.JTable tblSubjects;
    private javax.swing.JTable tblTeachers;
    private javax.swing.JTextField txtSearchClassCouncil;
    private javax.swing.JTextField txtSearchStudent;
    private javax.swing.JTextField txtSearchSubjects;
    private javax.swing.JTextField txtSearchTeachers;
    // End of variables declaration//GEN-END:variables
}
