package br.com.issuenet.model.dao.util;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class GenericDAO {
	public static void genericSave(Serializable s) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(s);
		session.getTransaction().commit();
		session.close();
	}
}
