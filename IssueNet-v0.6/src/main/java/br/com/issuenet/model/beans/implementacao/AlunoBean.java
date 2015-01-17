package br.com.issuenet.model.beans.implementacao;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name="aluno")
@Table(name="aluno", schema="puc")
public class AlunoBean extends UsuarioBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public AlunoBean()
	{
		super();
		this.perfil="Aluno";
	}
}
