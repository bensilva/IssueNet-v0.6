package br.com.issuenet.model;


public class TarefaStateCancelada implements ITarefaState {

	public String resolverTarefa(Tarefa t) {
		return "Tarefa foi cancelada.";		
	}

	public String expirarTarefa(Tarefa t) {
		return "Tarefa foi cancelada.";		
	}

	public String avaliarTarefa(Tarefa t) {
		return "Tarefa foi cancelada.";
	}

	public String finalizarTarefa(Tarefa t) {
		return "Tarefa foi cancelada";		
	}

	public String cancelarTarefa(Tarefa t) {
		return "Tarefa já está cancelada.";
	}

	public String reabrirTarefa(Tarefa t) {
		t.setStatusAtual(t.getStatusAberta());;
		return "Tarefa aberta.";
		
	}

	public String calcularNotas(Tarefa t) {
		return "Tarefa foi cancelada";
	}

	public String getStatusString() {
		return "Cancelada";
	}

}
