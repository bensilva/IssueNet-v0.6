package br.com.issuenet.model;

public class TarefaStateAvaliada implements ITarefaState {

	@Override
	public String resolverTarefa(Tarefa t) {
		return "Tarefa j� foi resolvida.";		
	}

	@Override
	public String expirarTarefa(Tarefa t) {
		return "Tarefa j� foi avaliada.";		
	}

	@Override
	public String avaliarTarefa(Tarefa t) {
		return "Tarefa j� foi avaliada.";
	}

	@Override
	public String finalizarTarefa(Tarefa t) {
		t.setStatusAtual(t.getStatusFinalizada());
		return "Tarefa finalizada.";		
	}

	@Override
	public String cancelarTarefa(Tarefa t) {
		t.setStatusAtual(new TarefaStateCancelada());
		return "Tarefa cancelada.";
	}

	@Override
	public String reabrirTarefa(Tarefa t) {
		return "Tarefa j� foi avaliada.";
		
	}

	@Override
	public String calcularNotas(Tarefa t) {
		return "Tarefa n�o foi finalizada.";
	}

	@Override
	public String getStatusString() {
		return "Avaliada";
	}

}
