package br.com.issuenet.model.beans.implementacao.decorator;

import java.io.Serializable;

public class MediaPonderadaBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**/
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	private int idMediaPonderada;
	private String descricao;
	private String formaCalculo;
	/*Métodos de acesso*/
	public int getIdMediaPonderada() {
		return idMediaPonderada;
	}
	public void setIdMediaPonderada(int idMediaPonderada) {
		this.idMediaPonderada = idMediaPonderada;
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
