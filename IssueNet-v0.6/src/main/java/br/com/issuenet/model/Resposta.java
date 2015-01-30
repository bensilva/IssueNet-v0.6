package br.com.issuenet.model;

import br.com.issuenet.model.beans.implementacao.RespostaBean;


public class Resposta {
	

	private RespostaBean respostaBean;
	private UsuarioAvaliacao usuarioAvaliacao;
	private Questao questao;
	private double nota;
	private String observacoes;
	
	public Resposta(RespostaBean respostaBean){
		this.respostaBean = respostaBean;
		this.usuarioAvaliacao = new UsuarioAvaliacao(respostaBean.getUsuarioAvaliacao());
		this.questao = new Questao(respostaBean.getQuestao());		
		this.nota = respostaBean.getNota();
		this.observacoes = respostaBean.getObservacoes();
	}


	public UsuarioAvaliacao getUsuarioAvaliacao() {
		return usuarioAvaliacao;
	}
	public void setUsuarioAvaliacao(UsuarioAvaliacao usuarioAvaliacao) {
		this.usuarioAvaliacao = usuarioAvaliacao;
	}
	public Questao getQuestao() {
		return questao;
	}
	public void setQuestao(Questao questao) {
		this.questao = questao;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	public RespostaBean getRespostaBean() {
		return respostaBean;
	}	
}
