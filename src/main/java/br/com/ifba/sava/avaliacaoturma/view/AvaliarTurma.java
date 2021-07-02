/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.avaliacaoturma.view;

import br.com.ifba.sava.infrastructure.view.HomeScreen;

/**
 *
 * @author marts
 */
public class AvaliarTurma extends javax.swing.JFrame {

    /**
     * Creates new form AvaliarTurma
     */
    public AvaliarTurma() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMainContainer2 = new javax.swing.JPanel();
        pnlRegisterContainer2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAvalicaoTurma = new javax.swing.JTable();
        btnVoltarAvalicaoTurma = new javax.swing.JButton();
        btnAvaliarTurma = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlMainContainer2.setBackground(new java.awt.Color(72, 71, 97));

        pnlRegisterContainer2.setBackground(new java.awt.Color(218, 217, 237));
        pnlRegisterContainer2.setBorder(new javax.swing.border.MatteBorder(null));

        tblAvalicaoTurma.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Turma", "Comprometimento", "Realização de Atividades", "Interação Professor/Aluno", "Comportamento", "Características da Turma"
            }
        ));
        tblAvalicaoTurma.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(tblAvalicaoTurma);
        tblAvalicaoTurma.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout pnlRegisterContainer2Layout = new javax.swing.GroupLayout(pnlRegisterContainer2);
        pnlRegisterContainer2.setLayout(pnlRegisterContainer2Layout);
        pnlRegisterContainer2Layout.setHorizontalGroup(
            pnlRegisterContainer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegisterContainer2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        pnlRegisterContainer2Layout.setVerticalGroup(
            pnlRegisterContainer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegisterContainer2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        btnVoltarAvalicaoTurma.setBackground(new java.awt.Color(255, 255, 255));
        btnVoltarAvalicaoTurma.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        btnVoltarAvalicaoTurma.setText("voltar");
        btnVoltarAvalicaoTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarAvalicaoTurmaActionPerformed(evt);
            }
        });

        btnAvaliarTurma.setBackground(new java.awt.Color(72, 71, 97));
        btnAvaliarTurma.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAvaliarTurma.setForeground(new java.awt.Color(255, 255, 255));
        btnAvaliarTurma.setText("Avaliar");
        btnAvaliarTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvaliarTurmaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMainContainer2Layout = new javax.swing.GroupLayout(pnlMainContainer2);
        pnlMainContainer2.setLayout(pnlMainContainer2Layout);
        pnlMainContainer2Layout.setHorizontalGroup(
            pnlMainContainer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainContainer2Layout.createSequentialGroup()
                .addGroup(pnlMainContainer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainContainer2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlRegisterContainer2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlMainContainer2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnVoltarAvalicaoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainContainer2Layout.createSequentialGroup()
                .addGap(0, 521, Short.MAX_VALUE)
                .addComponent(btnAvaliarTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(514, 514, 514))
        );
        pnlMainContainer2Layout.setVerticalGroup(
            pnlMainContainer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainContainer2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnVoltarAvalicaoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(pnlRegisterContainer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAvaliarTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMainContainer2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMainContainer2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarAvalicaoTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarAvalicaoTurmaActionPerformed
        this.dispose();
        HomeScreen tela1 = new HomeScreen();
        tela1.setVisible(true);
    }//GEN-LAST:event_btnVoltarAvalicaoTurmaActionPerformed

    private void btnAvaliarTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvaliarTurmaActionPerformed
       
    }//GEN-LAST:event_btnAvaliarTurmaActionPerformed

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
            java.util.logging.Logger.getLogger(AvaliarTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AvaliarTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AvaliarTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AvaliarTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AvaliarTurma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvaliarTurma;
    private javax.swing.JButton btnVoltarAvalicaoTurma;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCodigoAta;
    private javax.swing.JLabel lblCodigoAta1;
    private javax.swing.JPanel pnlCodigoAta;
    private javax.swing.JPanel pnlCodigoAta1;
    private javax.swing.JPanel pnlMainContainer;
    private javax.swing.JPanel pnlMainContainer1;
    private javax.swing.JPanel pnlMainContainer2;
    private javax.swing.JPanel pnlRegisterContainer;
    private javax.swing.JPanel pnlRegisterContainer1;
    private javax.swing.JPanel pnlRegisterContainer2;
    private javax.swing.JTable tblAvalicaoTurma;
    private javax.swing.JTextField txtCodigoAta;
    private javax.swing.JTextField txtCodigoAta1;
    // End of variables declaration//GEN-END:variables
}
