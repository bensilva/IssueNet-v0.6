import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import br.com.issuenet.model.beans.implementacao.UsuarioBean;
import br.com.issuenet.model.dao.util.HibernateUtil;


public class UsuarioBeanTeste {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		List<UsuarioBean> usuarios = session.createQuery("from usuario").list();
		
		session.close();
		
		for(UsuarioBean u : usuarios){
			System.out.println(u.getIdUsuario() + " " + u.getEmail() + " " + u.getMatricula());
		}

	}

}
