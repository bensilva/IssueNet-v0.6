package br.com.issuenet.model.beans.implementacao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name="questao")
@Table(name="questao", schema="puc")
public class QuestaoBean implements Serializable {

	private static final long serialVersionUID = 1L;
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	 * 
	 */

	/**/
	@Id
	@GeneratedValue
	@Column(name="id_questao")
	private int idQuestao;
	
	@ManyToOne
	@JoinColumn(name="id_questionario_fk")
	private QuestionarioBean questionarioBean;
	
	@Column(name="nome_questao")
	private String nomeQuestao;
	
	@Column(name="descricao")
	private String descricao;
	
	@Column(name="peso")
	private double peso;	
	/**/
	
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

	public QuestionarioBean getQuestionarioBean() {
		return questionarioBean;
	}

	public void setQuestionarioBean(
			QuestionarioBean questionarioBean) {
		this.questionarioBean = questionarioBean;
	}
}
