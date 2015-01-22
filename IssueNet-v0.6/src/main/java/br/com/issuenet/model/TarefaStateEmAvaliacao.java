package br.com.issuenet.model;

public class TarefaStateEmAvaliacao implements ITarefaState {

	public String resolverTarefa(Tarefa t) {
		return "Tarefa já foi resolvida.";
	}

	public String expirarTarefa(Tarefa t) {
		return "Tarefa já foi resolvida.";
	}

	public String avaliarTarefa(Tarefa t) {
		t.setStatusAtual(t.getStatusAvaliada());
		return "Tarefa avaliada.";
	}

	public String finalizarTarefa(Tarefa t) {
		return "Tarefa não foi avaliada.";
	}

	public String cancelarTarefa(Tarefa t) {
		t.setStatusAtual(t.getStatusCancelada());
		return "Tarefa cancelada.";
	}

	public String reabrirTarefa(Tarefa t) {
		return "Tarefa já está aberta.";
	}

	public String calcularNotas(Tarefa t) {
		return "Tarefa não foi finalizada.";
	}

	public String getStatusString() {
		return "EmAvaliacao";
	}

}
