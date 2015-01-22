package br.com.issuenet.model;

import br.com.issuenet.model.beans.implementacao.TarefaBean;
import br.com.issuenet.model.beans.implementacao.UsuarioBean;

public class NaoPodeGerenciar implements IComportamentoGerenciador {

	private String comportamento = "NaoPodeGerenciar";
	
	public Tarefa criarTarefa(TarefaBean t, UsuarioBean u) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getComportamento() {
		return this.comportamento;
	}	

}
