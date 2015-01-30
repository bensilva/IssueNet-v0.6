package br.com.issuenet.model.beans.implementacao;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name="usuario_tarefa")
@Table(name="usuario_tarefa", schema="puc")
public class UsuarioTarefaBean implements Serializable
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
	@JoinColumn(name="id_usuario_fk")
	private UsuarioBean usuarioBean;
	
	@Id
	@ManyToOne
	@JoinColumn(name="id_tarefa_fk")
	private TarefaBean tarefaBean;
	/**/
	
	
	public UsuarioBean getUsuarioBean() {
		return usuarioBean;
	}

	public void setUsuarioBean(UsuarioBean usuarioBean) {
		this.usuarioBean = usuarioBean;
	}

	public TarefaBean getTarefaBean() {
		return tarefaBean;
	}

	public void setTarefaBean(TarefaBean tarefaBean) {
		this.tarefaBean = tarefaBean;
	}
}
