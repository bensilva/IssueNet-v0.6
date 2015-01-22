package br.com.issuenet.model;

public class TarefaStateAberta implements ITarefaState {

	public String resolverTarefa(Tarefa t) {
		t.setStatusAtual(t.getStatusEmAvaliacao());
		return "Tarefa resolvida.";		
	}

	public String expirarTarefa(Tarefa t) {
		t.setStatusAtual(t.getStatusExpirada());
		return "Tarefa expirada.";		
	}

	public String avaliarTarefa(Tarefa t) {
		return "Tarefa n�o foi resolvida.";		
	}

	public String finalizarTarefa(Tarefa t) {
		return "Tarefa n�o foi resolvida.";		
	}

	public String cancelarTarefa(Tarefa t) {
		t.setStatusAtual(t.getStatusCancelada());
		return "Tarefa cancelada.";
	}

	public String reabrirTarefa(Tarefa t) {
		return "Tarefa j� est� aberta.";
		
	}

	public String calcularNotas(Tarefa t) {
		return "Tarefa n�o foi finalizada.";
	}

	public String getStatusString() {
		return "Aberta";
	}

}
