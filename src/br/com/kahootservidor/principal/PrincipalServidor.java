package br.com.kahootservidor.principal;

import br.com.kahootservidor.entidade.Servidor;
import br.com.kahootservidor.view.CadastroAssuntoPanel;
import br.com.kahootservidor.view.CadastroDisciplinaPanel;
import br.com.kahootservidor.view.CadastroPerguntaPanel;
import br.com.kahootservidor.view.FramePrincipal;
import br.com.kahootservidor.view.MenuPanel;
import java.io.IOException;
import javax.swing.JFrame;

/**
 *
 * @author Alunos Version 1.0
 */
public class PrincipalServidor {

    private static FramePrincipal frame;

    public static Servidor CONFIGURACAO_GLOBAL = new Servidor();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {

        /**
         * Configuracao de Ip e porta Aqui!
         */
        CONFIGURACAO_GLOBAL.setIp("localhost");
        CONFIGURACAO_GLOBAL.setPorta(8787);

        // TODO code application logic here
        frame = new FramePrincipal();
        frame.setTitle("KAHOOT!");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    public static void panelMenu() {
        MenuPanel panel = new MenuPanel();
        frame.setContentPane(panel);
        frame.setVisible(true);
    }

    public static void panelCadastroPergunta() throws Exception {
        CadastroPerguntaPanel panel = new CadastroPerguntaPanel();
        frame.setContentPane(panel);
        frame.setVisible(true);
    }

    public static void panelCadastroDisciplina() {
        CadastroDisciplinaPanel panel = new CadastroDisciplinaPanel();
        frame.setContentPane(panel);
        frame.setVisible(true);
    }

    public static void panelCadastroAssunto() throws Exception {
        CadastroAssuntoPanel panel = new CadastroAssuntoPanel();
        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}
