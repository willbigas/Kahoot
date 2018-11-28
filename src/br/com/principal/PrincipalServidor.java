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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {

//        iniciandoServidor();
        List<Object> objRecebido =(List<Object>) ManterSocketNegocio.recebendoDadosViaSocket(8787);
        for (int i = 0; i < objRecebido.size(); i++) {
            Object get = objRecebido.get(i);
            
            if (get instanceof Disciplina) {

            Disciplina disc = (Disciplina) get;
            System.out.println("id da Disciplina : " + disc.getId());
            System.out.println("Nome da Disciplina : " + disc.getNome());
            System.out.println("Professor da Disciplina : " + disc.getProfessor());
        }
            if (get instanceof Assunto) {
                Assunto assunto = (Assunto) get;
                System.out.println("Id do Assunto :" + assunto.getId());
                System.out.println("Nome do Assunto :" + assunto.getNome());
                System.out.println("Disciplina do Assunto :" + assunto.getDisciplina().getNome());
            } else {
                continue;
            }
            
        }
        

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
