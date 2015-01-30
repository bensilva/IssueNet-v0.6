import br.com.issuenet.model.beans.implementacao.AvaliacaoBean;
import br.com.issuenet.model.beans.implementacao.QuestionarioAvaliacaoBean;
import br.com.issuenet.model.beans.implementacao.QuestionarioBean;
import br.com.issuenet.model.beans.implementacao.TarefaBean;
import br.com.issuenet.model.dao.util.GenericDAO;


public class CriaAvaliacaoTest {

	public static void main(String[] args) {
		
		TarefaBean tarefaBean = new TarefaBean();
		AvaliacaoBean avaliacaoBean = new AvaliacaoBean();
		QuestionarioAvaliacaoBean questionarioAvaliacaoBean = new QuestionarioAvaliacaoBean();
		QuestionarioBean questionarioBean = new QuestionarioBean();
		
		tarefaBean.setIdTarefa(2);		
		
		avaliacaoBean.setTarefa(tarefaBean);
		questionarioBean.setIdQuestionario(1);
		
		questionarioAvaliacaoBean.setAvaliacao(avaliacaoBean);
		questionarioAvaliacaoBean.setQuestionarioBean(questionarioBean);
		
		GenericDAO.genericSave(questionarioAvaliacaoBean);
		
		System.out.println("Questionario avaliação criado com sucesso.");

	}

}
