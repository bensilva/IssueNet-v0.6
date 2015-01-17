package br.com.issuenet.model.beans.implementacao;

import java.io.Serializable;

public class QuestaoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**/
	private String nomeQuestao;
	private String descricao;
	private double peso;
	private ModeloCriterioAvaliacaoBean modeloCriterioAvaliacaoBean;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/*Métodos de acesso*/
	public String getNomeQuestao() {
		return nomeQuestao;
	}

	public void setNomeQuestao(String nomeQuestao) {
		this.nomeQuestao = nomeQuestao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public ModeloCriterioAvaliacaoBean getModeloCriterioAvaliacaoBean() {
		return modeloCriterioAvaliacaoBean;
	}

	public void setModeloCriterioAvaliacaoBean(
			ModeloCriterioAvaliacaoBean modeloCriterioAvaliacaoBean) {
		this.modeloCriterioAvaliacaoBean = modeloCriterioAvaliacaoBean;
	}
}
