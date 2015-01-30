package br.com.issuenet.model.beans.implementacao;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name="questionario_avaliacao")
@Table(name="questionario_avaliacao", schema="puc")
public class QuestionarioAvaliacaoBean implements Serializable 
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
	@JoinColumn(name="id_questionario_fk")
	private QuestionarioBean questionarioBean;
	
	@Id
	@ManyToOne
	@JoinColumn(name="id_avaliacao_fk")
	private AvaliacaoBean avaliacao;
	/**/
	
	public QuestionarioBean getQuestionarioBean() {
		return questionarioBean;
	}

	public void setQuestionarioBean(QuestionarioBean questionarioBean) {
		this.questionarioBean = questionarioBean;
	}

	public AvaliacaoBean getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(AvaliacaoBean avaliacao) {
		this.avaliacao = avaliacao;
	}
}
