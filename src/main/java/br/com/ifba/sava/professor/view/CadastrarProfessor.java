/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sava.professor.view;

import br.com.ifba.sava.infrastructure.service.FacadeInstance;
import br.com.ifba.sava.infrastructure.view.HomeScreen;

/**
 *
 * @author marts
 */
public class CadastrarProfessor extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarProfessor
     */
    public CadastrarProfessor() {
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

        pnlMainContainer = new javax.swing.JPanel();
        pnlRegisterContainer = new javax.swing.JPanel();
        pnlSiape = new javax.swing.JPanel();
        lblSiape = new javax.swing.JLabel();
        txtSiape = new javax.swing.JTextField();
        pnlEmailProfessor = new javax.swing.JPanel();
        lblEmailProfessor = new javax.swing.JLabel();
        txtEmailProfessor = new javax.swing.JTextField();
        btnCadastrarProfessor = new javax.swing.JButton();
        pnlSobrenomeProfessor = new javax.swing.JPanel();
        lblSobrenomeProfessor = new javax.swing.JLabel();
        txtSobrenomeProfessor = new javax.swing.JTextField();
        pnlNomeProfessor = new javax.swing.JPanel();
        lblNomeProfessor = new javax.swing.JLabel();
        txtNomeProfessor = new javax.swing.JTextField();
        btnVoltarConselho = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlMainContainer.setBackground(new java.awt.Color(72, 71, 97));

        pnlRegisterContainer.setBackground(new java.awt.Color(218, 217, 237));

        pnlSiape.setBackground(new java.awt.Color(102, 101, 120));

        lblSiape.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        lblSiape.setForeground(new java.awt.Color(255, 255, 255));
        lblSiape.setText("SIAPE:");

        txtSiape.setBackground(new java.awt.Color(102, 101, 120));
        txtSiape.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        txtSiape.setForeground(new java.awt.Color(255, 255, 255));
        txtSiape.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtSiape.setCaretColor(new java.awt.Color(255, 255, 255));
        txtSiape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSiapeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSiapeLayout = new javax.swing.GroupLayout(pnlSiape);
        pnlSiape.setLayout(pnlSiapeLayout);
        pnlSiapeLayout.setHorizontalGroup(
            pnlSiapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSiapeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSiape, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSiape, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlSiapeLayout.setVerticalGroup(
            pnlSiapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSiapeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSiape)
                .addGap(11, 11, 11))
            .addComponent(txtSiape)
        );

        pnlEmailProfessor.setBackground(new java.awt.Color(102, 101, 120));

        lblEmailProfessor.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        lblEmailProfessor.setForeground(new java.awt.Color(255, 255, 255));
        lblEmailProfessor.setText("E-mail:");

        txtEmailProfessor.setBackground(new java.awt.Color(102, 101, 120));
        txtEmailProfessor.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        txtEmailProfessor.setForeground(new java.awt.Color(255, 255, 255));
        txtEmailProfessor.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtEmailProfessor.setCaretColor(new java.awt.Color(255, 255, 255));
        txtEmailProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailProfessorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlEmailProfessorLayout = new javax.swing.GroupLayout(pnlEmailProfessor);
        pnlEmailProfessor.setLayout(pnlEmailProfessorLayout);
        pnlEmailProfessorLayout.setHorizontalGroup(
            pnlEmailProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmailProfessorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEmailProfessor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmailProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
        );
        pnlEmailProfessorLayout.setVerticalGroup(
            pnlEmailProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmailProfessorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblEmailProfessor)
                .addGap(11, 11, 11))
            .addComponent(txtEmailProfessor)
        );

        btnCadastrarProfessor.setBackground(new java.awt.Color(72, 71, 97));
        btnCadastrarProfessor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCadastrarProfessor.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarProfessor.setText("Cadastrar Professor");
        btnCadastrarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarProfessorActionPerformed(evt);
            }
        });

        pnlSobrenomeProfessor.setBackground(new java.awt.Color(102, 101, 120));

        lblSobrenomeProfessor.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        lblSobrenomeProfessor.setForeground(new java.awt.Color(255, 255, 255));
        lblSobrenomeProfessor.setText("Sobrenome: ");

        txtSobrenomeProfessor.setBackground(new java.awt.Color(102, 101, 120));
        txtSobrenomeProfessor.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        txtSobrenomeProfessor.setForeground(new java.awt.Color(255, 255, 255));
        txtSobrenomeProfessor.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtSobrenomeProfessor.setCaretColor(new java.awt.Color(255, 255, 255));
        txtSobrenomeProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSobrenomeProfessorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSobrenomeProfessorLayout = new javax.swing.GroupLayout(pnlSobrenomeProfessor);
        pnlSobrenomeProfessor.setLayout(pnlSobrenomeProfessorLayout);
        pnlSobrenomeProfessorLayout.setHorizontalGroup(
            pnlSobrenomeProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSobrenomeProfessorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSobrenomeProfessor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSobrenomeProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
        );
        pnlSobrenomeProfessorLayout.setVerticalGroup(
            pnlSobrenomeProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSobrenomeProfessor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtSobrenomeProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        pnlNomeProfessor.setBackground(new java.awt.Color(102, 101, 120));

        lblNomeProfessor.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        lblNomeProfessor.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeProfessor.setText("Nome:");

        txtNomeProfessor.setBackground(new java.awt.Color(102, 101, 120));
        txtNomeProfessor.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        txtNomeProfessor.setForeground(new java.awt.Color(255, 255, 255));
        txtNomeProfessor.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtNomeProfessor.setCaretColor(new java.awt.Color(255, 255, 255));
        txtNomeProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeProfessorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlNomeProfessorLayout = new javax.swing.GroupLayout(pnlNomeProfessor);
        pnlNomeProfessor.setLayout(pnlNomeProfessorLayout);
        pnlNomeProfessorLayout.setHorizontalGroup(
            pnlNomeProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNomeProfessorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        pnlNomeProfessorLayout.setVerticalGroup(
            pnlNomeProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNomeProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblNomeProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNomeProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlRegisterContainerLayout = new javax.swing.GroupLayout(pnlRegisterContainer);
        pnlRegisterContainer.setLayout(pnlRegisterContainerLayout);
        pnlRegisterContainerLayout.setHorizontalGroup(
            pnlRegisterContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegisterContainerLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(pnlRegisterContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlNomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlSiape, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlSobrenomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlEmailProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(103, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegisterContainerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadastrarProfessor)
                .addGap(141, 141, 141))
        );
        pnlRegisterContainerLayout.setVerticalGroup(
            pnlRegisterContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegisterContainerLayout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(pnlNomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlSobrenomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlSiape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlEmailProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnCadastrarProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        btnVoltarConselho.setBackground(new java.awt.Color(255, 255, 255));
        btnVoltarConselho.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        btnVoltarConselho.setText("voltar");
        btnVoltarConselho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarConselhoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMainContainerLayout = new javax.swing.GroupLayout(pnlMainContainer);
        pnlMainContainer.setLayout(pnlMainContainerLayout);
        pnlMainContainerLayout.setHorizontalGroup(
            pnlMainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainContainerLayout.createSequentialGroup()
                .addContainerGap(351, Short.MAX_VALUE)
                .addComponent(pnlRegisterContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(307, 307, 307))
            .addGroup(pnlMainContainerLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnVoltarConselho, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMainContainerLayout.setVerticalGroup(
            pnlMainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainContainerLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnVoltarConselho, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(pnlRegisterContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMainContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMainContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSiapeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSiapeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSiapeActionPerformed

    private void txtEmailProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailProfessorActionPerformed

    private void btnCadastrarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarProfessorActionPerformed
       //Professor professor1 = new Professor();
       
       //professor1.setNome(txtNomeProfessor.getText());
       //professor1.setSobrenome(txtSobrenomeProfessor.getText());
       //professor1.setSiape(txtSiape.getText());
       //professor1.setEmail(txtEmailProfessor.getText());
       
       //FacadeInstance.getInstance().saveProfessor(professor1);
    }//GEN-LAST:event_btnCadastrarProfessorActionPerformed

    private void txtSobrenomeProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSobrenomeProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSobrenomeProfessorActionPerformed

    private void txtNomeProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeProfessorActionPerformed

    private void btnVoltarConselhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarConselhoActionPerformed
        this.dispose();
        HomeScreen tela = new HomeScreen();
        tela.setVisible(true);
    }//GEN-LAST:event_btnVoltarConselhoActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarProfessor;
    private javax.swing.JButton btnVoltarConselho;
    private javax.swing.JLabel lblEmailProfessor;
    private javax.swing.JLabel lblNomeProfessor;
    private javax.swing.JLabel lblSiape;
    private javax.swing.JLabel lblSobrenomeProfessor;
    private javax.swing.JPanel pnlEmailProfessor;
    private javax.swing.JPanel pnlMainContainer;
    private javax.swing.JPanel pnlNomeProfessor;
    private javax.swing.JPanel pnlRegisterContainer;
    private javax.swing.JPanel pnlSiape;
    private javax.swing.JPanel pnlSobrenomeProfessor;
    private javax.swing.JTextField txtEmailProfessor;
    private javax.swing.JTextField txtNomeProfessor;
    private javax.swing.JTextField txtSiape;
    private javax.swing.JTextField txtSobrenomeProfessor;
    // End of variables declaration//GEN-END:variables
}
