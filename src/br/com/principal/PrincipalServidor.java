package br.com.principal;

import br.com.kahoot.entidade.Disciplina;
import br.com.view.CadastroAssuntoPanel;
import br.com.view.CadastroDisciplinaPanel;
import br.com.view.CadastroPerguntaPanel;
import br.com.view.FramePrincipal;
import br.com.view.MenuPanel;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
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
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        iniciandoServidor();

        // TODO code application logic here
        frame = new FramePrincipal();
        frame.setTitle("KAHOOT!");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    private static void iniciandoServidor() throws IOException, ClassNotFoundException {
        ServerSocket servidor = new ServerSocket(8787);
        System.out.println("Servidor Iniciado");
        Socket cliente = servidor.accept();
        ObjectInputStream input = new ObjectInputStream(cliente.getInputStream());
        Object objRecebido = input.readObject();
        Disciplina discipinaRecebida = (Disciplina) objRecebido;
        System.out.println(discipinaRecebida.getId());
        System.out.println(discipinaRecebida.getNome());
        System.out.println(discipinaRecebida.getProfessor());
        System.out.println(cliente.getInetAddress().getHostAddress() + ":" + objRecebido.toString());
        servidor.close();
        cliente.close();
        System.out.println("Servidor Encerrado!");

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
