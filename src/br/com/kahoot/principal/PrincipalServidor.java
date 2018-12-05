package br.com.kahoot.principal;

import br.com.kahoot.entidade.Servidor;
import br.com.kahoot.entidade.Usuario;
import br.com.kahoot.negocio.ManterKahootNegocio;
import br.com.kahoot.view.CadastroAssuntoPanel;
import br.com.kahoot.view.CadastroDisciplinaPanel;
import br.com.kahoot.view.CadastroPerguntaPanel;
import br.com.kahoot.view.FramePrincipal;
import br.com.kahoot.view.MenuPanel;
import br.com.kahoot.view.ClassificacaoGeralPainel;
import java.awt.HeadlessException;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Classe Principal que faz a inicializa a configuracao socket e instancia as
 * demais classes
 *
 * @author William Bigas Mauro - Implementações de Socket e Regra de negocio
 * @author Agostinho Detofano Junior - View e Ajustes
 */
public class PrincipalServidor {

    private static FramePrincipal frame;

    public static Servidor CONFIGURACAO_GLOBAL = new Servidor();

    public static void main(String[] args) throws Exception {

        JanelaPrincipal();

    }

    private static void JanelaPrincipal() {
        /**
         * Frame Principal - Janela Principal
         */
        frame = new FramePrincipal();
        frame.setTitle("KAHOOT!");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    /**
     * Configurando Porta de Conexão Socket do Servidor e Recebendo Ip do
     * cliente por parametro para comunicacao
     *
     * @throws NumberFormatException
     * @throws HeadlessException
     * @throws Exception
     */
    private static void configurandoConexao() throws NumberFormatException, HeadlessException, Exception {
        String porta = JOptionPane.showInputDialog("Digite a Porta do Servidor");
        CONFIGURACAO_GLOBAL.setPorta(Integer.valueOf(porta));
        String ipCliente = ManterKahootNegocio.recebendoIpViaSocket();
        CONFIGURACAO_GLOBAL.setIp(ipCliente);
    }

    /**
     * Painel de Menu com as Opcoes
     */
    public static void panelMenu() {
        MenuPanel panel = new MenuPanel();
        frame.setContentPane(panel);
        frame.setVisible(true);
    }

    /**
     * Panel de Cadastro de Perguntas
     *
     * @throws Exception
     */
    public static void panelCadastroPergunta() throws Exception {
        CadastroPerguntaPanel panel = new CadastroPerguntaPanel();
        frame.setContentPane(panel);
        frame.setVisible(true);
    }

    /**
     * Panel de cadastro de Disciplinas
     */
    public static void panelCadastroDisciplina() {
        CadastroDisciplinaPanel panel = new CadastroDisciplinaPanel();
        frame.setContentPane(panel);
        frame.setVisible(true);
    }

    /**
     * Painel de Cadastro de Assunto
     *
     * @throws Exception
     */
    public static void panelCadastroAssunto() throws Exception {
        CadastroAssuntoPanel panel = new CadastroAssuntoPanel();
        frame.setContentPane(panel);
        frame.setVisible(true);
    }

    /**
     * Panel de Resultado dos Usuarios
     *
     * @param usuarios
     * @throws Exception
     */
    public static void panelClassificacaoGeral(List<Usuario> usuarios) throws Exception {
        ClassificacaoGeralPainel panel = new ClassificacaoGeralPainel(usuarios);
        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}
