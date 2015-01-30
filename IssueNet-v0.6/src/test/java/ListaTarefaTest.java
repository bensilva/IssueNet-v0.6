import java.util.List;

import br.com.issuenet.model.*;



public class ListaTarefaTest {

	public static void main(String[] args) {		
		Usuario usuario = Manager.recuperarUsuario("benalves@gmail.com", "123");
		
		List<Tarefa> tarefas = usuario.getComportamentoGerenciador().listaTarefasEmResolucao(usuario);
		
		for(Tarefa t : tarefas){
			System.out.println(t.getIdTarefa()+ " - " +t.getNomeTarefa() + " - " + t.getDescricao());
		}

	}

}
