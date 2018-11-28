package br.com.principal;

import br.com.kahoot.entidade.Assunto;
import br.com.kahoot.entidade.Disciplina;
import br.com.view.CadastroAssuntoPanel;
import br.com.view.CadastroDisciplinaPanel;
import br.com.view.CadastroPerguntaPanel;
import br.com.view.FramePrincipal;
import br.com.view.MenuPanel;
import java.io.IOException;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author Alunos Version 1.0
 */
public class PrincipalServidor {
    
    private static FramePrincipal frame;
    
    public static ConfigurarServidor CONFIGURACAO_GLOBAL = new ConfigurarServidor();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        
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
