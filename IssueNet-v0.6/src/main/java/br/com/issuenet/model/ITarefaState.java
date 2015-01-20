package br.com.issuenet.model;

public interface ITarefaState {
	public String getStatusString();
	public String resolverTarefa(Tarefa t);
	public String expirarTarefa(Tarefa t);
	public String avaliarTarefa(Tarefa t);
	public String finalizarTarefa(Tarefa t);
	public String cancelarTarefa(Tarefa t);
	public String reabrirTarefa(Tarefa t);
	public String calcularNotas(Tarefa t);
}
