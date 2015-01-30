package br.com.issuenet.model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import br.com.issuenet.model.beans.implementacao.TarefaBean;
import br.com.issuenet.model.beans.implementacao.UsuarioBean;
import br.com.issuenet.model.beans.implementacao.UsuarioTarefaBean;
import br.com.issuenet.model.dao.util.HibernateUtil;

public class NaoPodeGerenciar implements IComportamentoGerenciador {

	private String comportamento = "NaoPodeGerenciar";
	
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
		String hql = "select ut from usuario_tarefa ut "+
						" inner join fetch ut.tarefaBean t "+
						" where ut.usuarioBean = :usuarioBean "+
						" and t.status = :status ";
		Query query = session.createQuery(hql);
		query.setParameter("status", "Aberta");
		query.setParameter("usuarioBean", usuarioBean);
		List<UsuarioTarefaBean> usuarioTarefaBeans = query.list();
		session.close();
		List<Tarefa> tarefas = new ArrayList<Tarefa>();
		
		for(UsuarioTarefaBean ut : usuarioTarefaBeans){
			Tarefa tar = new Tarefa(ut.getTarefaBean());
			tarefas.add(tar);
		}
		return tarefas;
	}
	
	@Override
	public List<Tarefa> listaTarefasEmAvaliacao(Usuario usuario) {
		UsuarioBean usuarioBean = usuario.getUsuarioBean();
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		String hql = "select ut from usuario_tarefa ut "+
						" inner join fetch ut.tarefaBean t "+
						" where ut.usuarioBean = :usuarioBean "+
						" and t.status = :status ";
		Query query = session.createQuery(hql);
		query.setParameter("status", "EmAvaliacao");
		query.setParameter("usuarioBean", usuarioBean);
		List<UsuarioTarefaBean> usuarioTarefaBeans = query.list();
		session.close();
		List<Tarefa> tarefas = new ArrayList<Tarefa>();
		
		for(UsuarioTarefaBean ut : usuarioTarefaBeans){
			Tarefa tar = new Tarefa(ut.getTarefaBean());
			tarefas.add(tar);
		}
		return tarefas;
	}

	@Override
	public List<Tarefa> listaTarefasAvaliadas(Usuario usuario) {
		UsuarioBean usuarioBean = usuario.getUsuarioBean();
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		String hql = "select ut from usuario_tarefa ut "+
						" inner join fetch ut.tarefaBean t "+
						" where ut.usuarioBean = :usuarioBean "+
						" and t.status = :status ";
		Query query = session.createQuery(hql);
		query.setParameter("status", "Avaliada");
		query.setParameter("usuarioBean", usuarioBean);
		List<UsuarioTarefaBean> usuarioTarefaBeans = query.list();
		session.close();
		List<Tarefa> tarefas = new ArrayList<Tarefa>();
		
		for(UsuarioTarefaBean ut : usuarioTarefaBeans){
			Tarefa tar = new Tarefa(ut.getTarefaBean());
			tarefas.add(tar);
		}
		return tarefas;
	}

	@Override
	public List<Tarefa> listaTarefasFinalizadas(Usuario usuario) {
		UsuarioBean usuarioBean = usuario.getUsuarioBean();
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		String hql = "select ut from usuario_tarefa ut "+
						" inner join fetch ut.tarefaBean t "+
						" where ut.usuarioBean = :usuarioBean "+
						" and t.status = :status ";
		Query query = session.createQuery(hql);
		query.setParameter("status", "Finalizada");
		query.setParameter("usuarioBean", usuarioBean);
		List<UsuarioTarefaBean> usuarioTarefaBeans = query.list();
		session.close();
		List<Tarefa> tarefas = new ArrayList<Tarefa>();
		
		for(UsuarioTarefaBean ut : usuarioTarefaBeans){
			Tarefa tar = new Tarefa(ut.getTarefaBean());
			tarefas.add(tar);
		}
		return tarefas;
	}

}
