import java.io.Serializable;
import java.util.Date;

import br.com.issuenet.model.beans.implementacao.CriterioAvaliacaoBean;
import br.com.issuenet.model.beans.implementacao.TarefaBean;
import br.com.issuenet.model.beans.implementacao.UsuarioBean;
import br.com.issuenet.model.dao.util.GenericDAO;


public class TarefaBeanTeste {

	public static void main(String[] args) {
		
		UsuarioBean tutor = new UsuarioBean();
		CriterioAvaliacaoBean criterioAvaliacao = new CriterioAvaliacaoBean();
		
		tutor.setIdUsuario(1);
		criterioAvaliacao.setIdCriterioAvaliacao(1);
		criterioAvaliacao.setResponsavel(tutor);
		
		
		TarefaBean tarefa = new TarefaBean();
		
		tarefa.setNomeTarefa("Nome da Tarefa2");
		tarefa.setDescricao("Descrição da tarefa2");
		tarefa.setMateria("Nome da matéria");
		tarefa.setTutor(tutor);
		tarefa.setDataCriacao(new Date());
		tarefa.setDataLimiteResolucao(new Date());
		//tarefa.setDataResolvida(new Date());
		tarefa.setDataInicioAvaliacao(new Date());
		tarefa.setDataLimiteAvaliacao(new Date());
		tarefa.setStatus("Aberta");
		//tarefa.setNotaFinal(9.4);
		//tarefa.setCriterioAvaliacao(null);
		
		Serializable s = tarefa;
		
		GenericDAO.genericSave(s);
		
		System.out.println("Tarefa criada com sucesso!");

	}



}
