package br.com.issuenet.model;

public class TarefaStateExpirada implements ITarefaState {

	public String resolverTarefa(Tarefa t) {
		return "Tarefa está expirada.";
	}

	public String expirarTarefa(Tarefa t) {
		return "Tarefa já está expirada.";
	}

	public String avaliarTarefa(Tarefa t) {
		return "Tarefa está expirada.";
	}

	public String finalizarTarefa(Tarefa t) {
		return "Tarefa está expirada.";
	}

	public String cancelarTarefa(Tarefa t) {
		t.setStatusAtual(t.getStatusCancelada());
		return "Tarefa cancelada.";
	}

	public String reabrirTarefa(Tarefa t) {
		t.setStatusAtual(t.getStatusAberta());
		return "Tarefa aberta.";
	}

	public String calcularNotas(Tarefa t) {
		return "Tarefa está expirada.";
	}

	public String getStatusString() {
		return "Expirada";
	}

}
