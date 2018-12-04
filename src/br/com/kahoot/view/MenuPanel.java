package br.com.kahoot.view;

import br.com.kahoot.dao.UsuarioDao;
import br.com.kahoot.daoimpl.UsuarioDaoImpl;
import br.com.kahoot.entidade.Usuario;
import br.com.kahoot.negocio.ManterKahootNegocio;
import br.com.kahoot.principal.PrincipalServidor;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author William
 */
public class MenuPanel extends javax.swing.JPanel {

    public static UsuarioDao usuarioDao = new UsuarioDaoImpl();

    public MenuPanel() {
        initComponents();
    }

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
        BotaoExportarDados = new javax.swing.JButton();
        BotaoPlacarGeral = new javax.swing.JButton();
        BotaoImportarDados = new javax.swing.JButton();

        setLayout(new java.awt.GridBagLayout());

        BotaoAdicionarPergunta.setBackground(new java.awt.Color(255, 255, 255));
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

        BotaoJogar.setBackground(new java.awt.Color(255, 255, 255));
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

        BotaoSair.setBackground(new java.awt.Color(255, 255, 255));
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
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        add(BotaoSair, gridBagConstraints);

        BotaoAssunto.setBackground(new java.awt.Color(255, 255, 255));
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

        BotaoDisciplina.setBackground(new java.awt.Color(255, 255, 255));
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

        BotaoExportarDados.setBackground(new java.awt.Color(255, 255, 255));
        BotaoExportarDados.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        BotaoExportarDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_adicionar_32x32.png"))); // NOI18N
        BotaoExportarDados.setText("Exportar");
        BotaoExportarDados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotaoExportarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoExportarDadosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        add(BotaoExportarDados, gridBagConstraints);

        BotaoPlacarGeral.setBackground(new java.awt.Color(255, 255, 255));
        BotaoPlacarGeral.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        BotaoPlacarGeral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_adicionar_32x32.png"))); // NOI18N
        BotaoPlacarGeral.setText("Placar Geral");
        BotaoPlacarGeral.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotaoPlacarGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPlacarGeralActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        add(BotaoPlacarGeral, gridBagConstraints);

        BotaoImportarDados.setBackground(new java.awt.Color(255, 255, 255));
        BotaoImportarDados.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        BotaoImportarDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_adicionar_32x32.png"))); // NOI18N
        BotaoImportarDados.setText("Importar");
        BotaoImportarDados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotaoImportarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoImportarDadosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        add(BotaoImportarDados, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoAdicionarPerguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAdicionarPerguntaActionPerformed
        try {
            PrincipalServidor.panelCadastroPergunta();
        } catch (Exception ex) {
            Logger.getLogger(MenuPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotaoAdicionarPerguntaActionPerformed

    private void BotaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BotaoSairActionPerformed
    private void BotaoDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDisciplinaActionPerformed
        PrincipalServidor.panelCadastroDisciplina();
    }//GEN-LAST:event_BotaoDisciplinaActionPerformed

    private void BotaoAssuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAssuntoActionPerformed
        try {
            PrincipalServidor.panelCadastroAssunto();
        } catch (Exception ex) {
            Logger.getLogger(MenuPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotaoAssuntoActionPerformed

    private void BotaoExportarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExportarDadosActionPerformed
        /**
         * Teste de Socket - Envio de Pergunta Via Porta determinada na Classe
         * Main
         */
        try {
            JOptionPane.showMessageDialog(null, "Enviando arquivos!, Apertar OK para prosseguir!");
            ManterKahootNegocio.enviandoDisciplinasViaSocket();
            Thread.sleep(5000);
            JOptionPane.showMessageDialog(null, "Enviado Disciplinas com sucesso, Apertar OK para prosseguir!");
            ManterKahootNegocio.enviandoRespostasViaSocket();
            Thread.sleep(5000);
            JOptionPane.showMessageDialog(null, "Enviado Respostas com sucesso, Apertar OK para prosseguir!");
            ManterKahootNegocio.enviandoPerguntasViaSocket();
            Thread.sleep(5000);
            JOptionPane.showMessageDialog(null, "Enviado Perguntas com sucesso, Apertar OK para prosseguir!");

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }//GEN-LAST:event_BotaoExportarDadosActionPerformed

    private void BotaoPlacarGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPlacarGeralActionPerformed
        // TODO add your handling code here:

        try {
            List<Usuario> usuarios = (List<Usuario>) (Object) usuarioDao.pesquisarTodosOrdenadoPorNome();
            PrincipalServidor.panelClassificacaoGeral(usuarios);
        } catch (Exception exception) {
        }

    }//GEN-LAST:event_BotaoPlacarGeralActionPerformed

    private void BotaoImportarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoImportarDadosActionPerformed
        // TODO add your handling code here:
        UsuarioDao usuarioDao = new UsuarioDaoImpl();

        try {
            Usuario user = ManterKahootNegocio.recebendoUsuarioViaSocket();
            JOptionPane.showMessageDialog(this, "Usuario recebido via rede!");
            boolean inserido = usuarioDao.inserir(user);
            if (inserido) {
                JOptionPane.showMessageDialog(this, "Usuario Inserido no banco");
            } else {
                JOptionPane.showMessageDialog(this, "Deu Ruim , verifique!");
            }
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(this, "Algo de errado não está certo.");
        }

    }//GEN-LAST:event_BotaoImportarDadosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAdicionarPergunta;
    private javax.swing.JButton BotaoAssunto;
    private javax.swing.JButton BotaoDisciplina;
    private javax.swing.JButton BotaoExportarDados;
    private javax.swing.JButton BotaoImportarDados;
    private javax.swing.JButton BotaoJogar;
    private javax.swing.JButton BotaoPlacarGeral;
    private javax.swing.JButton BotaoSair;
    private javax.swing.JLabel textoEscolherOpcao;
    // End of variables declaration//GEN-END:variables
}
