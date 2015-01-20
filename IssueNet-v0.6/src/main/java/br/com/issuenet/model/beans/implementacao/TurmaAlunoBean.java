package br.com.issuenet.model.beans.implementacao;

import java.io.Serializable;

public class TurmaAlunoBean implements Serializable 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idTurmaAluno;
	private TurmaBean turma;
	private UsuarioBean aluno;
	/**/
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/*Métodos de acesso*/
	public int getIdTurmaAluno() {
		return idTurmaAluno;
	}
	public void setIdTurmaAluno(int idTurmaAluno) {
		this.idTurmaAluno = idTurmaAluno;
	}
	public TurmaBean getTurma() {
		return turma;
	}
	public void setTurma(TurmaBean turma) {
		this.turma = turma;
	}
	public UsuarioBean getAluno() {
		return aluno;
	}
	public void setAluno(UsuarioBean aluno) {
		this.aluno = aluno;
	}
}
