package br.com.issuenet.model;

import java.util.Date;

import br.com.issuenet.model.beans.implementacao.UsuarioAvaliacaoBean;

public class UsuarioAvaliacao {

	private UsuarioAvaliacaoBean usuarioAvaliacaoBean;
	private Usuario usuario;
	private Avaliacao avaliacao;
	private Date dataAvaliada;

	
	public UsuarioAvaliacao(UsuarioAvaliacaoBean usuarioAvaliacaoBean){
		this.usuarioAvaliacaoBean = usuarioAvaliacaoBean;
		this.usuario = new Usuario(usuarioAvaliacaoBean.getUsuarioBean());
		this.avaliacao = new Avaliacao(usuarioAvaliacaoBean.getAvaliacaoBean());
		this.dataAvaliada = usuarioAvaliacaoBean.getDataAvaliada();
	}
	
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Avaliacao getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}
	public Date getDataAvaliada() {
		return dataAvaliada;
	}
	public void setDataAvaliada(Date dataAvaliada) {
		this.dataAvaliada = dataAvaliada;
	}
	public UsuarioAvaliacaoBean getUsuarioAvaliacaoBean() {
		return usuarioAvaliacaoBean;
	}
}
