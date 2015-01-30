package br.com.issuenet.model;

import java.util.ArrayList;

import br.com.issuenet.model.beans.implementacao.TurmaBean;

public class Turma {

	private TurmaBean turmaBean;
	private int idTurma;
	private String codTurma;
	private Usuario tutor;
	private ArrayList<Usuario> usuarios; //Alunos da turma.
	
	public Turma(){};
	
	public Turma(TurmaBean turmaBean){
		this.turmaBean = turmaBean;
		this.idTurma = turmaBean.getIdTurma();
		this.codTurma = turmaBean.getCodTurma();
		this.tutor = new Usuario(turmaBean.getTutor());
		this.usuarios = Manager.listaTurmaUsuarios(turmaBean);				
	}
	
	public int getIdTurma() {
		return idTurma;
	}
	public void setIdTurma(int idTurma) {
		this.idTurma = idTurma;
	}
	public String getCodTurma() {
		return codTurma;
	}
	public void setCodTurma(String codTurma) {
		this.codTurma = codTurma;
	}
	public Usuario getTutor() {
		return tutor;
	}
	public void setTutor(Usuario tutor) {
		this.tutor = tutor;
	}
	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	public TurmaBean getTurmaBean() {
		return turmaBean;
	}
}
