/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.infraestructure.view;

import java.awt.Color;

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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlNavBar = new javax.swing.JPanel();
        tabClassCouncil = new javax.swing.JPanel();
        lblClassCouncil = new javax.swing.JLabel();
        tabSubjects = new javax.swing.JPanel();
        lblSubjects = new javax.swing.JLabel();
        tabTeachers = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tabStudents = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pnlScreens = new javax.swing.JPanel();
        pnlClassCouncil = new javax.swing.JPanel();
        pnlMainBarClassCouncil = new javax.swing.JPanel();
        btnAddClassCouncil = new javax.swing.JButton();
        txtSearchClassCouncil = new javax.swing.JTextField();
        btnSearchClassCouncil = new javax.swing.JButton();
        pnlSubjects = new javax.swing.JPanel();
        pnlMainBarSubjects1 = new javax.swing.JPanel();
        btnAddSubjects1 = new javax.swing.JButton();
        txtSearchSubjects1 = new javax.swing.JTextField();
        btnSearchSubjects1 = new javax.swing.JButton();
        spnlSubjects1 = new javax.swing.JScrollPane();
        tblSubjects1 = new javax.swing.JTable();
        pnlTeachers = new javax.swing.JPanel();
        pnlMainBarTeachers = new javax.swing.JPanel();
        btnAddTeacher = new javax.swing.JButton();
        txtSearchTeachers = new javax.swing.JTextField();
        btnSearchTeachers = new javax.swing.JButton();
        spnlTeachers = new javax.swing.JScrollPane();
        tblTeachers = new javax.swing.JTable();
        pnlStudents = new javax.swing.JPanel();
        pnlMainBarStudents = new javax.swing.JPanel();
        btnAddStudent = new javax.swing.JButton();
        txtSearchStudent = new javax.swing.JTextField();
        btnSearchStudent = new javax.swing.JButton();
        spnlStudents = new javax.swing.JScrollPane();
        tblStudents = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        pnlNavBar.setBackground(new java.awt.Color(72, 71, 97));

        tabClassCouncil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabClassCouncilMouseClicked(evt);
            }
        });

        lblClassCouncil.setBackground(new java.awt.Color(204, 204, 204));
        lblClassCouncil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblClassCouncil.setForeground(new java.awt.Color(72, 71, 97));
        lblClassCouncil.setText("Conselhos");

        javax.swing.GroupLayout tabClassCouncilLayout = new javax.swing.GroupLayout(tabClassCouncil);
        tabClassCouncil.setLayout(tabClassCouncilLayout);
        tabClassCouncilLayout.setHorizontalGroup(
            tabClassCouncilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabClassCouncilLayout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(lblClassCouncil)
                .addGap(80, 80, 80))
        );
        tabClassCouncilLayout.setVerticalGroup(
            tabClassCouncilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabClassCouncilLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(lblClassCouncil)
                .addGap(19, 19, 19))
        );

        tabSubjects.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabSubjectsMouseClicked(evt);
            }
        });

        lblSubjects.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSubjects.setForeground(new java.awt.Color(72, 71, 97));
        lblSubjects.setText("Turmas");

        javax.swing.GroupLayout tabSubjectsLayout = new javax.swing.GroupLayout(tabSubjects);
        tabSubjects.setLayout(tabSubjectsLayout);
        tabSubjectsLayout.setHorizontalGroup(
            tabSubjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabSubjectsLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(lblSubjects)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabSubjectsLayout.setVerticalGroup(
            tabSubjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabSubjectsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSubjects)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        tabTeachers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabTeachersMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(72, 71, 97));
        jLabel3.setText("Professores");

        javax.swing.GroupLayout tabTeachersLayout = new javax.swing.GroupLayout(tabTeachers);
        tabTeachers.setLayout(tabTeachersLayout);
        tabTeachersLayout.setHorizontalGroup(
            tabTeachersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabTeachersLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(67, 67, 67))
        );
        tabTeachersLayout.setVerticalGroup(
            tabTeachersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabTeachersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        tabStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabStudentsMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(72, 71, 97));
        jLabel4.setText("Alunos");

        javax.swing.GroupLayout tabStudentsLayout = new javax.swing.GroupLayout(tabStudents);
        tabStudents.setLayout(tabStudentsLayout);
        tabStudentsLayout.setHorizontalGroup(
            tabStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabStudentsLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabStudentsLayout.setVerticalGroup(
            tabStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabStudentsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlNavBarLayout = new javax.swing.GroupLayout(pnlNavBar);
        pnlNavBar.setLayout(pnlNavBarLayout);
        pnlNavBarLayout.setHorizontalGroup(
            pnlNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabClassCouncil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabSubjects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabTeachers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabStudents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlNavBarLayout.setVerticalGroup(
            pnlNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNavBarLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(tabClassCouncil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabSubjects, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabTeachers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabStudents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlScreens.setBackground(new java.awt.Color(255, 255, 255));
        pnlScreens.setLayout(new javax.swing.OverlayLayout(pnlScreens));

        pnlClassCouncil.setBackground(new java.awt.Color(72, 71, 97));

        pnlMainBarClassCouncil.setBackground(new java.awt.Color(72, 71, 97));

        btnAddClassCouncil.setText("Adicionar Conselho");

        txtSearchClassCouncil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchClassCouncilActionPerformed(evt);
            }
        });

        btnSearchClassCouncil.setText("Buscar");

        javax.swing.GroupLayout pnlMainBarClassCouncilLayout = new javax.swing.GroupLayout(pnlMainBarClassCouncil);
        pnlMainBarClassCouncil.setLayout(pnlMainBarClassCouncilLayout);
        pnlMainBarClassCouncilLayout.setHorizontalGroup(
            pnlMainBarClassCouncilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainBarClassCouncilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSearchClassCouncil, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearchClassCouncil, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 330, Short.MAX_VALUE)
                .addComponent(btnAddClassCouncil, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        pnlMainBarClassCouncilLayout.setVerticalGroup(
            pnlMainBarClassCouncilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainBarClassCouncilLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(pnlMainBarClassCouncilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchClassCouncil, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchClassCouncil, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddClassCouncil, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout pnlClassCouncilLayout = new javax.swing.GroupLayout(pnlClassCouncil);
        pnlClassCouncil.setLayout(pnlClassCouncilLayout);
        pnlClassCouncilLayout.setHorizontalGroup(
            pnlClassCouncilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMainBarClassCouncil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlClassCouncilLayout.setVerticalGroup(
            pnlClassCouncilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClassCouncilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlMainBarClassCouncil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(803, Short.MAX_VALUE))
        );

        pnlScreens.add(pnlClassCouncil);

        pnlSubjects.setBackground(new java.awt.Color(72, 71, 97));

        pnlMainBarSubjects1.setBackground(new java.awt.Color(72, 71, 97));

        btnAddSubjects1.setText("Adicionar Turma");

        txtSearchSubjects1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchSubjects1ActionPerformed(evt);
            }
        });

        btnSearchSubjects1.setText("Buscar");

        javax.swing.GroupLayout pnlMainBarSubjects1Layout = new javax.swing.GroupLayout(pnlMainBarSubjects1);
        pnlMainBarSubjects1.setLayout(pnlMainBarSubjects1Layout);
        pnlMainBarSubjects1Layout.setHorizontalGroup(
            pnlMainBarSubjects1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainBarSubjects1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSearchSubjects1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearchSubjects1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 330, Short.MAX_VALUE)
                .addComponent(btnAddSubjects1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        pnlMainBarSubjects1Layout.setVerticalGroup(
            pnlMainBarSubjects1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainBarSubjects1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(pnlMainBarSubjects1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchSubjects1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchSubjects1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddSubjects1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        tblSubjects1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        tblSubjects1.setModel(new javax.swing.table.DefaultTableModel(
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
                "Nome", "Professor", "Disciplina", "Matriculados"
            }
        ));
        spnlSubjects1.setViewportView(tblSubjects1);
        if (tblSubjects1.getColumnModel().getColumnCount() > 0) {
            tblSubjects1.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout pnlSubjectsLayout = new javax.swing.GroupLayout(pnlSubjects);
        pnlSubjects.setLayout(pnlSubjectsLayout);
        pnlSubjectsLayout.setHorizontalGroup(
            pnlSubjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSubjectsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSubjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlMainBarSubjects1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spnlSubjects1, javax.swing.GroupLayout.DEFAULT_SIZE, 886, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlSubjectsLayout.setVerticalGroup(
            pnlSubjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSubjectsLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(pnlMainBarSubjects1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(spnlSubjects1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(239, Short.MAX_VALUE))
        );

        pnlScreens.add(pnlSubjects);

        pnlTeachers.setBackground(new java.awt.Color(72, 71, 97));

        pnlMainBarTeachers.setBackground(new java.awt.Color(72, 71, 97));

        btnAddTeacher.setText("Adicionar Professor");

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
                .addContainerGap()
                .addComponent(txtSearchTeachers, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearchTeachers, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 330, Short.MAX_VALUE)
                .addComponent(btnAddTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        pnlMainBarTeachersLayout.setVerticalGroup(
            pnlMainBarTeachersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainBarTeachersLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(pnlMainBarTeachersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchTeachers, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchTeachers, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        javax.swing.GroupLayout pnlTeachersLayout = new javax.swing.GroupLayout(pnlTeachers);
        pnlTeachers.setLayout(pnlTeachersLayout);
        pnlTeachersLayout.setHorizontalGroup(
            pnlTeachersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMainBarTeachers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlTeachersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spnlTeachers, javax.swing.GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlTeachersLayout.setVerticalGroup(
            pnlTeachersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTeachersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlMainBarTeachers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnlTeachers, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlScreens.add(pnlTeachers);

        pnlStudents.setBackground(new java.awt.Color(72, 71, 97));

        pnlMainBarStudents.setBackground(new java.awt.Color(72, 71, 97));

        btnAddStudent.setText("Adicionar Aluno");

        txtSearchStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchStudentActionPerformed(evt);
            }
        });

        btnSearchStudent.setText("Buscar");

        javax.swing.GroupLayout pnlMainBarStudentsLayout = new javax.swing.GroupLayout(pnlMainBarStudents);
        pnlMainBarStudents.setLayout(pnlMainBarStudentsLayout);
        pnlMainBarStudentsLayout.setHorizontalGroup(
            pnlMainBarStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainBarStudentsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSearchStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearchStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 330, Short.MAX_VALUE)
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
                    .addComponent(btnAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        tblStudents.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        tblStudents.setModel(new javax.swing.table.DefaultTableModel(
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
        spnlStudents.setViewportView(tblStudents);
        if (tblStudents.getColumnModel().getColumnCount() > 0) {
            tblStudents.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout pnlStudentsLayout = new javax.swing.GroupLayout(pnlStudents);
        pnlStudents.setLayout(pnlStudentsLayout);
        pnlStudentsLayout.setHorizontalGroup(
            pnlStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMainBarStudents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlStudentsLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(spnlStudents, javax.swing.GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pnlStudentsLayout.setVerticalGroup(
            pnlStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStudentsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlMainBarStudents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(803, Short.MAX_VALUE))
            .addGroup(pnlStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlStudentsLayout.createSequentialGroup()
                    .addGap(76, 76, 76)
                    .addComponent(spnlStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(319, Short.MAX_VALUE)))
        );

        pnlScreens.add(pnlStudents);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlNavBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlScreens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlNavBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlScreens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabClassCouncilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabClassCouncilMouseClicked
        pnlClassCouncil.setVisible(true);
        pnlSubjects.setVisible(false);
        pnlTeachers.setVisible(false);
        pnlStudents.setVisible(false);
        
        tabClassCouncil.setBackground(new Color(255,255,255));
        tabSubjects.setBackground(new Color(204,204,255));
        tabTeachers.setBackground(new Color(204,204,255));
        tabStudents.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_tabClassCouncilMouseClicked

    private void tabSubjectsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabSubjectsMouseClicked
        pnlClassCouncil.setVisible(false);
        pnlSubjects.setVisible(true);
        pnlTeachers.setVisible(false);
        pnlStudents.setVisible(false);
        
        tabSubjects.setBackground(new Color(255,255,255));
        tabClassCouncil.setBackground(new Color(204,204,255));
        tabTeachers.setBackground(new Color(204,204,255));
        tabStudents.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_tabSubjectsMouseClicked

    private void tabTeachersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabTeachersMouseClicked
        pnlClassCouncil.setVisible(false);
        pnlSubjects.setVisible(false);
        pnlTeachers.setVisible(true);
        pnlStudents.setVisible(false);
        
        tabTeachers.setBackground(new Color(255,255,255));
        tabSubjects.setBackground(new Color(204,204,255));
        tabClassCouncil.setBackground(new Color(204,204,255));
        tabStudents.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_tabTeachersMouseClicked

    private void tabStudentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabStudentsMouseClicked
        pnlClassCouncil.setVisible(false);
        pnlSubjects.setVisible(false);
        pnlTeachers.setVisible(false);
        pnlStudents.setVisible(true);
        
        tabStudents.setBackground(new Color(255,255,255));
        tabSubjects.setBackground(new Color(204,204,255));
        tabTeachers.setBackground(new Color(204,204,255));
        tabClassCouncil.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_tabStudentsMouseClicked

    private void txtSearchStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchStudentActionPerformed

    private void txtSearchTeachersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchTeachersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchTeachersActionPerformed

    private void txtSearchClassCouncilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchClassCouncilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchClassCouncilActionPerformed

    private void txtSearchSubjects1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchSubjects1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchSubjects1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
                new HomeScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddClassCouncil;
    private javax.swing.JButton btnAddStudent;
    private javax.swing.JButton btnAddSubjects1;
    private javax.swing.JButton btnAddTeacher;
    private javax.swing.JButton btnSearchClassCouncil;
    private javax.swing.JButton btnSearchStudent;
    private javax.swing.JButton btnSearchSubjects1;
    private javax.swing.JButton btnSearchTeachers;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblClassCouncil;
    private javax.swing.JLabel lblSubjects;
    private javax.swing.JPanel pnlClassCouncil;
    private javax.swing.JPanel pnlMainBarClassCouncil;
    private javax.swing.JPanel pnlMainBarStudents;
    private javax.swing.JPanel pnlMainBarSubjects1;
    private javax.swing.JPanel pnlMainBarTeachers;
    private javax.swing.JPanel pnlNavBar;
    private javax.swing.JPanel pnlScreens;
    private javax.swing.JPanel pnlStudents;
    private javax.swing.JPanel pnlSubjects;
    private javax.swing.JPanel pnlTeachers;
    private javax.swing.JScrollPane spnlStudents;
    private javax.swing.JScrollPane spnlSubjects1;
    private javax.swing.JScrollPane spnlTeachers;
    private javax.swing.JPanel tabClassCouncil;
    private javax.swing.JPanel tabStudents;
    private javax.swing.JPanel tabSubjects;
    private javax.swing.JPanel tabTeachers;
    private javax.swing.JTable tblStudents;
    private javax.swing.JTable tblSubjects1;
    private javax.swing.JTable tblTeachers;
    private javax.swing.JTextField txtSearchClassCouncil;
    private javax.swing.JTextField txtSearchStudent;
    private javax.swing.JTextField txtSearchSubjects1;
    private javax.swing.JTextField txtSearchTeachers;
    // End of variables declaration//GEN-END:variables
}
