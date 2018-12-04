package br.com.kahoot.view;

import br.com.kahoot.entidade.Usuario;
import br.com.kahoot.negocio.ManterKahootNegocio;
import br.com.kahoot.principal.PrincipalServidor;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 * Classe que exibe uma tabela de classificação geral do Usuario pegando os
 * dados Banco de dados mysql
 *
 * @author William Bigas Mauro
 * @since 04/12/2018
 */
public class ClassificacaoGeralPainel extends javax.swing.JPanel {

    public ClassificacaoGeralPainel(List<Usuario> usuarios) {
        initComponents();
        adicionarListaUsuariosTabela(usuarios);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        textoBuscar = new javax.swing.JLabel();
        botaoBuscar = new javax.swing.JButton();
        campoPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaClassificacao = new javax.swing.JTable();
        botaoVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new java.awt.GridBagLayout());

        textoBuscar.setText("Buscar Resultado");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        add(textoBuscar, gridBagConstraints);

        botaoBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_buscar_24x24.png"))); // NOI18N
        botaoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBuscarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 13, 10, 10);
        add(botaoBuscar, gridBagConstraints);

        campoPesquisa.setColumns(15);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 2, 10, 10);
        add(campoPesquisa, gridBagConstraints);

        tabelaClassificacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelaClassificacao.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        jScrollPane1.setViewportView(tabelaClassificacao);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        add(jScrollPane1, gridBagConstraints);

        botaoVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_voltar_24x24.png"))); // NOI18N
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 40, 10, 40);
        add(botaoVoltar, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel1.setText("Resultado dos Jogos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(22, 22, 22, 22);
        add(jLabel1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBuscarActionPerformed

        pesquisandoUsuariosNaTabela();
    }//GEN-LAST:event_botaoBuscarActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        PrincipalServidor.panelMenu();
    }//GEN-LAST:event_botaoVoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoBuscar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JTextField campoPesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaClassificacao;
    private javax.swing.JLabel textoBuscar;
    // End of variables declaration//GEN-END:variables

    /**
     * Metodo que pesquisa Usuarios na tabela
     */
    public void pesquisandoUsuariosNaTabela() {
        List<Usuario> usuarios = null;
        try {
            usuarios = ManterKahootNegocio.pesquisarUsuario(campoPesquisa.getText());
        } catch (Exception exception) {
        }
        adicionarListaUsuariosTabela(usuarios);
    }

    /**
     * Tabela de Usuarios DefaultTableModel que carrega uma lista de Usuarios e
     * seus atributos
     *
     * @param usuarios
     */
    public void adicionarListaUsuariosTabela(List<Usuario> usuarios) {
        String[] colunas = {"Codigo", "Nome", "Pontos", "IP"};
        String[][] dados = new String[usuarios.size()][colunas.length];
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario u = usuarios.get(i);
            dados[i][0] = u.getId().toString();
            dados[i][1] = u.getNome();
            dados[i][2] = u.getPontos().toString();
            dados[i][3] = u.getIp();

        }
        DefaultTableModel modelo = new DefaultTableModel(dados, colunas);
        tabelaClassificacao.setModel(modelo);
    }
}
