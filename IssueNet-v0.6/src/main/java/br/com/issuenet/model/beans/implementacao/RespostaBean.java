package br.com.issuenet.model.beans.implementacao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

public class RespostaBean implements Serializable {
	private static final long serialVersionUID = 1L;
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	@Id
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="id_usuario", referencedColumnName="id_usuario"),
		@JoinColumn(name="id_avaliacao", referencedColumnName="id_avaliacao")	
	})
	private UsuarioAvaliacaoBean usuarioAvaliacao;
	
	@Id
	@ManyToOne
	@JoinColumn(name="id_questao")
	private QuestaoBean questao;
	
	@Column(name="nota")
	private double nota;
	
	@Column(name="observacoes")
	private String observacoes;
	
	
	public UsuarioAvaliacaoBean getUsuarioAvaliacao() {
		return usuarioAvaliacao;
	}

	public void setUsuarioAvaliacao(UsuarioAvaliacaoBean usuarioAvaliacao) {
		this.usuarioAvaliacao = usuarioAvaliacao;
	}

	public QuestaoBean getQuestao() {
		return questao;
	}

	public void setQuestao(QuestaoBean questao) {
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
}
