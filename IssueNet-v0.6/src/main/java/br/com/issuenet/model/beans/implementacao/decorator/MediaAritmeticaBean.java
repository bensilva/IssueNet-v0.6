package br.com.issuenet.model.beans.implementacao.decorator;

import java.io.Serializable;

public class MediaAritmeticaBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	private int idMediaAritmetica;
	private String descricao;
	
	/*Mètodos de acesso*/
	public int getIdMediaAritmetica() {
		return idMediaAritmetica;
	}
	public void setIdMediaAritmetica(int idMediaAritmetica) {
		this.idMediaAritmetica = idMediaAritmetica;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

}
