package br.com.issuenet.model.beans.implementacao;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.issuenet.model.beans.implementacao.state.TarefaState;

@Entity(name="tarefa")
@Table(name="tarefa", schema="puc")
public class TarefaBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name="id_tarefa")
	private int idTarefa;
	
	@Column(name="nome_tarefa")
	private String nomeTarefa;
	
	@Column(name="descricao")
	private String descricao;
	
	@Column(name="materia")
	private String materia;
	
	@ManyToOne
	@JoinColumn(name="id_usuario")
	public UsuarioBean tutor;
	
	@Column(name="data_criacao")
	@Temporal(TemporalType.DATE)
	private Date dataCriacao;
	
	@Column(name="data_limite_resolucao")
	@Temporal(TemporalType.DATE)
	private Date dataLimiteResolucao;
	
	@Column(name="data_resolvida")
	@Temporal(TemporalType.DATE)
	private Date dataResolvida;
	
	@Column(name="data_inicio_avaliacao")
	@Temporal(TemporalType.DATE)
	private Date dataInicioAvaliacao;
	
	@Column(name="data_limite_avaliacao")
	@Temporal(TemporalType.DATE)
	private Date dataLimiteAvaliacao;
	
	@Column(name="status")
	private TarefaState status;
	
	@Column(name="nota_final")
	private double notaFinal;
	
	@ManyToOne
	@JoinColumn(name="id_criterio_avaliacao")
	private CriterioAvaliacaoBean criterioAvaliacao;
	
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/*Metodos de acesso*/
	public int getIdTarefa() {
		return idTarefa;
	}
	public void setIdTarefa(int idTarefa) {
		this.idTarefa = idTarefa;
	}
	public String getNomeTarefa() {
		return nomeTarefa;
	}
	public void setNomeTarefa(String nomeTarefa) {
		this.nomeTarefa = nomeTarefa;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public UsuarioBean getTutor() {
		return tutor;
	}
	public void setTutor(UsuarioBean tutor) {
		this.tutor = tutor;
	}
	public Date getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public Date getDataLimiteResolucao() {
		return dataLimiteResolucao;
	}
	public void setDataLimiteResolucao(Date dataLimiteResolucao) {
		this.dataLimiteResolucao = dataLimiteResolucao;
	}
	public Date getDataResolvida() {
		return dataResolvida;
	}
	public void setDataResolvida(Date dataResolvida) {
		this.dataResolvida = dataResolvida;
	}
	public Date getDataInicioAvaliacao() {
		return dataInicioAvaliacao;
	}
	public void setDataInicioAvaliacao(Date dataInicioAvaliacao) {
		this.dataInicioAvaliacao = dataInicioAvaliacao;
	}
	public Date getDataLimiteAvaliacao() {
		return dataLimiteAvaliacao;
	}
	public void setDataLimiteAvaliacao(Date dataLimiteAvaliacao) {
		this.dataLimiteAvaliacao = dataLimiteAvaliacao;
	}
	public TarefaState getStatus() {
		return status;
	}
	public void setStatus(TarefaState status) {
		this.status = status;
	}
	public double getNotaFinal() {
		return notaFinal;
	}
	public void setNotaFinal(double notaFinal) {
		this.notaFinal = notaFinal;
	}
	public CriterioAvaliacaoBean getCriterioAvaliacao() {
		return criterioAvaliacao;
	}
	public void setCriterioAvaliacao(CriterioAvaliacaoBean criterioAvaliacao) {
		this.criterioAvaliacao = criterioAvaliacao;
	}
}
