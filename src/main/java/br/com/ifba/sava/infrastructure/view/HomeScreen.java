/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.infrastructure.view;

import java.awt.Color;
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
        pnlMainBarSubjects = new javax.swing.JPanel();
        btnAddSubjects = new javax.swing.JButton();
        txtSearchSubjects = new javax.swing.JTextField();
        btnSearchSubjects = new javax.swing.JButton();
        spnlSubjects = new javax.swing.JScrollPane();
        tblSubjects = new javax.swing.JTable();
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
        lblClassCouncil.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblClassCouncil.setForeground(new java.awt.Color(72, 71, 97));
        lblClassCouncil.setText("Conselhos");

        javax.swing.GroupLayout tabClassCouncilLayout = new javax.swing.GroupLayout(tabClassCouncil);
        tabClassCouncil.setLayout(tabClassCouncilLayout);
        tabClassCouncilLayout.setHorizontalGroup(
            tabClassCouncilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabClassCouncilLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lblClassCouncil)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabClassCouncilLayout.setVerticalGroup(
            tabClassCouncilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabClassCouncilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblClassCouncil, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabSubjects.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabSubjectsMouseClicked(evt);
            }
        });
        tabSubjects.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSubjects.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSubjects.setForeground(new java.awt.Color(72, 71, 97));
        lblSubjects.setText("Turmas");
        tabSubjects.add(lblSubjects, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 30));

        tabTeachers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabTeachersMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(72, 71, 97));
        jLabel3.setText("Professores");

        javax.swing.GroupLayout tabTeachersLayout = new javax.swing.GroupLayout(tabTeachers);
        tabTeachers.setLayout(tabTeachersLayout);
        tabTeachersLayout.setHorizontalGroup(
            tabTeachersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabTeachersLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel3)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        tabTeachersLayout.setVerticalGroup(
            tabTeachersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabTeachersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabStudentsMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(72, 71, 97));
        jLabel4.setText("Alunos");

        javax.swing.GroupLayout tabStudentsLayout = new javax.swing.GroupLayout(tabStudents);
        tabStudents.setLayout(tabStudentsLayout);
        tabStudentsLayout.setHorizontalGroup(
            tabStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabStudentsLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabStudentsLayout.setVerticalGroup(
            tabStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabStudentsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
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
                .addComponent(tabSubjects, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(pnlMainBarClassCouncil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 515, Short.MAX_VALUE))
        );

        pnlScreens.add(pnlClassCouncil);

        pnlSubjects.setBackground(new java.awt.Color(72, 71, 97));

        pnlMainBarSubjects.setBackground(new java.awt.Color(72, 71, 97));

        btnAddSubjects.setText("Adicionar Turma");

        txtSearchSubjects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchSubjectsActionPerformed(evt);
            }
        });

        btnSearchSubjects.setText("Buscar");

        javax.swing.GroupLayout pnlMainBarSubjectsLayout = new javax.swing.GroupLayout(pnlMainBarSubjects);
        pnlMainBarSubjects.setLayout(pnlMainBarSubjectsLayout);
        pnlMainBarSubjectsLayout.setHorizontalGroup(
            pnlMainBarSubjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainBarSubjectsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSearchSubjects, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearchSubjects, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 350, Short.MAX_VALUE)
                .addComponent(btnAddSubjects, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        pnlMainBarSubjectsLayout.setVerticalGroup(
            pnlMainBarSubjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainBarSubjectsLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(pnlMainBarSubjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchSubjects, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchSubjects, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddSubjects, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        tblSubjects.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        tblSubjects.setModel(new javax.swing.table.DefaultTableModel(
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
        spnlSubjects.setViewportView(tblSubjects);
        if (tblSubjects.getColumnModel().getColumnCount() > 0) {
            tblSubjects.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout pnlSubjectsLayout = new javax.swing.GroupLayout(pnlSubjects);
        pnlSubjects.setLayout(pnlSubjectsLayout);
        pnlSubjectsLayout.setHorizontalGroup(
            pnlSubjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSubjectsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spnlSubjects, javax.swing.GroupLayout.DEFAULT_SIZE, 886, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(pnlMainBarSubjects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlSubjectsLayout.setVerticalGroup(
            pnlSubjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSubjectsLayout.createSequentialGroup()
                .addComponent(pnlMainBarSubjects, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnlSubjects, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 350, Short.MAX_VALUE)
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
                .addComponent(pnlMainBarTeachers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnlTeachers, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
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
                .addComponent(pnlMainBarStudents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 515, Short.MAX_VALUE))
            .addGroup(pnlStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlStudentsLayout.createSequentialGroup()
                    .addGap(76, 76, 76)
                    .addComponent(spnlStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pnlScreens.add(pnlStudents);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlNavBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlScreens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlNavBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlScreens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void tabStudentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabStudentsMouseClicked
        pnlClassCouncil.setVisible(false);
        pnlSubjects.setVisible(false);
        pnlTeachers.setVisible(false);
        pnlStudents.setVisible(true);

        tabStudents.setBackground(new Color(255,255,255));
        tabSubjects.setBackground(new Color(204,204,255));
        tabTeachers.setBackground(new Color(204,204,255));
        tabClassCouncil.setBackground(new Color(204,204,255));
        
        /*DefaultTableModel values = (DefaultTableModel) tblStudents.getModel();
        Student student = new Student();
        DaoStudent daoStudent = new DaoStudent();
        List<Student> takeAll = daoStudent.takeAll();
        for(int i = 0; i < takeAll.size(); i++) {
            
        }*/
        DefaultTableModel valores = (DefaultTableModel) tblStudents.getModel();
        while (tblStudents.getModel().getRowCount() > 0) {  
           ((DefaultTableModel) tblStudents.getModel()).removeRow(0);  
        } 
        
//        Student students = new Student();
//        DaoStudent daoStudent = new DaoStudent();
//        List<Student> student = daoStudent.takeAll();
//        for(int i = 0;i<student.size();i++){
//        Object[] data = {
//            student.get(i).getName(),
//            student.get(i).getLastname(),
//            student.get(i).getRegisterNumber(),
//        };
//        valores.addRow(data);
//        //botaoApertado.equals("Aluno");
//     }
        
    }//GEN-LAST:event_tabStudentsMouseClicked

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
    private javax.swing.JButton btnAddSubjects;
    private javax.swing.JButton btnAddTeacher;
    private javax.swing.JButton btnSearchClassCouncil;
    private javax.swing.JButton btnSearchStudent;
    private javax.swing.JButton btnSearchSubjects;
    private javax.swing.JButton btnSearchTeachers;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblClassCouncil;
    private javax.swing.JLabel lblSubjects;
    private javax.swing.JPanel pnlClassCouncil;
    private javax.swing.JPanel pnlMainBarClassCouncil;
    private javax.swing.JPanel pnlMainBarStudents;
    private javax.swing.JPanel pnlMainBarSubjects;
    private javax.swing.JPanel pnlMainBarTeachers;
    private javax.swing.JPanel pnlNavBar;
    private javax.swing.JPanel pnlScreens;
    private javax.swing.JPanel pnlStudents;
    private javax.swing.JPanel pnlSubjects;
    private javax.swing.JPanel pnlTeachers;
    private javax.swing.JScrollPane spnlStudents;
    private javax.swing.JScrollPane spnlSubjects;
    private javax.swing.JScrollPane spnlTeachers;
    private javax.swing.JPanel tabClassCouncil;
    private javax.swing.JPanel tabStudents;
    private javax.swing.JPanel tabSubjects;
    private javax.swing.JPanel tabTeachers;
    private javax.swing.JTable tblStudents;
    private javax.swing.JTable tblSubjects;
    private javax.swing.JTable tblTeachers;
    private javax.swing.JTextField txtSearchClassCouncil;
    private javax.swing.JTextField txtSearchStudent;
    private javax.swing.JTextField txtSearchSubjects;
    private javax.swing.JTextField txtSearchTeachers;
    // End of variables declaration//GEN-END:variables
}
