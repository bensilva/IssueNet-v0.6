package br.com.issuenet.model.beans.implementacao;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="usuario_avaliacao")
@Table(name="usuario_avaliacao", schema="puc")
public class UsuarioAvaliacaoBean implements Serializable {
	private static final long serialVersionUID = 1L;
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	 * 
	 */

	@Id
	@ManyToOne
	@JoinColumn(name="id_usuario_fk")
	private UsuarioBean usuario;
	
	@Id
	@ManyToOne
	@JoinColumn(name="id_avaliacao_fk")
	private AvaliacaoBean avaliacao;
	
	@Column(name="data_avaliada")
	@Temporal(TemporalType.DATE)
	private Date dataAvaliada;	
	
	
	public UsuarioBean getUsuarioBean() {
		return usuario;
	}
	public void setUsuarioBean(UsuarioBean usuario) {
		this.usuario = usuario;
	}
	public AvaliacaoBean getAvaliacaoBean() {
		return avaliacao;
	}
	public void setAvaliacaoBean(AvaliacaoBean avaliacao) {
		this.avaliacao = avaliacao;
	}
	public Date getDataAvaliada() {
		return dataAvaliada;
	}
	public void setDataAvaliada(Date dataAvaliada) {
		this.dataAvaliada = dataAvaliada;
	}

	
}
