package br.com.issuenet.model;

public class NaoPodeResolverTarefa implements IComportamentoResolvedor {

	private String comportamento = "NaoPodeResolverTarefa";

	public String getComportamento() {
		return this.comportamento;
	}

	@Override
	public void resolverTarefa(Tarefa t) {
		// Faz nada...		
	}	

}
