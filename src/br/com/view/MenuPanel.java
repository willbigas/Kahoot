package br.com.view;

import br.com.principal.Principal;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alunos
 */
public class MenuPanel extends javax.swing.JPanel {

    /**
     * Creates new form MenuPanel
     */
    public MenuPanel() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        BotaoAdicionarPergunta = new javax.swing.JButton();
        BotaoJogar = new javax.swing.JButton();
        textoEscolherOpcao = new javax.swing.JLabel();
        BotaoSair = new javax.swing.JButton();
        BotaoAssunto = new javax.swing.JButton();
        BotaoDisciplina = new javax.swing.JButton();
        textoDesenvolvimento = new javax.swing.JLabel();

        setLayout(new java.awt.GridBagLayout());

        BotaoAdicionarPergunta.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        BotaoAdicionarPergunta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_adicionar_32x32.png"))); // NOI18N
        BotaoAdicionarPergunta.setText("Pergunta");
        BotaoAdicionarPergunta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotaoAdicionarPergunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAdicionarPerguntaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        add(BotaoAdicionarPergunta, gridBagConstraints);

        BotaoJogar.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        BotaoJogar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_jogar_128x128.png"))); // NOI18N
        BotaoJogar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotaoJogar.setPreferredSize(new java.awt.Dimension(130, 130));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        add(BotaoJogar, gridBagConstraints);

        textoEscolherOpcao.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        textoEscolherOpcao.setText("Escolha uma opção!");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        add(textoEscolherOpcao, gridBagConstraints);

        BotaoSair.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        BotaoSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_sair_32x32.png"))); // NOI18N
        BotaoSair.setText("SAIR");
        BotaoSair.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        add(BotaoSair, gridBagConstraints);

        BotaoAssunto.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        BotaoAssunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_adicionar_32x32.png"))); // NOI18N
        BotaoAssunto.setText("Assunto");
        BotaoAssunto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotaoAssunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAssuntoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        add(BotaoAssunto, gridBagConstraints);

        BotaoDisciplina.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        BotaoDisciplina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_adicionar_32x32.png"))); // NOI18N
        BotaoDisciplina.setText("Disciplina");
        BotaoDisciplina.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotaoDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDisciplinaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        add(BotaoDisciplina, gridBagConstraints);

        textoDesenvolvimento.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        textoDesenvolvimento.setText("Desenvolvido por Agostinho, Adriene, kellison, William");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        add(textoDesenvolvimento, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoAdicionarPerguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAdicionarPerguntaActionPerformed
        try {
            Principal.panelCadastroPergunta();
            // TODO add your handling code here:
        } catch (Exception ex) {
            Logger.getLogger(MenuPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotaoAdicionarPerguntaActionPerformed

    private void BotaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairActionPerformed
        System.exit(0);

        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoSairActionPerformed

    private void BotaoDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDisciplinaActionPerformed
        Principal.panelCadastroDisciplina();

// TODO add your handling code here:
    }//GEN-LAST:event_BotaoDisciplinaActionPerformed

    private void BotaoAssuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAssuntoActionPerformed
        try {
            Principal.panelCadastroAssunto();
            // TODO add your handling code here:
        } catch (Exception ex) {
            Logger.getLogger(MenuPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotaoAssuntoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAdicionarPergunta;
    private javax.swing.JButton BotaoAssunto;
    private javax.swing.JButton BotaoDisciplina;
    private javax.swing.JButton BotaoJogar;
    private javax.swing.JButton BotaoSair;
    private javax.swing.JLabel textoDesenvolvimento;
    private javax.swing.JLabel textoEscolherOpcao;
    // End of variables declaration//GEN-END:variables
}
