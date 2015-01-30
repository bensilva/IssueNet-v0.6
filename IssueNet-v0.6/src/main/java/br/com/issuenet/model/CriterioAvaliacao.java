package br.com.issuenet.model;

import br.com.issuenet.model.beans.implementacao.CriterioAvaliacaoBean;
import br.com.issuenet.model.beans.implementacao.UsuarioBean;

public class CriterioAvaliacao {

	private CriterioAvaliacaoBean criterioAvaliacaoBean;
	
	private int idCriterioAvaliacao;

	private UsuarioBean responsavel;
	
	private String descricao;

	private String formaCalculo;	

	public CriterioAvaliacao(CriterioAvaliacaoBean criterioAvaliacaoBean) {
		if(criterioAvaliacaoBean != null){
			this.criterioAvaliacaoBean = criterioAvaliacaoBean;
			this.idCriterioAvaliacao = criterioAvaliacaoBean.getIdCriterioAvaliacao();
			this.descricao = criterioAvaliacaoBean.getDescricao();
			this.formaCalculo = criterioAvaliacaoBean.getFormaCalculo();
			this.responsavel = criterioAvaliacaoBean.getResponsavel();
		}
	}
	
	
	public int getIdCriterioAvaliacao() {
		return idCriterioAvaliacao;
	}

	public void setIdCriterioAvaliacao(int idCriterioAvaliacao) {
		this.idCriterioAvaliacao = idCriterioAvaliacao;
		this.criterioAvaliacaoBean.setIdCriterioAvaliacao(idCriterioAvaliacao);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
		this.criterioAvaliacaoBean.setDescricao(descricao);
	}

	public String getFormaCalculo() {
		return formaCalculo;
	}

	public void setFormaCalculo(String formaCalculo) {
		this.formaCalculo = formaCalculo;
		this.criterioAvaliacaoBean.setFormaCalculo(formaCalculo);
	}

	public UsuarioBean getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(UsuarioBean responsavel) {
		this.responsavel = responsavel;
		this.criterioAvaliacaoBean.setResponsavel(responsavel);
	}

	public CriterioAvaliacaoBean getCriterioAvaliacaoBean() {
		return criterioAvaliacaoBean;
	}
	
}
