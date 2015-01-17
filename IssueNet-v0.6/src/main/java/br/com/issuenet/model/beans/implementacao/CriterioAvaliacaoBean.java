package br.com.issuenet.model.beans.implementacao;

import java.io.Serializable;

public class CriterioAvaliacaoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idCriterioAvaliacao;
	private String descricao;
	private String formaCalculo;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/*Mètodos de acesso*/
	public int getIdCriterioAvaliacao() {
		return idCriterioAvaliacao;
	}
	public void setIdCriterioAvaliacao(int idCriterioAvaliacao) {
		this.idCriterioAvaliacao = idCriterioAvaliacao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getFormaCalculo() {
		return formaCalculo;
	}
	public void setFormaCalculo(String formaCalculo) {
		this.formaCalculo = formaCalculo;
	}
}