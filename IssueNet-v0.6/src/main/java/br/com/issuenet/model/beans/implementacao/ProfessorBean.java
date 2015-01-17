package br.com.issuenet.model.beans.implementacao;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name="professor")
@Table(name="professor",schema="puc")
public class ProfessorBean extends UsuarioBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public ProfessorBean() {
		super();
		this.perfil = "Professor";
	}

}
