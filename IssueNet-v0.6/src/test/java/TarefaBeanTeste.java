import java.io.Serializable;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import br.com.issuenet.model.beans.implementacao.ProfessorBean;
import br.com.issuenet.model.beans.implementacao.TarefaBean;
import br.com.issuenet.model.beans.implementacao.UsuarioBean;
import br.com.issuenet.model.dao.util.GenericDAO;
import br.com.issuenet.model.dao.util.HibernateUtil;


public class TarefaBeanTeste {

	public static void main(String[] args) {
		
		UsuarioBean tutor = new ProfessorBean();
		
		tutor.setIdUsuario(1);
		
		
		TarefaBean tarefa = new TarefaBean();
		
		tarefa.setNomeTarefa("Nome da Tarefa");
		tarefa.setDescricao("Descrição da tarefa");
		tarefa.setMateria("Nome da matéria");
		tarefa.setTutor(tutor);
		tarefa.setDataCriacao(new Date());
		tarefa.setDataLimiteResolucao(new Date());
		tarefa.setDataResolvida(new Date());
		tarefa.setDataInicioAvaliacao(new Date());
		tarefa.setDataLimiteAvaliacao(new Date());
		tarefa.setStatus("Aberta");
		tarefa.setNotaFinal(9.4);
		
		
		Serializable s = tarefa;
		
		GenericDAO.genericSave(s);
		
		System.out.println("Tarefa criada com sucesso!");

	}



}
