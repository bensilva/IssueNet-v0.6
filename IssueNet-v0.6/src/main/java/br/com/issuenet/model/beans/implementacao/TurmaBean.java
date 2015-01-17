package br.com.issuenet.model.beans.implementacao;

import java.io.Serializable;

public class TurmaBean implements Serializable 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int codTurma;
	private String turma;
	/**/
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/*Métodos de acesso*/
	public int getCodTurma() {
		return codTurma;
	}
	public void setCodTurma(int codTurma) {
		this.codTurma = codTurma;
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
}
