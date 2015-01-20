package br.com.issuenet.model;


public class TarefaStateCancelada implements ITarefaState {

	@Override
	public String resolverTarefa(Tarefa t) {
		return "Tarefa foi cancelada.";		
	}

	@Override
	public String expirarTarefa(Tarefa t) {
		return "Tarefa foi cancelada.";		
	}

	@Override
	public String avaliarTarefa(Tarefa t) {
		return "Tarefa foi cancelada.";
	}

	@Override
	public String finalizarTarefa(Tarefa t) {
		return "Tarefa foi cancelada";		
	}

	@Override
	public String cancelarTarefa(Tarefa t) {
		return "Tarefa já está cancelada.";
	}

	@Override
	public String reabrirTarefa(Tarefa t) {
		t.setStatusAtual(t.getStatusAberta());;
		return "Tarefa aberta.";
		
	}

	@Override
	public String calcularNotas(Tarefa t) {
		return "Tarefa foi cancelada";
	}

	@Override
	public String getStatusString() {
		return "Cancelada";
	}

}
