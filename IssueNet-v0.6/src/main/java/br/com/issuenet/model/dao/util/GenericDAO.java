package br.com.issuenet.model.dao.util;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class GenericDAO {
	public static String genericSave(Serializable s) {
		String msg = "";
		Session session = createSession();		
		try{
			session.save(s);
			//msg = s.getClass().getSimpleName() + "salvo com sucesso.";
			commitSession(session);
		}catch(HibernateException e){
			session.getTransaction().rollback();
			e.printStackTrace();
			msg = e.toString();
		}
		return msg;
	}
	
	public static String genericUpdate(Serializable s) {
		String msg = "";
		Session session = createSession();		
		try{
			session.update(s);
			commitSession(session);
		}catch(HibernateException e){
			session.getTransaction().rollback();
			e.printStackTrace();
			msg = e.toString();
		}
		return msg;
	}
	
	public static void genericDelete(Serializable s) {
		Session session = createSession();
		session.delete(s);
		commitSession(session);
	}

	private static Session createSession() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		return session;
	}
	
	private static void commitSession(Session session) {
		session.getTransaction().commit();
		session.close();
	}
	
}
