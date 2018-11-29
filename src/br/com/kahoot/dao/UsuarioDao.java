package br.com.kahoot.dao;

import java.util.List;

/**
 *
 * @author William
 */
public interface UsuarioDao extends BaseDao {

    public List<Object> pesquisarTodosOrdenadoPorNome() throws Exception;
}
