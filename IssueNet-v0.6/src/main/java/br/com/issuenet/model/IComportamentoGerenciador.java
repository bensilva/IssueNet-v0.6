package br.com.issuenet.model;

import br.com.issuenet.model.beans.implementacao.TarefaBean;
import br.com.issuenet.model.beans.implementacao.UsuarioBean;

public interface IComportamentoGerenciador {
	
	public String getComportamento();
	
	public Tarefa criarTarefa(TarefaBean t, UsuarioBean u);
}
