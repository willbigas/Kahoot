package br.com.principal;

import br.com.view.CadastroAssuntoPanel;
import br.com.view.CadastroDisciplinaPanel;
import br.com.view.CadastroPerguntaPanel;
import br.com.view.FramePrincipal;
import br.com.view.MenuPanel;
import javax.swing.JFrame;

/**
 *
 * @author Alunos Version 1.0
 */
public class Principal {

    private static FramePrincipal frame;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
