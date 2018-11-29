package br.com.kahoot.view;

import br.com.kahoot.dao.AssuntoDao;
import br.com.kahoot.dao.PerguntaDao;
import br.com.kahoot.dao.RespostaDao;
import br.com.kahoot.daoimpl.AssuntoDaoImpl;
import br.com.kahoot.daoimpl.PerguntaDaoImpl;
import br.com.kahoot.daoimpl.RespostaDaoImpl;
import br.com.kahoot.entidade.Assunto;
import br.com.kahoot.entidade.Pergunta;
import br.com.kahoot.entidade.Resposta;
import br.com.kahoot.principal.PrincipalServidor;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Agostinho Detófano Junior - Criacao da Classe Com Interface
 * @author William Bigas Mauro - Documentação e Melhorias
 * @since 29/11/2018
 */
public class CadastroPerguntaPanel extends javax.swing.JPanel {

    private PerguntaDao PERGUNTA_DAO = new PerguntaDaoImpl();
    private AssuntoDao ASSUNTO_DAO = new AssuntoDaoImpl();
    private RespostaDao RESPOSTA_DAO = new RespostaDaoImpl();
    private Assunto ASSUNTO_SELECIONADO = new Assunto();

    public CadastroPerguntaPanel() throws Exception {
        initComponents();

        ListarComboBox();
    }

