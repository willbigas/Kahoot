package br.com.kahootservidor.dao;

import br.com.kahootservidor.entidade.Pergunta;
import br.com.kahootservidor.entidade.Resposta;
import java.util.List;

/**
 *
 * @author Alunos
 */
public interface RespostaDao extends BaseDao {

    public List<Resposta> pesquisaRespostaPerguntas(Pergunta pergunta) throws Exception;

    public boolean excluirRespostasPergunta(Integer id) throws Exception;

}
