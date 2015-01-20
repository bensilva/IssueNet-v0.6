package br.com.issuenet.model;

public class TarefaStateFinalizada implements ITarefaState {

	@Override
	public String resolverTarefa(Tarefa t) {
		return "Tarefa já está finalizada.";
	}

	@Override
	public String expirarTarefa(Tarefa t) {
		return "Tarefa já está finalizada.";
	}

	@Override
	public String avaliarTarefa(Tarefa t) {
		return "Tarefa já está finalizada.";
	}

	@Override
	public String finalizarTarefa(Tarefa t) {
		return "Tarefa já está finalizada.";
	}

	@Override
	public String cancelarTarefa(Tarefa t) {
		return "Tarefa já está finalizada.";
	}

	@Override
	public String reabrirTarefa(Tarefa t) {
		return "Tarefa já está finalizada.";
	}

	@Override
	public String calcularNotas(Tarefa t) {
		return "Notas calculadas.";
	}

	@Override
	public String getStatusString() {
		return "Finalizada";
	}

}
