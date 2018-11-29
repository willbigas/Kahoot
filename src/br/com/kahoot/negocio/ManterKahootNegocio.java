/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import java.util.List;

/**
 *
 * @author Alunos
 */
public class ManterKahootNegocio {

    public static DisciplinaDao DISCIPLINA_DAO = new DisciplinaDaoImpl();
    public static AssuntoDao ASSUNTO_DAO = new AssuntoDaoImpl();
    public static PerguntaDao PERGUNTA_DAO = new PerguntaDaoImpl();
    public static RespostaDao RESPOSTA_DAO = new RespostaDaoImpl();
    public static UsuarioDao USUARIO_DAO = new UsuarioDaoImpl();

    /**
     * Disciplinas via Socket *
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

    public static List<Disciplina> recebendoDisciplinasViaSocket() throws Exception {
        List<Disciplina> disciplinas = (List<Disciplina>) ManterSocketNegocio.recebendoDadosViaSocket(
                PrincipalServidor.CONFIGURACAO_GLOBAL.getPorta());
        return disciplinas;
    }

    /**
     * Perguntas via Socket *
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

    public static List<Pergunta> recebendoPerguntasViaSocket() throws Exception {
        List<Pergunta> perguntas = (List<Pergunta>) ManterSocketNegocio.recebendoDadosViaSocket(
                PrincipalServidor.CONFIGURACAO_GLOBAL.getPorta());
        return perguntas;
    }

    /**
     * Respostas Via Socket *
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

    public static List<Resposta> recebendoRespostasViaSocket() throws Exception {
        List<Resposta> respostas = (List<Resposta>) ManterSocketNegocio.recebendoDadosViaSocket(
                PrincipalServidor.CONFIGURACAO_GLOBAL.getPorta());
        return respostas;
    }

    /**
     * Usuario via Socket *
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
    
    public static List<Usuario> recebendoUsuariosViaSocket() throws Exception {
        List<Usuario> usuarios = (List<Usuario>) ManterSocketNegocio.recebendoDadosViaSocket(
                PrincipalServidor.CONFIGURACAO_GLOBAL.getPorta());
        return usuarios;
    }

}
