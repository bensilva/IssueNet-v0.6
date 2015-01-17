package br.com.issuenet.model.beans.implementacao;

import java.io.Serializable;

public class UsuarioAvaliacaoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*Como chave primaria dessa tabela devem ser usandos em conjunto 
	 * os atributos identificadosres dos objetos UsuarioBean e AvaliacaoTarefaBean*/
	private UsuarioBean usuario;
	/**/
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/*Métodos de acesso*/
	public UsuarioBean getUsuario() {
		return usuario;
	}
	public void setUsuario(UsuarioBean usuario) {
		this.usuario = usuario;
	}
	public AvaliacaoTarefaBean getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(AvaliacaoTarefaBean avaliacao) {
		this.avaliacao = avaliacao;
	}
	private AvaliacaoTarefaBean avaliacao;
}
