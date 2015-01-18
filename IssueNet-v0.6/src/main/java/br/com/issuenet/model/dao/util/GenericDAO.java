package br.com.issuenet.model.dao.util;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class GenericDAO {
	public static void genericSave(Serializable s) {
		Session session = createSession();		
		try{
		session.save(s);
		commitSession(session);
		}catch(HibernateException e){
			session.getTransaction().rollback();
			e.printStackTrace();
		}
	}
	
	public static void genericUpdate(Serializable s) {
		Session session = createSession();		
		session.update(s);
		commitSession(session);
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
