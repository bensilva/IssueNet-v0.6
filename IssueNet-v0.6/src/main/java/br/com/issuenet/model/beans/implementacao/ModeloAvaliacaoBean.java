package br.com.issuenet.model.beans.implementacao;

import java.io.Serializable;

public class ModeloAvaliacaoBean implements Serializable 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idModeloAvaliacao;
	private AvaliacaoTarefaBean avaliacaoTarefa;
	private ModeloCriterioAvaliacaoBean modeloCriterioAvaliacao;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/*Métodos de acesso*/
	public int getIdModeloAvaliacao() {
		return idModeloAvaliacao;
	}

	public void setIdModeloAvaliacao(int idModeloAvaliacao) {
		this.idModeloAvaliacao = idModeloAvaliacao;
	}

	public AvaliacaoTarefaBean getAvaliacaoTarefa() {
		return avaliacaoTarefa;
	}

	public void setAvaliacaoTarefa(AvaliacaoTarefaBean avaliacaoTarefa) {
		this.avaliacaoTarefa= avaliacaoTarefa;
	}
	public ModeloCriterioAvaliacaoBean getModeloCriterioAvaliacao() {
		return modeloCriterioAvaliacao;
	}
	public void setModeloCriterioAvaliacao(ModeloCriterioAvaliacaoBean modeloCriterioAvaliacao) {
		this.modeloCriterioAvaliacao = modeloCriterioAvaliacao;
	}

}
