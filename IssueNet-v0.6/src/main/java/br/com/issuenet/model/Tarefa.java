package br.com.issuenet.model;

import java.util.Date;

import br.com.issuenet.model.beans.implementacao.TarefaBean;

public class Tarefa {

	private TarefaBean tarefaBean = new TarefaBean();
	private int idTarefa;
	private String nomeTarefa;
	private String descricao;
	private String materia;
	public Usuario tutor;
	public Usuario resolvidoPor;
	private Date dataCriacao;
	private Date dataLimiteResolucao;
	private Date dataResolvida;
	private Date dataInicioAvaliacao;
	private Date dataLimiteAvaliacao;	
	private double notaFinal;
	private CriterioAvaliacao criterioAvaliacao;
	private ITarefaState statusAtual = new TarefaStateAberta();
	private ITarefaState statusAberta = new TarefaStateAberta();
	private ITarefaState statusExpirada = new TarefaStateExpirada();
	private ITarefaState statusEmAvaliacao = new TarefaStateEmAvaliacao();
	private ITarefaState statusAvaliada = new TarefaStateAvaliada();
	private ITarefaState statusFinalizada = new TarefaStateFinalizada();
	private ITarefaState statusCancelada = new TarefaStateCancelada();
	
	public Tarefa(){
			this.tarefaBean.setStatus(this.statusAtual.getStatusString());
	}
	
/*	public Tarefa(TarefaBean tarefaBean, Usuario tutor){
		this.tarefaBean = tarefaBean;
		this.idTarefa = tarefaBean.getIdTarefa();
		this.nomeTarefa = tarefaBean.getNomeTarefa();
		this.descricao = tarefaBean.getDescricao();
		this.materia = tarefaBean.getMateria();
		this.tutor = tutor;
		
	}*/
	
	public int getIdTarefa() {
		return idTarefa;
	}
	public void setIdTarefa(int idTarefa) {
		this.idTarefa = idTarefa;
		this.tarefaBean.setIdTarefa(idTarefa);
	}
	public String getNomeTarefa() {
		return nomeTarefa;
	}
	public void setNomeTarefa(String nomeTarefa) {
		this.nomeTarefa = nomeTarefa;
		this.tarefaBean.setNomeTarefa(nomeTarefa);
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
		this.tarefaBean.setDescricao(descricao);
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
		this.tarefaBean.setMateria(materia);
	}
	public Usuario getTutor() {
		return tutor;
	}
	public void setTutor(Usuario tutor) {
		this.tutor = tutor;
		this.tarefaBean.setTutor(tutor.getUsuarioBean());
	}
	public Usuario getResolvidoPor() {
		return resolvidoPor;
	}
	public void setResolvidoPor(Usuario resolvidoPor) {
		this.resolvidoPor = resolvidoPor;
		this.tarefaBean.setResolvidoPor(resolvidoPor.getUsuarioBean());
	}
	public Date getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
		this.tarefaBean.setDataCriacao(dataCriacao);
	}
	public Date getDataLimiteResolucao() {
		return dataLimiteResolucao;
	}
	public void setDataLimiteResolucao(Date dataLimiteResolucao) {
		this.dataLimiteResolucao = dataLimiteResolucao;
		this.tarefaBean.setDataLimiteResolucao(dataLimiteResolucao);
	}
	public Date getDataResolvida() {
		return dataResolvida;
	}
	public void setDataResolvida(Date dataResolvida) {
		this.dataResolvida = dataResolvida;
		this.tarefaBean.setDataResolvida(dataResolvida);
	}
	public Date getDataInicioAvaliacao() {
		return dataInicioAvaliacao;
	}
	public void setDataInicioAvaliacao(Date dataInicioAvaliacao) {
		this.dataInicioAvaliacao = dataInicioAvaliacao;
		this.tarefaBean.setDataInicioAvaliacao(dataInicioAvaliacao);
	}
	public Date getDataLimiteAvaliacao() {
		return dataLimiteAvaliacao;
	}
	public void setDataLimiteAvaliacao(Date dataLimiteAvaliacao) {
		this.dataLimiteAvaliacao = dataLimiteAvaliacao;
		this.tarefaBean.setDataLimiteAvaliacao(dataLimiteAvaliacao);
	}
	public double getNotaFinal() {
		return notaFinal;
	}
	public void setNotaFinal(double notaFinal) {
		this.notaFinal = notaFinal;
		this.tarefaBean.setNotaFinal(notaFinal);
	}
	public CriterioAvaliacao getCriterioAvaliacao() {
		return criterioAvaliacao;
	}
	public void setCriterioAvaliacao(CriterioAvaliacao criterioAvaliacao) {
		this.criterioAvaliacao = criterioAvaliacao;
		this.tarefaBean.setCriterioAvaliacao(criterioAvaliacao.getCriterioAvaliacaoBean());
	}
	public ITarefaState getStatusAtual() {
		return statusAtual;
	}
	public void setStatusAtual(ITarefaState statusAtual) {
		this.statusAtual = statusAtual;
		this.tarefaBean.setStatus(this.statusAtual.getStatusString());
	}
	public ITarefaState getStatusAberta() {
		return statusAberta;
	}
	public ITarefaState getStatusExpirada() {
		return statusExpirada;
	}
	public ITarefaState getStatusEmAvaliacao() {
		return statusEmAvaliacao;
	}
	public ITarefaState getStatusAvaliada() {
		return statusAvaliada;
	}
	public ITarefaState getStatusFinalizada() {
		return statusFinalizada;
	}
	public ITarefaState getStatusCancelada() {
		return statusCancelada;
	}
	public TarefaBean getTarefaBean() {
		return tarefaBean;
	}
	
}
