/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.kahootservidor.principal;

import br.com.kahootservidor.dao.AssuntoDao;
import br.com.kahootservidor.dao.DisciplinaDao;
import br.com.kahootservidor.dao.PerguntaDao;
import br.com.kahootservidor.dao.RespostaDao;
import br.com.kahootservidor.dao.UsuarioDao;
import br.com.kahootservidor.daoimpl.AssuntoDaoImpl;
import br.com.kahootservidor.daoimpl.DisciplinaDaoImpl;
import br.com.kahootservidor.daoimpl.PerguntaDaoImpl;
import br.com.kahootservidor.daoimpl.RespostaDaoImpl;
import br.com.kahootservidor.daoimpl.UsuarioDaoImpl;
import br.com.kahootservidor.entidade.Assunto;
import br.com.kahootservidor.entidade.Disciplina;
import br.com.kahootservidor.entidade.Pergunta;
import br.com.kahootservidor.entidade.Resposta;
import br.com.kahootservidor.entidade.Usuario;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public static boolean enviandoPerguntaViaSocket() throws Exception {
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
    public static boolean enviandoUsuarioViaSocket() throws Exception {
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
