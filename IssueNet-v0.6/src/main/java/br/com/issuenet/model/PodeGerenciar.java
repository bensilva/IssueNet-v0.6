package br.com.issuenet.model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import br.com.issuenet.model.beans.implementacao.TarefaBean;
import br.com.issuenet.model.beans.implementacao.UsuarioBean;
import br.com.issuenet.model.dao.util.HibernateUtil;

public class PodeGerenciar implements IComportamentoGerenciador {

	private String comportamento = "PodeGerenciar";
	
	public Tarefa criarTarefa(TarefaBean t, UsuarioBean u) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getComportamento() {
		return this.comportamento;
	}

	@Override
	public List<Tarefa> listaTarefasEmResolucao(Usuario usuario) {
		UsuarioBean usuarioBean = usuario.getUsuarioBean();
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		String hql = "select t from tarefa t "+
						" where t.tutor = :usuarioBean "+
						" and t.status = :status ";
		Query query = session.createQuery(hql);
		query.setParameter("status", "Aberta");
		query.setParameter("usuarioBean", usuarioBean);
		List<TarefaBean> tarefaBeans = query.list();
		session.close();
		List<Tarefa> tarefas = new ArrayList<Tarefa>();
		
		for(TarefaBean t : tarefaBeans){
			Tarefa tar = new Tarefa(t);
			tarefas.add(tar);
		}
		return tarefas;
	}
	
	@Override
	public List<Tarefa> listaTarefasEmAvaliacao(Usuario usuario) {
		UsuarioBean usuarioBean = usuario.getUsuarioBean();
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		String hql = "select t from tarefa t "+
				" where t.tutor = :usuarioBean "+
				" and t.status = :status ";
		Query query = session.createQuery(hql);
		query.setParameter("status", "EmAvaliacao");
		query.setParameter("usuarioBean", usuarioBean);
		List<TarefaBean> tarefaBeans = query.list();
		session.close();
		List<Tarefa> tarefas = new ArrayList<Tarefa>();
		
		for(TarefaBean t : tarefaBeans){
			Tarefa tar = new Tarefa(t);
			tarefas.add(tar);
		}
		return tarefas;
	}

	@Override
	public List<Tarefa> listaTarefasAvaliadas(Usuario usuario) {
		UsuarioBean usuarioBean = usuario.getUsuarioBean();
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		String hql = "select t from tarefa t "+
				" where t.tutor = :usuarioBean "+
				" and t.status = :status ";
		Query query = session.createQuery(hql);
		query.setParameter("status", "Avaliada");
		query.setParameter("usuarioBean", usuarioBean);
		List<TarefaBean> tarefaBeans = query.list();
		session.close();
		List<Tarefa> tarefas = new ArrayList<Tarefa>();
		
		for(TarefaBean t : tarefaBeans){
			Tarefa tar = new Tarefa(t);
			tarefas.add(tar);
		}
		return tarefas;
	}

	@Override
	public List<Tarefa> listaTarefasFinalizadas(Usuario usuario) {
		UsuarioBean usuarioBean = usuario.getUsuarioBean();
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		String hql = "select t from tarefa t "+
				" where t.tutor = :usuarioBean "+
				" and t.status = :status ";
		Query query = session.createQuery(hql);
		query.setParameter("status", "Finalizada");
		query.setParameter("usuarioBean", usuarioBean);
		List<TarefaBean> tarefaBeans = query.list();
		session.close();
		List<Tarefa> tarefas = new ArrayList<Tarefa>();
		
		for(TarefaBean t : tarefaBeans){
			Tarefa tar = new Tarefa(t);
			tarefas.add(tar);
		}
		return tarefas;
	}

	@Override
	public String salvar(Usuario usuario) {
		return Manager.salvarUsuario(usuario);
	}

}
