package br.com.kahoot.negocio;

import br.com.kahoot.dao.AssuntoDao;
import br.com.kahoot.dao.DisciplinaDao;
import br.com.kahoot.dao.PerguntaDao;
import br.com.kahoot.dao.RespostaDao;
import br.com.kahoot.dao.UsuarioDao;
import br.com.kahoot.daoimpl.AssuntoDaoImpl;
import br.com.kahoot.daoimpl.DisciplinaDaoImpl;
import br.com.kahoot.daoimpl.PerguntaDaoImpl;
import br.com.kahoot.daoimpl.RespostaDaoImpl;
import br.com.kahoot.daoimpl.UsuarioDaoImpl;
import br.com.kahoot.entidade.Disciplina;
import br.com.kahoot.entidade.Pergunta;
import br.com.kahoot.entidade.Resposta;
import br.com.kahoot.entidade.Usuario;
import br.com.kahoot.principal.PrincipalServidor;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe de negocio que envia e recebe determinadas listas de Classes via
 * ServerSocket
 *
 * @author William Bigas Mauro
 * @since 29/11/2018
 */
public class ManterKahootNegocio {

    public static DisciplinaDao DISCIPLINA_DAO = new DisciplinaDaoImpl();
    public static AssuntoDao ASSUNTO_DAO = new AssuntoDaoImpl();
    public static PerguntaDao PERGUNTA_DAO = new PerguntaDaoImpl();
    public static RespostaDao RESPOSTA_DAO = new RespostaDaoImpl();
    public static UsuarioDao USUARIO_DAO = new UsuarioDaoImpl();

    /**
     * Enviando Disciplinas via Socket
     *
     * @return
     * @throws Exception
     */
    public static boolean enviandoDisciplinasViaSocket() throws Exception {
        List<Disciplina> disciplinas = (List<Disciplina>) (Object) DISCIPLINA_DAO.pesquisarTodos();
        try {
            ManterSocketNegocio.enviandoDadosViaSocket(PrincipalServidor.CONFIGURACAO_GLOBAL.getIp(),
                    PrincipalServidor.CONFIGURACAO_GLOBAL.getPorta(), disciplinas);
            return true;
        } catch (Exception exception) {
            return false;
        }

    }

    /**
     * Recebendo Disciplinas via Socket
     *
     * @return
     * @throws Exception
     */
    public static List<Disciplina> recebendoDisciplinasViaSocket() throws Exception {
        List<Disciplina> disciplinas = (List<Disciplina>) ManterSocketNegocio.recebendoDadosViaSocket(
                PrincipalServidor.CONFIGURACAO_GLOBAL.getPorta());
        return disciplinas;
    }

    /**
     * Enviando Perguntas via Socket.
     *
     * @return
     * @throws Exception
     */
    public static boolean enviandoPerguntasViaSocket() throws Exception {
        List<Pergunta> perguntas = (List<Pergunta>) (Object) PERGUNTA_DAO.pesquisarTodos();
        try {
            ManterSocketNegocio.enviandoDadosViaSocket(PrincipalServidor.CONFIGURACAO_GLOBAL.getIp(),
                    PrincipalServidor.CONFIGURACAO_GLOBAL.getPorta(), perguntas);
            return true;
        } catch (Exception exception) {
            return false;
        }

    }

    /**
     * Recebendo Perguntas via Socket
     *
     * @return
     * @throws Exception
     */
    public static List<Pergunta> recebendoPerguntasViaSocket() throws Exception {
        List<Pergunta> perguntas = (List<Pergunta>) ManterSocketNegocio.recebendoDadosViaSocket(
                PrincipalServidor.CONFIGURACAO_GLOBAL.getPorta());
        return perguntas;
    }

    /**
     * Enviando respostas via socket.
     *
     * @return
     * @throws Exception
     */
    public static boolean enviandoRespostasViaSocket() throws Exception {
        List<Resposta> respostas = (List<Resposta>) (Object) RESPOSTA_DAO.pesquisarTodos();
        try {
            ManterSocketNegocio.enviandoDadosViaSocket(PrincipalServidor.CONFIGURACAO_GLOBAL.getIp(),
                    PrincipalServidor.CONFIGURACAO_GLOBAL.getPorta(), respostas);
            return true;
        } catch (Exception exception) {
            return false;
        }

    }

    /**
     * Recebendo respostas via socket
     *
     * @return
     * @throws Exception
     */
    public static List<Resposta> recebendoRespostasViaSocket() throws Exception {
        List<Resposta> respostas = (List<Resposta>) ManterSocketNegocio.recebendoDadosViaSocket(
                PrincipalServidor.CONFIGURACAO_GLOBAL.getPorta());
        return respostas;
    }

    /**
     * Enviando Usuarios via Socket.
     *
     * @return
     * @throws Exception
     */
    public static boolean enviandoUsuariosViaSocket() throws Exception {
        List<Usuario> usuarios = (List<Usuario>) (Object) USUARIO_DAO.pesquisarTodos();
        try {
            ManterSocketNegocio.enviandoDadosViaSocket(PrincipalServidor.CONFIGURACAO_GLOBAL.getIp(),
                    PrincipalServidor.CONFIGURACAO_GLOBAL.getPorta(), usuarios);
            return true;
        } catch (Exception exception) {
            return false;
        }

    }

    /**
     * Recebendo uma Lista de Usuarios via Socket.
     *
     * @return
     * @throws Exception
     */
    public static Usuario recebendoUsuarioViaSocket() throws Exception {
        Usuario usuario = (Usuario) ManterSocketNegocio.recebendoDadosViaSocket(
                PrincipalServidor.CONFIGURACAO_GLOBAL.getPorta());
        return usuario;
    }
    
    public static String recebendoIpViaSocket() throws Exception {
        String mensagem = (String) ManterSocketNegocio.recebendoDadosViaSocket(
                PrincipalServidor.CONFIGURACAO_GLOBAL.getPorta());
        return mensagem;
    }
    
    

    public static List<Usuario> pesquisarUsuario(String termo) throws Exception {
        List<Usuario> retorno = new ArrayList<>();
        List<?> objs = USUARIO_DAO.pesquisarTodos();
        List<Usuario> USUARIOS = (List<Usuario>) (Object) objs;

        for (Usuario usuario : USUARIOS) {
            if (usuario.getNome().toLowerCase().contains(termo.toLowerCase()) || usuario.getIp().contains(termo.toLowerCase())) {
                retorno.add(usuario);
            }

        }
        return retorno;
    }
    
    
    public static Usuario recebendoUsuarioViaSocketInfinitamente() throws Exception {
        Usuario usuario = (Usuario) ManterSocketNegocio.recebendoDadosViaSocketInfinitamente(
                PrincipalServidor.CONFIGURACAO_GLOBAL.getPorta());
        return usuario;
    }

}
