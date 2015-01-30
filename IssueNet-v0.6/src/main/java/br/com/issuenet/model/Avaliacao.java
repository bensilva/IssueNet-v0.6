package br.com.issuenet.model;

import br.com.issuenet.model.beans.implementacao.AvaliacaoBean;

public class Avaliacao {

	private AvaliacaoBean avaliacaoBean;
	private int idAvaliacao;
	private Tarefa tarefa;
	
	public Avaliacao(){};
	
	public Avaliacao(AvaliacaoBean avaliacaoBean){
		this.avaliacaoBean = avaliacaoBean;
		this.idAvaliacao = avaliacaoBean.getIdAvaliacao();
		this.tarefa = new Tarefa(avaliacaoBean.getTarefaBean());
	}
	
	public int getIdAvaliacao() {
		return idAvaliacao;
	}
	public void setIdAvaliacao(int idAvaliacao) {
		this.idAvaliacao = idAvaliacao;
		this.avaliacaoBean.setIdAvaliacao(idAvaliacao);
	}
	public Tarefa getTarefa() {
		return tarefa;
	}
	public void setTarefa(Tarefa tarefa) {
		this.tarefa = tarefa;
		this.avaliacaoBean.setTarefa(tarefa.getTarefaBean());
	}
	public AvaliacaoBean getAvaliacaoBean() {
		return avaliacaoBean;
	}
	
}
