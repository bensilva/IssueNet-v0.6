package br.com.issuenet.model;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import br.com.issuenet.model.beans.implementacao.UsuarioBean;
import br.com.issuenet.model.dao.util.GenericDAO;
import br.com.issuenet.model.dao.util.HibernateUtil;

public class Manager {

	public static String salvarTarefa(Tarefa t){
		String msg = GenericDAO.genericSave(t.getTarefaBean());
		if(msg.equals("")){
			return "Tarefa criada com sucesso!";
		}else{
			return msg;
		}		
	}
	
	public static Usuario recuperarUsuario(String email, String senha){
		UsuarioBean usuarioBean = new UsuarioBean();
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		String hql = "from usuario u where u.email = :email and u.senha = :senha";
		Query query = session.createQuery(hql);
		query.setParameter("email", email);
		query.setParameter("senha", senha);
		usuarioBean = (UsuarioBean)query.uniqueResult();
		if(usuarioBean==null){
			return null;
		}else{
			return new Usuario(usuarioBean);
		}
	}
}
