package br.com.issuenet.model.beans.implementacao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="questionario")
@Table(name="questionario", schema="puc")
public class QuestionarioBean implements Serializable {

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
	@Column(name="id_questionario")
	private int idQuestionario;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="descricao")
	private String descricao;
	
	@Column(name="peso")
	private double peso;
	
	@Column(name="perfil")
	private String perfil;
	/**/
	
	
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
	public String getPerfil() {
		return perfil;
	}
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
}
