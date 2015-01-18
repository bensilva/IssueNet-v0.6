package br.com.issuenet.model.beans.implementacao;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name="convidado")
@Table(name="convidado", schema="puc")
public class ConvidadoBean implements Serializable 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public ConvidadoBean() {
		super();
//		this.perfil = "Convidado";
	}
}
