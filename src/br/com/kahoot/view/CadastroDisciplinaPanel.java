package br.com.kahoot.view;

import br.com.kahoot.dao.DisciplinaDao;
import br.com.kahoot.daoimpl.DisciplinaDaoImpl;
import br.com.kahoot.entidade.Disciplina;
import br.com.kahoot.principal.PrincipalServidor;
import java.awt.HeadlessException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Classe de Cadastro de Disciplina com Interface Swing
 *
 * @author William Bigas Mauro
 * @author Agostinho Detófano Junior
 * @since 05/12/2018
 */
public class CadastroDisciplinaPanel extends javax.swing.JPanel {

    public static DisciplinaDao disciplinaDao = new DisciplinaDaoImpl();

    public CadastroDisciplinaPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        textoNome = new javax.swing.JLabel();
        textoProfessor = new javax.swing.JLabel();
        CampoNomeDisciplina = new javax.swing.JTextField();
        CampoProfessor = new javax.swing.JTextField();
        PanelBotaoInferior = new javax.swing.JPanel();
        BotaoVoltar = new javax.swing.JButton();
        BotaoSalvar = new javax.swing.JButton();
        PanelFundo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(144, 48, 0));
        setLayout(new java.awt.GridBagLayout());

        textoNome.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        textoNome.setForeground(new java.awt.Color(255, 255, 255));
        textoNome.setText("Nome:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(8, 8, 8, 8);
        add(textoNome, gridBagConstraints);

        textoProfessor.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        textoProfessor.setForeground(new java.awt.Color(255, 255, 255));
        textoProfessor.setText("Professor:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(8, 8, 8, 8);
        add(textoProfessor, gridBagConstraints);

        CampoNomeDisciplina.setColumns(30);
        CampoNomeDisciplina.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(8, 8, 8, 8);
        add(CampoNomeDisciplina, gridBagConstraints);

        CampoProfessor.setColumns(30);
        CampoProfessor.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(8, 8, 8, 8);
        add(CampoProfessor, gridBagConstraints);

        PanelBotaoInferior.setBackground(new java.awt.Color(144, 48, 0));
        PanelBotaoInferior.setLayout(new java.awt.GridBagLayout());

        BotaoVoltar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BotaoVoltar.setForeground(new java.awt.Color(255, 255, 255));
        BotaoVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_voltar_32x32.png"))); // NOI18N
        BotaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVoltarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 16);
        PanelBotaoInferior.add(BotaoVoltar, gridBagConstraints);

        BotaoSalvar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BotaoSalvar.setForeground(new java.awt.Color(255, 255, 255));
        BotaoSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_salvar_32x32.png"))); // NOI18N
        BotaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSalvarActionPerformed(evt);
            }
        });
        PanelBotaoInferior.add(BotaoSalvar, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 5);
        add(PanelBotaoInferior, gridBagConstraints);

        PanelFundo.setBackground(new java.awt.Color(144, 48, 0));
        PanelFundo.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CADASTRO DISCIPLINA");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        PanelFundo.add(jLabel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(8, 8, 8, 8);
        add(PanelFundo, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVoltarActionPerformed
        PrincipalServidor.panelMenu();
    }//GEN-LAST:event_BotaoVoltarActionPerformed

    private void BotaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSalvarActionPerformed
        try {
            salvandoDisciplina();
        } catch (Exception ex) {
            Logger.getLogger(CadastroDisciplinaPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotaoSalvarActionPerformed

    public void salvandoDisciplina() throws HeadlessException, Exception {
        if (CampoNomeDisciplina.getText().isEmpty() || CampoProfessor.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor preencha os campos para prosseguir");
        } else {
            Disciplina disciplina = criandoDisciplina();
            gravandoDisciplinaNoBanco(disciplina);
        }
    }

    /**
     * Faz a gravacao Do objeto Disciplina no Banco e Limpa os campos e logo em
     * seguida chama por algum motivo desconhecido Uma lista de disciplinas.
     * (ADJ documente isso!)
     *
     * @param disciplina
     * @throws HeadlessException
     * @throws Exception
     */
    public void gravandoDisciplinaNoBanco(Disciplina disciplina) throws HeadlessException, Exception {

        try {
            Boolean tudoOk = disciplinaDao.inserir(disciplina);
            if (tudoOk) {
                JOptionPane.showMessageDialog(null, "Disciplina inserida com sucesso!");
                limpandoDados(disciplina);
                PrincipalServidor.panelCadastroDisciplina();
            } else {
                JOptionPane.showMessageDialog(null, "Problemas ao cadastrar disciplina!");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Problema com banco Verificar!!");
        }

    }

    private void limpandoDados(Disciplina disciplina) {
        disciplina.setNome(null);
        disciplina.setProfessor(null);
    }

    public Disciplina criandoDisciplina() {
        Disciplina disciplina = new Disciplina();
        disciplina.setNome(CampoNomeDisciplina.getText());
        disciplina.setProfessor(CampoProfessor.getText());
        return disciplina;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoSalvar;
    private javax.swing.JButton BotaoVoltar;
    private javax.swing.JTextField CampoNomeDisciplina;
    private javax.swing.JTextField CampoProfessor;
    private javax.swing.JPanel PanelBotaoInferior;
    private javax.swing.JPanel PanelFundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel textoNome;
    private javax.swing.JLabel textoProfessor;
    // End of variables declaration//GEN-END:variables
}
