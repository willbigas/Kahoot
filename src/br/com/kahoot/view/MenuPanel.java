package br.com.kahoot.view;

import br.com.kahoot.dao.UsuarioDao;
import br.com.kahoot.daoimpl.UsuarioDaoImpl;
import br.com.kahoot.entidade.Usuario;
import br.com.kahoot.negocio.ManterKahootNegocio;
import br.com.kahoot.negocio.ManterSocketNegocio;
import br.com.kahoot.principal.PrincipalServidor;
import static br.com.kahoot.principal.PrincipalServidor.CONFIGURACAO_GLOBAL;
import java.awt.HeadlessException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Agostinho Detofano Junior - View e Model
 * @author William Bigas Mauro - Ajustes e Documentacoes
 * @since 05/12/2018
 */
public class MenuPanel extends javax.swing.JPanel {

    public static UsuarioDao usuarioDao = new UsuarioDaoImpl();

    public MenuPanel() {
        initComponents();
        jogandoIpNaTela();

    }

    /**
     * Pega o IP da maquina e joga na tela de Menu
     */
    private void jogandoIpNaTela() {
        InetAddress ipAtual;
        try {
            ipAtual = InetAddress.getLocalHost();
            textoIpServidor.setText(ipAtual.getHostAddress());
        } catch (UnknownHostException unknownHostException) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        BotaoAdicionarPergunta = new javax.swing.JButton();
        textoEscolherOpcao = new javax.swing.JLabel();
        BotaoSair = new javax.swing.JButton();
        BotaoAssunto = new javax.swing.JButton();
        BotaoDisciplina = new javax.swing.JButton();
        BotaoPlacarGeral = new javax.swing.JButton();
        bottonConfigConexao = new javax.swing.JButton();
        textoIpServidor = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 153));
        setLayout(new java.awt.GridBagLayout());

        BotaoAdicionarPergunta.setBackground(new java.awt.Color(255, 255, 255));
        BotaoAdicionarPergunta.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        BotaoAdicionarPergunta.setForeground(new java.awt.Color(0, 0, 0));
        BotaoAdicionarPergunta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_adicionar_32x32.png"))); // NOI18N
        BotaoAdicionarPergunta.setText("Pergunta");
        BotaoAdicionarPergunta.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BotaoAdicionarPergunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAdicionarPerguntaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(BotaoAdicionarPergunta, gridBagConstraints);

        textoEscolherOpcao.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        textoEscolherOpcao.setForeground(new java.awt.Color(0, 0, 0));
        textoEscolherOpcao.setText("Escolha uma opção!");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        add(textoEscolherOpcao, gridBagConstraints);

        BotaoSair.setBackground(new java.awt.Color(255, 255, 255));
        BotaoSair.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        BotaoSair.setForeground(new java.awt.Color(0, 0, 0));
        BotaoSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_sair_32x32.png"))); // NOI18N
        BotaoSair.setText("SAIR");
        BotaoSair.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BotaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(BotaoSair, gridBagConstraints);

        BotaoAssunto.setBackground(new java.awt.Color(255, 255, 255));
        BotaoAssunto.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        BotaoAssunto.setForeground(new java.awt.Color(0, 0, 0));
        BotaoAssunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_adicionar_32x32.png"))); // NOI18N
        BotaoAssunto.setText("Assunto");
        BotaoAssunto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BotaoAssunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAssuntoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(BotaoAssunto, gridBagConstraints);

        BotaoDisciplina.setBackground(new java.awt.Color(255, 255, 255));
        BotaoDisciplina.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        BotaoDisciplina.setForeground(new java.awt.Color(0, 0, 0));
        BotaoDisciplina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_adicionar_32x32.png"))); // NOI18N
        BotaoDisciplina.setText("Disciplina");
        BotaoDisciplina.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BotaoDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDisciplinaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(BotaoDisciplina, gridBagConstraints);

        BotaoPlacarGeral.setBackground(new java.awt.Color(255, 255, 255));
        BotaoPlacarGeral.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        BotaoPlacarGeral.setForeground(new java.awt.Color(0, 0, 0));
        BotaoPlacarGeral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_adicionar_32x32.png"))); // NOI18N
        BotaoPlacarGeral.setText("Placar Geral");
        BotaoPlacarGeral.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BotaoPlacarGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPlacarGeralActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(BotaoPlacarGeral, gridBagConstraints);

        bottonConfigConexao.setBackground(new java.awt.Color(255, 255, 255));
        bottonConfigConexao.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        bottonConfigConexao.setForeground(new java.awt.Color(0, 0, 0));
        bottonConfigConexao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_adicionar_32x32.png"))); // NOI18N
        bottonConfigConexao.setText("Iniciar Conexão");
        bottonConfigConexao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bottonConfigConexao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottonConfigConexaoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(bottonConfigConexao, gridBagConstraints);

        textoIpServidor.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        textoIpServidor.setForeground(new java.awt.Color(0, 0, 0));
        textoIpServidor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(textoIpServidor, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Meu IP");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        add(jLabel1, gridBagConstraints);
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

    /**
     * Pega todos os Objetos e Usa Server socket para enviar via rede
     *
     * @param mensagem
     */
    private static void enviandoTudo(String mensagem) {
        try {
            ManterKahootNegocio.enviandoDisciplinasViaSocket(CONFIGURACAO_GLOBAL.getPorta(), mensagem);
            ManterKahootNegocio.enviandoRespostasViaSocket(CONFIGURACAO_GLOBAL.getPorta(), mensagem);
            ManterKahootNegocio.enviandoPerguntasViaSocket(CONFIGURACAO_GLOBAL.getPorta(), mensagem);

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void BotaoPlacarGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPlacarGeralActionPerformed
        try {
            List<Usuario> usuarios = (List<Usuario>) (Object) usuarioDao.pesquisarTodosOrdenadoPorNome();
            PrincipalServidor.panelClassificacaoGeral(usuarios);
        } catch (Exception exception) {
        }

    }//GEN-LAST:event_BotaoPlacarGeralActionPerformed

    private static void mandandoUsuarioProBanco(Usuario user) throws HeadlessException {
        try {
            boolean inserido = usuarioDao.inserir(user);
            if (inserido) {
                JOptionPane.showMessageDialog(null, "Usuario Inserido no banco");
            } else {
                JOptionPane.showMessageDialog(null, "Deu Ruim , verifique!");
            }
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, "Algo de errado não está certo.");
        }
    }

    private void bottonConfigConexaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottonConfigConexaoActionPerformed
        try {
            configurandoConexao();
            PrincipalServidor.panelMenu();
//            ManterKahootNegocio.recebendoUsuarioViaSocketInfinitamente();

        } catch (HeadlessException ex) {
        } catch (Exception ex) {
        }

    }//GEN-LAST:event_bottonConfigConexaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAdicionarPergunta;
    private javax.swing.JButton BotaoAssunto;
    private javax.swing.JButton BotaoDisciplina;
    private javax.swing.JButton BotaoPlacarGeral;
    private javax.swing.JButton BotaoSair;
    private javax.swing.JButton bottonConfigConexao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel textoEscolherOpcao;
    private javax.swing.JLabel textoIpServidor;
    // End of variables declaration//GEN-END:variables

    private static void configurandoConexao() throws NumberFormatException, HeadlessException, Exception {
        String porta = JOptionPane.showInputDialog("Digite a Porta do Servidor");
        CONFIGURACAO_GLOBAL.setPorta(Integer.valueOf(porta));
        ManterSocketNegocio.iniciarSocket(CONFIGURACAO_GLOBAL.getPorta());
        Thread t = new Thread() {
            public void run() {
                try {
                    while (true) {
                        Socket entradaDados = ManterSocketNegocio.getServidor().accept();
                        ObjectInputStream input = new ObjectInputStream(entradaDados.getInputStream());
                        Object objRecebido = input.readObject();
                        if (objRecebido instanceof Usuario) {
                            mandandoUsuarioProBanco((Usuario) objRecebido);

                        } else if (objRecebido instanceof String) {
                            String mensagem = (String) objRecebido;
                            enviandoTudo(mensagem);
                        }

                        entradaDados.close();
                    }
                } catch (IOException iOException) {
                } catch (ClassNotFoundException classNotFoundException) {
                }
            }
        };
        t.start();

    }
}
