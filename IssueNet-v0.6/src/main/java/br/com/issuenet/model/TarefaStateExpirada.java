package br.com.issuenet.model;

public class TarefaStateExpirada implements ITarefaState {

	@Override
	public String resolverTarefa(Tarefa t) {
		return "Tarefa está expirada.";
	}

	@Override
	public String expirarTarefa(Tarefa t) {
		return "Tarefa já está expirada.";
	}

	@Override
	public String avaliarTarefa(Tarefa t) {
		return "Tarefa está expirada.";
	}

	@Override
	public String finalizarTarefa(Tarefa t) {
		return "Tarefa está expirada.";
	}

	@Override
	public String cancelarTarefa(Tarefa t) {
		t.setStatusAtual(t.getStatusCancelada());
		return "Tarefa cancelada.";
	}

	@Override
	public String reabrirTarefa(Tarefa t) {
		t.setStatusAtual(t.getStatusAberta());
		return "Tarefa aberta.";
	}

	@Override
	public String calcularNotas(Tarefa t) {
		return "Tarefa está expirada.";
	}

	@Override
	public String getStatusString() {
		return "Expirada";
	}

}
