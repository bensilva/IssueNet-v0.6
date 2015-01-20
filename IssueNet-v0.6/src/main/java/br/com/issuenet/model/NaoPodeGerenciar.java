package br.com.issuenet.model;

import br.com.issuenet.model.beans.implementacao.TarefaBean;
import br.com.issuenet.model.beans.implementacao.UsuarioBean;

public class NaoPodeGerenciar implements IComportamentoGerenciador {

	private String comportamento = "NaoPodeGerenciar";
	
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
