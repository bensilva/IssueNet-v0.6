package br.com.issuenet.model;

public class PodeResolverTarefa implements IComportamentoResolvedor {

	private String comportamento = "PodeResolverTarefa";

	public String getComportamento() {
		return this.comportamento;
	}

	@Override
	public void resolverTarefa(Tarefa t) {
		Manager.atualizarTarefa(t);		
	}	

}
