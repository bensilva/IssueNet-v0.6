package br.com.issuenet.model;

import java.util.ArrayList;

import br.com.issuenet.model.beans.implementacao.QuestionarioBean;

public class Questionario {

	private QuestionarioBean questionarioBean;
	private int idQuestionario;
	private String nome;
	private String descricao;
	private double peso;
	private String perfil;
	private ArrayList<Avaliacao> avaliacoes;
	private ArrayList<Questao> questoes;
	
	public Questionario(QuestionarioBean questionarioBean){
		this.questionarioBean = questionarioBean;
		this.idQuestionario = questionarioBean.getIdQuestionario();
		this.nome = questionarioBean.getNome();
		this.descricao = questionarioBean.getDescricao();
		this.peso = questionarioBean.getPeso();
		this.perfil = questionarioBean.getPerfil();
		this.avaliacoes = Manager.listaAvaliacoes(questionarioBean);
		this.questoes = Manager.listaQuestoes(questionarioBean);
	}
	
	public int getIdQuestionario() {
		return idQuestionario;
	}
	public void setIdQuestionario(int idQuestionario) {
		this.idQuestionario = idQuestionario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	public ArrayList<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}
	public void setAvaliacoes(ArrayList<Avaliacao> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}
	public ArrayList<Questao> getQuestoes() {
		return questoes;
	}
	public void setQuestoes(ArrayList<Questao> questoes) {
		this.questoes = questoes;
	}
	public QuestionarioBean getQuestionarioBean() {
		return questionarioBean;
	}
	public String getPerfil() {
		return perfil;
	}
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}	
}