    public void ListarComboBox() throws Exception {
        MostrandoListaAssunto();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        PanelSuperior = new javax.swing.JPanel();
        textoCadastroPergunta = new javax.swing.JLabel();
        PanelPergunta = new javax.swing.JPanel();
        CampoPergunta = new javax.swing.JTextField();
        textoPergunta = new javax.swing.JLabel();
        PanelBotaoInferior = new javax.swing.JPanel();
        BotaoVoltar = new javax.swing.JButton();
        BotaoGravar = new javax.swing.JButton();
        ComboAssunto = new javax.swing.JComboBox<>();
        PanelCorpo = new javax.swing.JPanel();
        textoResposta1 = new javax.swing.JLabel();
        textoResposta2 = new javax.swing.JLabel();
        textoResposta3 = new javax.swing.JLabel();
        textoResposta4 = new javax.swing.JLabel();
        CampoResposta1 = new javax.swing.JTextField();
        CampoResposta2 = new javax.swing.JTextField();
        CampoResposta3 = new javax.swing.JTextField();
        CampoResposta4 = new javax.swing.JTextField();
        BotaoResposta1 = new javax.swing.JRadioButton();
        BotaoResposta2 = new javax.swing.JRadioButton();
        BotaoResposta3 = new javax.swing.JRadioButton();
        BotaoResposta4 = new javax.swing.JRadioButton();
        textoDesenvolvimento = new javax.swing.JLabel();

        setLayout(new java.awt.GridBagLayout());

        PanelSuperior.setLayout(new java.awt.GridBagLayout());

        textoCadastroPergunta.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        textoCadastroPergunta.setText("CADASTRO PERGUNTA");
        PanelSuperior.add(textoCadastroPergunta, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        add(PanelSuperior, gridBagConstraints);

        PanelPergunta.setLayout(new java.awt.GridBagLayout());

        CampoPergunta.setColumns(30);
        CampoPergunta.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        PanelPergunta.add(CampoPergunta, gridBagConstraints);

        textoPergunta.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        textoPergunta.setText("PERGUNTA:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        PanelPergunta.add(textoPergunta, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        add(PanelPergunta, gridBagConstraints);

        PanelBotaoInferior.setLayout(new java.awt.GridBagLayout());

        BotaoVoltar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BotaoVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_voltar_32x32.png"))); // NOI18N
        BotaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVoltarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        PanelBotaoInferior.add(BotaoVoltar, gridBagConstraints);

        BotaoGravar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BotaoGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_salvar_32x32.png"))); // NOI18N
        BotaoGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoGravarActionPerformed(evt);
            }
        });
        PanelBotaoInferior.add(BotaoGravar, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        add(PanelBotaoInferior, gridBagConstraints);

        ComboAssunto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ComboAssunto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o Assunto" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(ComboAssunto, gridBagConstraints);

        PanelCorpo.setBorder(javax.swing.BorderFactory.createTitledBorder("RESPOSTAS"));
        PanelCorpo.setLayout(new java.awt.GridBagLayout());

        textoResposta1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        textoResposta1.setText("Resposta 1:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        PanelCorpo.add(textoResposta1, gridBagConstraints);

        textoResposta2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        textoResposta2.setText("Resposta 2:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        PanelCorpo.add(textoResposta2, gridBagConstraints);

        textoResposta3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        textoResposta3.setText("Resposta 3:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        PanelCorpo.add(textoResposta3, gridBagConstraints);

        textoResposta4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        textoResposta4.setText("Resposta 4;");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        PanelCorpo.add(textoResposta4, gridBagConstraints);

        CampoResposta1.setColumns(30);
        CampoResposta1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        PanelCorpo.add(CampoResposta1, gridBagConstraints);

        CampoResposta2.setColumns(30);
        CampoResposta2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        PanelCorpo.add(CampoResposta2, gridBagConstraints);

        CampoResposta3.setColumns(30);
        CampoResposta3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        PanelCorpo.add(CampoResposta3, gridBagConstraints);

        CampoResposta4.setColumns(30);
        CampoResposta4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        PanelCorpo.add(CampoResposta4, gridBagConstraints);

        BotaoResposta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoResposta1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        PanelCorpo.add(BotaoResposta1, gridBagConstraints);

        BotaoResposta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoResposta2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        PanelCorpo.add(BotaoResposta2, gridBagConstraints);

        BotaoResposta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoResposta3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        PanelCorpo.add(BotaoResposta3, gridBagConstraints);

        BotaoResposta4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoResposta4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        PanelCorpo.add(BotaoResposta4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        add(PanelCorpo, gridBagConstraints);

        textoDesenvolvimento.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        textoDesenvolvimento.setText("Desenvolvido por Agostinho, Adriene, kellison, William");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        add(textoDesenvolvimento, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVoltarActionPerformed
        /**
         * Volta para o menu do projeto
         */
        PrincipalServidor.panelMenu();
    }//GEN-LAST:event_BotaoVoltarActionPerformed

    private void BotaoGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoGravarActionPerformed
        /**
         * Verificando se os campos foram preenchidos corretamente
         */
        if (CampoPergunta.getText().isEmpty()
                || CampoResposta1.getText().isEmpty()
                || CampoResposta2.getText().isEmpty()
                || CampoResposta3.getText().isEmpty()
                || CampoResposta4.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor preencha todos os campos para prosseguir!");
            /**
             *
             */
        } else {
            /**
             * Realiza todo o processo de Cadastro de Pergunta
             */
            jogandoInformacaoNaComboBox();
            Pergunta pergunta = new Pergunta();
            pergunta.setAssunto(ASSUNTO_SELECIONADO);
            pergunta.setPergunta(CampoPergunta.getText());
            List<Resposta> respostasDoUsuario = pegandoRespostasDoUsuario();
            pergunta.setRespostas(respostasDoUsuario);
            pergunta.setTempo(1); // falta implementar!
            validandoInsertNoBanco(pergunta);

        }


    }//GEN-LAST:event_BotaoGravarActionPerformed

    /**
     * Fazendo a validacao do Insert no banco.
     *
     * @param pergunta
     * @throws HeadlessException
     */
    private void validandoInsertNoBanco(Pergunta pergunta) throws HeadlessException {
        try {
            boolean inserido = PERGUNTA_DAO.inserir(pergunta);
            if (inserido) {
                JOptionPane.showMessageDialog(this, "Inserido com Sucesso!");
                List<Pergunta> perguntasDoBanco = (List<Pergunta>) (Object) PERGUNTA_DAO.pesquisarTodos();

            } else {
                JOptionPane.showMessageDialog(null, "Não inseriu!");
            }
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(this, "ixi , deu pau no banco!");
        }
    }

    /**
     * Pegando Assunto do banco e jogando na ComboBox do Panel
     */
    private void jogandoInformacaoNaComboBox() {
        String nome = (String) ComboAssunto.getSelectedItem();
        try {

            List<Assunto> ASSUNTOS = (List<Assunto>) (Object) ASSUNTO_DAO.pesquisarTodos();
            for (int i = 0; i < ASSUNTOS.size(); i++) {
                Assunto get = ASSUNTOS.get(i);
                if (get.getNome().equals(nome)) {
                    ASSUNTO_SELECIONADO = get;
                }
            }
        } catch (Exception exception) {
        }
    }

    /**
     * Criando lista de Respostas, Associando a uma lista e Setando na Pergunta.
     *
     * @return
     */
    private List<Resposta> pegandoRespostasDoUsuario() {
        List<Resposta> respostasDoUsuario = new ArrayList<>();
        Resposta rsp1 = new Resposta();
        Resposta rsp2 = new Resposta();
        Resposta rsp3 = new Resposta();
        Resposta rsp4 = new Resposta();
        rsp1.setResposta(CampoResposta1.getText());
        rsp2.setResposta(CampoResposta2.getText());
        rsp3.setResposta(CampoResposta3.getText());
        rsp4.setResposta(CampoResposta4.getText());
        verificandoAsCheckBoxSelecionadas(rsp1, rsp2, rsp3, rsp4);
        respostasDoUsuario.add(rsp1);
        respostasDoUsuario.add(rsp2);
        respostasDoUsuario.add(rsp3);
        respostasDoUsuario.add(rsp4);
        return respostasDoUsuario;
    }

    /**
     * Fazendo validacao das Checkbox para que só haja uma checkbox marcada na
     * hora de inserir no banco
     *
     * @param rsp1
     * @param rsp2
     * @param rsp3
     * @param rsp4
     */
    private void verificandoAsCheckBoxSelecionadas(Resposta rsp1, Resposta rsp2, Resposta rsp3, Resposta rsp4) {
        if (BotaoResposta1.isSelected()) {
            rsp1.setCorreta(true);
            rsp2.setCorreta(false);
            rsp3.setCorreta(false);
            rsp4.setCorreta(false);
        }

        if (BotaoResposta2.isSelected()) {
            rsp1.setCorreta(false);
            rsp2.setCorreta(true);
            rsp3.setCorreta(false);
            rsp4.setCorreta(false);
        }

        if (BotaoResposta3.isSelected()) {
            rsp1.setCorreta(false);
            rsp2.setCorreta(false);
            rsp3.setCorreta(true);
            rsp4.setCorreta(false);
        }

        if (BotaoResposta4.isSelected()) {
            rsp1.setCorreta(false);
            rsp2.setCorreta(false);
            rsp3.setCorreta(false);
            rsp4.setCorreta(true);
        }
    }

    /**
     * Verificando se o usuario marcar o primeiro botao o resto se torna
     * Imarcável
     *
     * @param evt
     */
    private void BotaoResposta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoResposta1ActionPerformed
        if (BotaoResposta1.isSelected()) {
            BotaoResposta2.setSelected(false);
            BotaoResposta3.setSelected(false);
            BotaoResposta4.setSelected(false);
        }
    }//GEN-LAST:event_BotaoResposta1ActionPerformed

    /**
     * Verificando se o usuario marcar o segundo botao o resto se torna
     * Imarcável
     *
     * @param evt
     */
    private void BotaoResposta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoResposta2ActionPerformed
        if (BotaoResposta2.isSelected()) {
            BotaoResposta1.setSelected(false);
            BotaoResposta3.setSelected(false);
            BotaoResposta4.setSelected(false);
        }
    }//GEN-LAST:event_BotaoResposta2ActionPerformed
    /**
     * Verificando se o usuario marcar o terceiro botao o resto se torna
     * Imarcável
     *
     * @param evt
     */
    private void BotaoResposta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoResposta3ActionPerformed
        if (BotaoResposta3.isSelected()) {
            BotaoResposta1.setSelected(false);
            BotaoResposta2.setSelected(false);
            BotaoResposta4.setSelected(false);
        }
    }//GEN-LAST:event_BotaoResposta3ActionPerformed

    /**
     * Verificando se o usuario marcar o quarto botao o resto se torna Imarcável
     *
     * @param evt
     */
    private void BotaoResposta4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoResposta4ActionPerformed
        if (BotaoResposta4.isSelected()) {
            BotaoResposta1.setSelected(false);
            BotaoResposta2.setSelected(false);
            BotaoResposta3.setSelected(false);
        }
    }//GEN-LAST:event_BotaoResposta4ActionPerformed

