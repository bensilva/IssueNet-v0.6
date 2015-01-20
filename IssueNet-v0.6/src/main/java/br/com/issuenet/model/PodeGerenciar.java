package br.com.issuenet.model;

import br.com.issuenet.model.beans.implementacao.TarefaBean;
import br.com.issuenet.model.beans.implementacao.UsuarioBean;

public class PodeGerenciar implements IComportamentoGerenciador {

	private String comportamento = "PodeGerenciar";
	
	@Override
	public Tarefa criarTarefa(TarefaBean t, UsuarioBean u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getComportamento() {
		return this.comportamento;
	}	

}
