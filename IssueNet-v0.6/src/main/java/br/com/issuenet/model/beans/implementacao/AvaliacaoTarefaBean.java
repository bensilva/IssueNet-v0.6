package br.com.issuenet.model.beans.implementacao;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="avaliacaoTarefa")
@Table(name="avaliacao_tarefa", schema="puc")
public class AvaliacaoTarefaBean implements Serializable {

	/**
	 * Implementação para a interface Serializable, requerida pelo hibernate
	 * para persistencia de objetos complexos
	 */
	private static final long serialVersionUID = 1L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	 * Atributos da classe
	 * */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_avaliacao_tarefa", insertable=true, nullable=false, updatable=false)
	private int idAvaliacaoTarefa;
	@Column(name="data_avaliada", insertable=true, updatable=true, nullable=false)
	@Temporal(TemporalType.DATE)
	private Date dataAvaliada;
	@Column(name="data_fim_avaliacao", insertable=true, updatable=true, nullable=false)
	@Temporal(TemporalType.DATE)
	private Date dataFimAvaliacao;
	@Column(name="nota", insertable=false, updatable=true, nullable=false, columnDefinition="Decimal(5,2) default '000.00'")
	private double nota;
	@Column(name="observacoes", insertable=true, updatable=true, nullable=true, length=255)
	private String observacoes;
	@Column(name="id_modelo_avaliacao_fk", insertable=true, updatable=true, nullable=true, columnDefinition="int", length=11)
	private ModeloAvaliacaoBean modeloAvaliacao;
	/**
	 * Métodos de acesso
	 * */

	public int getIdAvaliacaoTarefa() {
		return idAvaliacaoTarefa;
	}
	public void setIdAvaliacaoTarefa(int idAvaliacaoTarefa) {
		this.idAvaliacaoTarefa = idAvaliacaoTarefa;
	}
	public Date getDataAvaliada() {
		return dataAvaliada;
	}
	public void setDataAvaliada(Date dataAvaliada) {
		this.dataAvaliada = dataAvaliada;
	}
	public Date getDataFimAvaliacao() {
		return dataFimAvaliacao;
	}
	public void setDataFimAvaliacao(Date dataFimAvaliacao) {
		this.dataFimAvaliacao = dataFimAvaliacao;
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
	public ModeloAvaliacaoBean getModeloAvaliacao() {
		return modeloAvaliacao;
	}
	public void setModeloAvaliacao(ModeloAvaliacaoBean modeloAvaliacao) {
		this.modeloAvaliacao = modeloAvaliacao;
	}
}
