package br.com.issuenet.model;

import br.com.issuenet.model.beans.implementacao.QuestaoBean;

public class Questao {
	
	private QuestaoBean questaoBean;
	private int idQuestao;
	private String nomeQuestao;
	private String descricao;
	private double peso;
	private Questionario questionario;
	
	public Questao(QuestaoBean questaoBean){
		this.questaoBean = questaoBean;
		this.idQuestao = questaoBean.getIdQuestao();
		this.nomeQuestao = questaoBean.getNomeQuestao();
		this.descricao = questaoBean.getDescricao();
		this.peso = questaoBean.getPeso();
		this.questionario = new Questionario(questaoBean.getQuestionarioBean());
	}
	
	public int getIdQuestao() {
		return idQuestao;
	}
	public void setIdQuestao(int idQuestao) {
		this.idQuestao = idQuestao;
	}
	public String getNomeQuestao() {
		return nomeQuestao;
	}
	public void setNomeQuestao(String nomeQuestao) {
		this.nomeQuestao = nomeQuestao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public Questionario getQuestionario() {
		return questionario;
	}
	public void setQuestionario(Questionario questionario) {
		this.questionario = questionario;
	}
	public QuestaoBean getQuestaoBean() {
		return questaoBean;
	}
	
	
}
