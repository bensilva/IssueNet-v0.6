package br.com.issuenet.model.beans.implementacao;

import java.io.Serializable;

public class ModeloCriterioAvaliacaoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**/
	private int idModeloCriterioAvaliacao;
	private String nome;
	private String descricao;
	private double peso;

	/**/
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/* Métodos de acesso */
	public int getIdModeloCriterioAvaliacao() {
		return idModeloCriterioAvaliacao;
	}

	public void setIdModeloCriterioAvaliacao(int idModeloCriterioAvaliacao) {
		this.idModeloCriterioAvaliacao = idModeloCriterioAvaliacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
}
