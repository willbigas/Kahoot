package br.com.kahoot.view;

import br.com.kahoot.principal.PrincipalServidor;

/**
 * Classe de Login com Interface Swing
 *
 * @author William Bigas Mauro - Documentação e Melhorias
 * @author Agostinho Detófano Junior - Criação da Interface
 * @since 05/12/2018
 */
public class FramePrincipal extends javax.swing.JFrame {

    public FramePrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        PainelBotoesInferior = new javax.swing.JPanel();
        BotaoSair = new javax.swing.JButton();
        BotaoEntrar = new javax.swing.JButton();
        PainelImagem = new javax.swing.JPanel();
        img_Quiz = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        PainelBotoesInferior.setLayout(new java.awt.GridBagLayout());

        BotaoSair.setBackground(new java.awt.Color(255, 255, 255));
        BotaoSair.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BotaoSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_sairAplicacao.png"))); // NOI18N
        BotaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        PainelBotoesInferior.add(BotaoSair, gridBagConstraints);

        BotaoEntrar.setBackground(new java.awt.Color(255, 255, 255));
        BotaoEntrar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BotaoEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_entrar_48x48.png"))); // NOI18N
        BotaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEntrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        PainelBotoesInferior.add(BotaoEntrar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(PainelBotoesInferior, gridBagConstraints);

        PainelImagem.setLayout(new java.awt.GridBagLayout());

        img_Quiz.setFont(new java.awt.Font("Dialog", 3, 48)); // NOI18N
        img_Quiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_quiz_principal.jpg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 0, 19, 0);
        PainelImagem.add(img_Quiz, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        getContentPane().add(PainelImagem, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEntrarActionPerformed
        PrincipalServidor.panelMenu();
    }//GEN-LAST:event_BotaoEntrarActionPerformed

    private void BotaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairActionPerformed
        System.exit(0);

    }//GEN-LAST:event_BotaoSairActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoEntrar;
    private javax.swing.JButton BotaoSair;
    private javax.swing.JPanel PainelBotoesInferior;
    private javax.swing.JPanel PainelImagem;
    private javax.swing.JLabel img_Quiz;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
