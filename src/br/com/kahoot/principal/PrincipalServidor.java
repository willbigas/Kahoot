package br.com.kahoot.principal;

import br.com.kahoot.entidade.Servidor;
import br.com.kahoot.entidade.Usuario;
import br.com.kahoot.view.CadastroAssuntoPanel;
import br.com.kahoot.view.CadastroDisciplinaPanel;
import br.com.kahoot.view.CadastroPerguntaPanel;
import br.com.kahoot.view.FramePrincipal;
import br.com.kahoot.view.MenuPanel;
import br.com.kahoot.view.ClassificacaoGeralPainel;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Classe Principal que Serta a configuracao socket e inicializa
 *
 * @author Alunos Version 1.0
 */
public class PrincipalServidor {
    
    private static FramePrincipal frame;
    
    public static Servidor CONFIGURACAO_GLOBAL = new Servidor();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        /**
         * Configuracao de Ip e porta Aqui!
         */
        String ip = JOptionPane.showInputDialog("Digite o IP do Servidor");
        String porta = JOptionPane.showInputDialog("Digite a Porta do Servidor");
        CONFIGURACAO_GLOBAL.setIp(ip);
        CONFIGURACAO_GLOBAL.setPorta(Integer.valueOf(porta));

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
    
    public static void panelClassificacaoGeral(List<Usuario> usuarios) throws Exception {
        ClassificacaoGeralPainel panel = new ClassificacaoGeralPainel(usuarios);
        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}
