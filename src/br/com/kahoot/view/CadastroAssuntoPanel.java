package br.com.kahoot.view;

import br.com.kahoot.dao.AssuntoDao;
import br.com.kahoot.dao.DisciplinaDao;
import br.com.kahoot.daoimpl.AssuntoDaoImpl;
import br.com.kahoot.daoimpl.DisciplinaDaoImpl;
import br.com.kahoot.entidade.Assunto;
import br.com.kahoot.entidade.Disciplina;
import br.com.kahoot.principal.PrincipalServidor;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author William Bigas Mauro - Documentação e Melhorias
 * @author Agostinho - Criacao de Interface
 * @since 29/11/2018
 */
public class CadastroAssuntoPanel extends javax.swing.JPanel {

    public CadastroAssuntoPanel() throws Exception {
        initComponents();
        ListarComboBox();
    }

    public void ListarComboBox() throws Exception {
        mostrandoListaDeDiscipinas();
    }

    /**
     * Mostrando Lista de Disciplinas na Combo Box
     *
     * @throws Exception
     */
    public void mostrandoListaDeDiscipinas() throws Exception {
        DisciplinaDao disciplinaDao = new DisciplinaDaoImpl();
        try {
            List<?> disciplinas = disciplinaDao.pesquisarTodos();
            List<Disciplina> disciplina = (List<Disciplina>) (Object) disciplinas;
            for (Disciplina disc : disciplina) {
                ComboDisciplina.addItem(disc.getNome());
            }
        } catch (SQLException ex) {
            System.err.println("Erro ao pesquisar disciplina"
                    + ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel2 = new javax.swing.JLabel();
        CampoNome = new javax.swing.JTextField();
        ComboDisciplina = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        BotaoVoltar = new javax.swing.JButton();
        BotaoSalvar = new javax.swing.JButton();

        setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Nome:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 7, 7);
        add(jLabel2, gridBagConstraints);

        CampoNome.setColumns(20);
        CampoNome.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 7, 7);
        add(CampoNome, gridBagConstraints);

        ComboDisciplina.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ComboDisciplina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma disciplina" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 7, 7);
        add(ComboDisciplina, gridBagConstraints);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setText("CADASTRO ASSUNTO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(jLabel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 7, 7);
        add(jPanel1, gridBagConstraints);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        BotaoVoltar.setBackground(new java.awt.Color(204, 204, 204));
        BotaoVoltar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BotaoVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_voltar_32x32.png"))); // NOI18N
        BotaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVoltarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(BotaoVoltar, gridBagConstraints);

        BotaoSalvar.setBackground(new java.awt.Color(204, 204, 204));
        BotaoSalvar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BotaoSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_salvar_32x32.png"))); // NOI18N
        BotaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSalvarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(BotaoSalvar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 7, 7);
        add(jPanel2, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVoltarActionPerformed
        /**
         * Aqui volta para o menu do projeto
         */
        PrincipalServidor.panelMenu();
    }//GEN-LAST:event_BotaoVoltarActionPerformed

    private void BotaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSalvarActionPerformed
        /**
         * Recebendo da Inteface e salvando Assunto no Banco de dados.
         */
        SalvandoAssunto();
    }//GEN-LAST:event_BotaoSalvarActionPerformed

    public void SalvandoAssunto() throws HeadlessException {
        /**
         * Verificando se os campos foram preenchidos corretamente
         *
         */
        if (CampoNome.getText().isEmpty()
                || ComboDisciplina.getSelectedItem().equals(0)) {
            JOptionPane.showMessageDialog(null, "Por favor preencher todos os campos");
        } else {
            /**
             * Criando objeto Assunto
             */
            CriandoAssunto();
        }
    }

    public void CriandoAssunto() {
        AssuntoDao assuntoDao = new AssuntoDaoImpl();
        try {
            /**
             * Atribuindo os atributos ah assunto
             */
            Assunto assunto = new Assunto();
            assunto.setNome(CampoNome.getText());
            int id = ComboDisciplina.getSelectedIndex();
            Disciplina disciplina = new Disciplina();
            disciplina.setId(id);
            assunto.setDisciplina(disciplina);
            /**
             * Verificando se a combobox foi inserida
             */
            if (disciplina.getId().equals(0)) {
                JOptionPane.showMessageDialog(null, "Por favor preencha a combobox!");
                /**
                 * Se foi todos os campos inseridos e gravado no bd
                 */
            } else {
                boolean inserido = assuntoDao.inserir(assunto);
                if (inserido) {
                    JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
                    CampoNome.setText(null);
                    ComboDisciplina.setSelectedIndex(0);

                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getStackTrace());
            try {
                PrincipalServidor.panelCadastroAssunto();
            } catch (Exception exl) {
                System.out.println(exl.getStackTrace());
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoSalvar;
    private javax.swing.JButton BotaoVoltar;
    private javax.swing.JTextField CampoNome;
    private javax.swing.JComboBox<String> ComboDisciplina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
