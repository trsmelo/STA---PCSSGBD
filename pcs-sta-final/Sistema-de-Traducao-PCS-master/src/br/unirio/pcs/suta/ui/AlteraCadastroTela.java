/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirio.pcs.suta.ui;

import br.unirio.pcs.dao.ClienteDAO;
import br.unirio.pcs.suta.Cliente;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lucas
 */
public class AlteraCadastroTela extends javax.swing.JFrame {

    /**
     * Creates new form FormEndereco
     */
    public AlteraCadastroTela() {
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

        editarCadastroDescrTitulo = new javax.swing.JLabel();
        editarCadastroFieldEmail = new javax.swing.JTextField();
        editarCadastroFieldSenhaConfirm = new javax.swing.JTextField();
        editarCadastroFieldDescrSenha = new javax.swing.JLabel();
        editarCadastroFieldDescrConfirmSenha = new javax.swing.JLabel();
        editarCadastroFieldDescrEmail = new javax.swing.JLabel();
        editarCadastroVoltar = new javax.swing.JButton();
        alterarCadastroSenhaButton = new javax.swing.JButton();
        alterarCadastroTelefoneButton = new javax.swing.JButton();
        editarCadastroFieldCpf = new javax.swing.JTextField();
        editarCadastroFieldCpf1 = new javax.swing.JTextField();
        editarCadastroFieldDescrSenha1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        editarCadastroDescrTitulo.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        editarCadastroDescrTitulo.setText("Editar Cadastro");

        editarCadastroFieldDescrSenha.setText("CPF");

        editarCadastroFieldDescrConfirmSenha.setText("Nova Senha");

        editarCadastroFieldDescrEmail.setText("Telefone Novo:");

        editarCadastroVoltar.setText("Voltar para tela inicial");
        editarCadastroVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarCadastroVoltarActionPerformed(evt);
            }
        });

        alterarCadastroSenhaButton.setText("Atualizar senha");
        alterarCadastroSenhaButton.setToolTipText("");
        alterarCadastroSenhaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarCadastroSenhaButtonActionPerformed(evt);
            }
        });

        alterarCadastroTelefoneButton.setText("Atualizar Telefone");
        alterarCadastroTelefoneButton.setToolTipText("");
        alterarCadastroTelefoneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarCadastroTelefoneButtonActionPerformed(evt);
            }
        });

        editarCadastroFieldDescrSenha1.setText("CPF");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(editarCadastroDescrTitulo)
                .addGap(306, 306, 306))
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editarCadastroFieldDescrEmail)
                            .addComponent(editarCadastroFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alterarCadastroTelefoneButton)
                            .addComponent(editarCadastroFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editarCadastroFieldDescrSenha1))
                        .addGap(280, 280, 280)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editarCadastroFieldDescrSenha)
                            .addComponent(editarCadastroFieldDescrConfirmSenha)
                            .addComponent(editarCadastroFieldSenhaConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alterarCadastroSenhaButton)
                            .addComponent(editarCadastroFieldCpf1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(editarCadastroVoltar))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(editarCadastroDescrTitulo)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editarCadastroFieldDescrSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editarCadastroFieldDescrSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editarCadastroFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editarCadastroFieldCpf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(editarCadastroFieldDescrEmail))
                    .addComponent(editarCadastroFieldDescrConfirmSenha))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editarCadastroFieldSenhaConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editarCadastroFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alterarCadastroSenhaButton)
                    .addComponent(alterarCadastroTelefoneButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(editarCadastroVoltar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoEditarCadastroVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarCadastroVoltarActionPerformed
        // TODO add your handling code here:
        PrincipalTela editar = new PrincipalTela();
        this.dispose();
        editar.setVisible(true);
    }//GEN-LAST:event_botaoEditarCadastroVoltarActionPerformed

    private void alterarCadastroSenhaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarCadastroSenhaButtonActionPerformed
        ClienteDAO dao = new ClienteDAO();
        String senhaTmp = editarCadastroFieldSenhaConfirm.getText();
        String cpf = editarCadastroFieldCpf.getText();
        try {
            dao.atualizaSenha(senhaTmp, cpf);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_alterarCadastroSenhaButtonActionPerformed

    private void alterarCadastroTelefoneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarCadastroTelefoneButtonActionPerformed
        ClienteDAO dao = new ClienteDAO();
        String telefone = editarCadastroFieldEmail.getText();
        String cpf = editarCadastroFieldCpf.getText();
        try {
            dao.atualizaSenha(telefone, cpf);
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_alterarCadastroTelefoneButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AlteraCadastroTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlteraCadastroTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlteraCadastroTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlteraCadastroTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlteraCadastroTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterarCadastroSenhaButton;
    private javax.swing.JButton alterarCadastroTelefoneButton;
    private javax.swing.JLabel editarCadastroDescrTitulo;
    private javax.swing.JTextField editarCadastroFieldCpf;
    private javax.swing.JTextField editarCadastroFieldCpf1;
    private javax.swing.JLabel editarCadastroFieldDescrConfirmSenha;
    private javax.swing.JLabel editarCadastroFieldDescrEmail;
    private javax.swing.JLabel editarCadastroFieldDescrSenha;
    private javax.swing.JLabel editarCadastroFieldDescrSenha1;
    private javax.swing.JTextField editarCadastroFieldEmail;
    private javax.swing.JTextField editarCadastroFieldSenhaConfirm;
    private javax.swing.JButton editarCadastroVoltar;
    // End of variables declaration//GEN-END:variables
}