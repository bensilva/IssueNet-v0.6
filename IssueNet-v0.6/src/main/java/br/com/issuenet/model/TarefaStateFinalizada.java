package br.com.issuenet.model;

public class TarefaStateFinalizada implements ITarefaState {

	public String resolverTarefa(Tarefa t) {
		return "Tarefa já está finalizada.";
	}

	public String expirarTarefa(Tarefa t) {
		return "Tarefa já está finalizada.";
	}

	public String avaliarTarefa(Tarefa t) {
		return "Tarefa já está finalizada.";
	}

	public String finalizarTarefa(Tarefa t) {
		return "Tarefa já está finalizada.";
	}

	public String cancelarTarefa(Tarefa t) {
		return "Tarefa já está finalizada.";
	}

	public String reabrirTarefa(Tarefa t) {
		return "Tarefa já está finalizada.";
	}

	public String calcularNotas(Tarefa t) {
		return "Notas calculadas.";
	}

	public String getStatusString() {
		return "Finalizada";
	}

}
