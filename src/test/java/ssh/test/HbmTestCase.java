package ssh.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ssh.day03.User;

public class HbmTestCase {
	SessionFactory factory;
	
	@Before
	public void init(){
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		factory=cfg.buildSessionFactory();
	}
	
	@After
	public void destory(){
		factory.close();
	}
	
	@Test
	public void testSave(){
		User user=new User(1, "Ben" , 10, 4.5, new Date());
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(user);
		tx.commit();
		session.close();
		factory.close();
	}

}
