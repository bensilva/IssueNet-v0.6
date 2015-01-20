package br.com.issuenet.model;

public class TarefaStateAberta implements ITarefaState {

	@Override
	public String resolverTarefa(Tarefa t) {
		t.setStatusAtual(t.getStatusEmAvaliacao());
		return "Tarefa resolvida.";		
	}

	@Override
	public String expirarTarefa(Tarefa t) {
		t.setStatusAtual(t.getStatusExpirada());
		return "Tarefa expirada.";		
	}

	@Override
	public String avaliarTarefa(Tarefa t) {
		return "Tarefa não foi resolvida.";		
	}

	@Override
	public String finalizarTarefa(Tarefa t) {
		return "Tarefa não foi resolvida.";		
	}

	@Override
	public String cancelarTarefa(Tarefa t) {
		t.setStatusAtual(t.getStatusCancelada());
		return "Tarefa cancelada.";
	}

	@Override
	public String reabrirTarefa(Tarefa t) {
		return "Tarefa já está aberta.";
		
	}

	@Override
	public String calcularNotas(Tarefa t) {
		return "Tarefa não foi finalizada.";
	}

	@Override
	public String getStatusString() {
		return "Aberta";
	}

}
