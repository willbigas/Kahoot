/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.principal;

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
import br.com.kahoot.entidade.Assunto;
import br.com.kahoot.entidade.Disciplina;
import br.com.kahoot.entidade.Pergunta;
import br.com.kahoot.entidade.Resposta;
import br.com.kahoot.entidade.Usuario;
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

    public static List<Object> pegandoDadosDoBanco() throws Exception {
        List<Disciplina> disciplinas = (List<Disciplina>) (Object) DISCIPLINA_DAO.pesquisarTodos();
        List<Assunto> assuntos = (List<Assunto>) (Object) ASSUNTO_DAO.pesquisarTodos();
        List<Pergunta> perguntas = (List<Pergunta>) (Object) PERGUNTA_DAO.pesquisarTodos();
        List<Resposta> respostas = (List<Resposta>) (Object) RESPOSTA_DAO.pesquisarTodos();
        List<Usuario> usuarios = (List<Usuario>) (Object) USUARIO_DAO.pesquisarTodos();
        List<Object> TODOS_OS_DADOS = new ArrayList<>();
        TODOS_OS_DADOS.add(disciplinas);
        TODOS_OS_DADOS.add(assuntos);
        TODOS_OS_DADOS.add(perguntas);
        TODOS_OS_DADOS.add(respostas);
        TODOS_OS_DADOS.add(usuarios);
        return TODOS_OS_DADOS;
    }

}
