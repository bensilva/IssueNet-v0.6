package br.com.issuenet.model.beans.implementacao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="turma")
@Table(name="turma", schema="puc")
public class TurmaBean implements Serializable 
{
	private static final long serialVersionUID = 1L;
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	 * 
	 */

	/**/
	@Id
	@GeneratedValue
	@Column(name="id_turma")
	private int idTurma;
	
	@Column(name="cod_turma")
	private String codTurma;
	
	@Column(name="tutor")
	private UsuarioBean tutor;
	/**/
	
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
	public UsuarioBean getTutor() {
		return tutor;
	}
	public void setTutor(UsuarioBean tutor) {
		this.tutor = tutor;
	}	
}
