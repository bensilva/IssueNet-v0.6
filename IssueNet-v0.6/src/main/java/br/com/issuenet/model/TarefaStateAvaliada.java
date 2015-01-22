package br.com.issuenet.model;

public class TarefaStateAvaliada implements ITarefaState {

	public String resolverTarefa(Tarefa t) {
		return "Tarefa j� foi resolvida.";		
	}

	public String expirarTarefa(Tarefa t) {
		return "Tarefa j� foi avaliada.";		
	}

	public String avaliarTarefa(Tarefa t) {
		return "Tarefa j� foi avaliada.";
	}

	public String finalizarTarefa(Tarefa t) {
		t.setStatusAtual(t.getStatusFinalizada());
		return "Tarefa finalizada.";		
	}

	public String cancelarTarefa(Tarefa t) {
		t.setStatusAtual(new TarefaStateCancelada());
		return "Tarefa cancelada.";
	}

	public String reabrirTarefa(Tarefa t) {
		return "Tarefa j� foi avaliada.";
		
	}

	public String calcularNotas(Tarefa t) {
		return "Tarefa n�o foi finalizada.";
	}

	public String getStatusString() {
		return "Avaliada";
	}

}
