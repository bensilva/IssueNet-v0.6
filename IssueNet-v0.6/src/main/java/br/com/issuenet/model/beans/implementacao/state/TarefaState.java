package br.com.issuenet.model.beans.implementacao.state;


public interface TarefaState {
	
	public void liberaResolucao() ;
	public void resolver();
	public void expirar();
	public void liberarAvaliacao();
	public void avaliar();
	public void concluir();
	public void cancelar();
}
