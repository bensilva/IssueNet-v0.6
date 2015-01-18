package br.com.issuenet.model.beans.implementacao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name="criterio_avaliacao")
@Table(name="criterio_avaliacao", schema="puc")
public class CriterioAvaliacaoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name="id_criterio_avaliacao")
	private int idCriterioAvaliacao;
	
	@Column(name="descricao")
	private String descricao;
	
	@Column(name="forma_calculo")
	private String formaCalculo;
	
	@ManyToOne
	@JoinColumn(name="responsavel")
	private UsuarioBean professor;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/*Metodos de acesso*/
	public int getIdCriterioAvaliacao() {
		return idCriterioAvaliacao;
	}
	public void setIdCriterioAvaliacao(int idCriterioAvaliacao) {
		this.idCriterioAvaliacao = idCriterioAvaliacao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getFormaCalculo() {
		return formaCalculo;
	}
	public void setFormaCalculo(String formaCalculo) {
		this.formaCalculo = formaCalculo;
	}
	public UsuarioBean getProfessor() {
		return professor;
	}
	public void setProfessor(UsuarioBean professor) {
		this.professor = professor;
	}
}