    /**
     * Trazendo lista de Assunto na Combo Box
     *
     * @throws Exception
     */
    public void MostrandoListaAssunto() throws Exception {
        try {
            List<?> assuntos = ASSUNTO_DAO.pesquisarTodos();
            List<Assunto> assunto = (List<Assunto>) (Object) assuntos;
            for (Assunto ass : assunto) {
                ComboAssunto.addItem(ass.getNome());
            }
        } catch (SQLException ex) {
            System.out.println(ex.getStackTrace());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoGravar;
    private javax.swing.JRadioButton BotaoResposta1;
    private javax.swing.JRadioButton BotaoResposta2;
    private javax.swing.JRadioButton BotaoResposta3;
    private javax.swing.JRadioButton BotaoResposta4;
    private javax.swing.JButton BotaoVoltar;
    private javax.swing.JTextField CampoPergunta;
    private javax.swing.JTextField CampoResposta1;
    private javax.swing.JTextField CampoResposta2;
    private javax.swing.JTextField CampoResposta3;
    private javax.swing.JTextField CampoResposta4;
    private javax.swing.JComboBox<String> ComboAssunto;
    private javax.swing.JPanel PanelBotaoInferior;
    private javax.swing.JPanel PanelCorpo;
    private javax.swing.JPanel PanelPergunta;
    private javax.swing.JPanel PanelSuperior;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JLabel textoCadastroPergunta;
    private javax.swing.JLabel textoDesenvolvimento;
    private javax.swing.JLabel textoPergunta;
    private javax.swing.JLabel textoResposta1;
    private javax.swing.JLabel textoResposta2;
    private javax.swing.JLabel textoResposta3;
    private javax.swing.JLabel textoResposta4;
    // End of variables declaration//GEN-END:variables
}
