package br.com.issuenet.model;

import java.util.List;

import br.com.issuenet.model.beans.implementacao.TarefaBean;
import br.com.issuenet.model.beans.implementacao.UsuarioBean;

public interface IComportamentoGerenciador {
	
	public String getComportamento();
	
	public Tarefa criarTarefa(TarefaBean t, UsuarioBean u);
	
	public List<Tarefa> listaTarefasEmResolucao(Usuario usuario);	
	public List<Tarefa> listaTarefasEmAvaliacao(Usuario usuario);
	public List<Tarefa> listaTarefasAvaliadas(Usuario usuario);
	public List<Tarefa> listaTarefasFinalizadas(Usuario usuario);
}
