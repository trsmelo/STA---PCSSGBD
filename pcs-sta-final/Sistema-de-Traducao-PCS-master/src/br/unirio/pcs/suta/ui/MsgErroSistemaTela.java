/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirio.pcs.suta.ui;

import br.unirio.pcs.suta.GmailAPI;

/**
 *
 * @author Lucas
 */
public class MsgErroSistemaTela extends javax.swing.JFrame {
    
    public MsgErroSistemaTela() {
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

        MsgErroSistemaEnviar = new javax.swing.JButton();
        MsgErroSistemaVoltar = new javax.swing.JButton();
        MsgErroSistemaPane = new javax.swing.JScrollPane();
        MsgErroSistemaTexto = new javax.swing.JTextArea();
        MsgErroSistemaDescricao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MsgErroSistemaEnviar.setText("Enviar mensagem");
        MsgErroSistemaEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MsgErroSistemaEnviarActionPerformed(evt);
            }
        });

        MsgErroSistemaVoltar.setText("Voltar para tela principal");
        MsgErroSistemaVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MsgErroSistemaVoltarActionPerformed(evt);
            }
        });

        MsgErroSistemaTexto.setColumns(20);
        MsgErroSistemaTexto.setRows(5);
        MsgErroSistemaPane.setViewportView(MsgErroSistemaTexto);

        MsgErroSistemaDescricao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        MsgErroSistemaDescricao.setText("Favor detalhar a experiência com o sistema e possíveis melhorias e correções no campo abaixo. ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MsgErroSistemaDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MsgErroSistemaVoltar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MsgErroSistemaEnviar))
                            .addComponent(MsgErroSistemaPane, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 11, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(MsgErroSistemaDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MsgErroSistemaPane, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MsgErroSistemaEnviar)
                    .addComponent(MsgErroSistemaVoltar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MsgErroSistemaEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MsgErroSistemaEnviarActionPerformed
        // TODO add your handling code here:
        GmailAPI mail = new GmailAPI();
        mail.sendMail(MsgErroSistemaTexto.getText(), "sutapcsobra@gmail.com", "Erro em Sistema");
        PrincipalTela enviar = new PrincipalTela();
        this.dispose();
        enviar.setVisible(true);
    }//GEN-LAST:event_MsgErroSistemaEnviarActionPerformed

    private void MsgErroSistemaVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MsgErroSistemaVoltarActionPerformed
        // TODO add your handling code here:
        PrincipalTela voltar = new PrincipalTela();
        this.dispose();
        voltar.setVisible(true);
    }//GEN-LAST:event_MsgErroSistemaVoltarActionPerformed
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
            java.util.logging.Logger.getLogger(MsgErroSistemaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MsgErroSistemaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MsgErroSistemaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MsgErroSistemaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new MsgErroSistemaTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MsgErroSistemaDescricao;
    private javax.swing.JButton MsgErroSistemaEnviar;
    private javax.swing.JScrollPane MsgErroSistemaPane;
    private javax.swing.JTextArea MsgErroSistemaTexto;
    private javax.swing.JButton MsgErroSistemaVoltar;
    // End of variables declaration//GEN-END:variables
}
