package br.com.issuenet.model.beans.implementacao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name="avaliacao")
@Table(name="avaliacao", schema="puc")
public class AvaliacaoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	 * 
	 */

	/**
	 * Atributos da classe
	 * */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_avaliacao", insertable=true, nullable=false, updatable=false)
	private int idAvaliacao;
	
	@ManyToOne
	@JoinColumn(name="id_tarefa")
	private TarefaBean tarefaBean;

	/**
	 * Métodos de acesso
	 * */

	public int getIdAvaliacao() {
		return idAvaliacao;
	}
	public void setIdAvaliacao(int idAvaliacao) {
		this.idAvaliacao = idAvaliacao;
	}
	public TarefaBean getTarefaBean() {
		return tarefaBean;
	}
	public void setTarefa(TarefaBean tarefaBean) {
		this.tarefaBean = tarefaBean;
	}

}
