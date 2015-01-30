package br.com.issuenet.model.beans.implementacao;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name="turma_usuario")
@Table(name="turma_usuario", schema="puc")
public class TurmaUsuarioBean implements Serializable
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
	@ManyToOne
	@JoinColumn(name="id_turma_fk")
	private TurmaBean turma;
	
	@Id
	@ManyToOne
	@JoinColumn(name="id_usuario_fk")
	private UsuarioBean usuarioBean;
	/**/
	
	
	public TurmaBean getTurma() {
		return turma;
	}

	public void setTurma(TurmaBean turma) {
		this.turma = turma;
	}

	public UsuarioBean getUsuarioBean() {
		return usuarioBean;
	}

	public void setUsuarioBean(UsuarioBean usuarioBean) {
		this.usuarioBean = usuarioBean;
	}
}
