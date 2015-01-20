package br.com.issuenet.model;

public class TarefaStateEmAvaliacao implements ITarefaState {

	@Override
	public String resolverTarefa(Tarefa t) {
		return "Tarefa j� foi resolvida.";
	}

	@Override
	public String expirarTarefa(Tarefa t) {
		return "Tarefa j� foi resolvida.";
	}

	@Override
	public String avaliarTarefa(Tarefa t) {
		t.setStatusAtual(t.getStatusAvaliada());
		return "Tarefa avaliada.";
	}

	@Override
	public String finalizarTarefa(Tarefa t) {
		return "Tarefa n�o foi avaliada.";
	}

	@Override
	public String cancelarTarefa(Tarefa t) {
		t.setStatusAtual(t.getStatusCancelada());
		return "Tarefa cancelada.";
	}

	@Override
	public String reabrirTarefa(Tarefa t) {
		return "Tarefa j� est� aberta.";
	}

	@Override
	public String calcularNotas(Tarefa t) {
		return "Tarefa n�o foi finalizada.";
	}

	@Override
	public String getStatusString() {
		return "EmAvaliacao";
	}

}
