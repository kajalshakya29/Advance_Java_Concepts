package com.hibernate.Lsr_Operation;

import org.hibernate.HibernateException;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RetrieveAccount1 
{
	public static void main(String[] args) {
		
		//try
        //{
		Configuration cfg = new Configuration();
		cfg.configure("Account1.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Account1 acc = (Account1)session.get(Account1.class,1001);
		
		System.out.println("After calling get() method");
		if(session.contains(acc))
		{
			System.out.println("Account is associate with the session");
		}
		else {
			System.err.println("Account is not associate with the session");
		}
		session.clear();
		System.out.println("After calling clear() method");
		/*System.out.println(acc.getName());
		System.out.println(acc.getAccNum());
		System.out.println(acc.getBalance());
		*/
		//Session session = factory.openSession();
		//Account1 acc = (Account1)session.get(Account1.class,1001);
//		System.out.println(acc.getName());
//		System.out.println(acc.getAccNum());
//		System.out.println(acc.getBalance());
//		
//		session.evict(acc);
//		session.clear();
		//session.close();
//		System.out.println(acc.getName());
//		System.out.println(acc.getAccNum());
//		System.out.println(acc.getBalance());
		
		Session s = factory.openSession();
		try {
			Account1 a = (Account1)s.get(Account1.class,1002);
			System.out.println(a.getName());
			System.out.println(a.getAccNum());
			System.out.println(a.getBalance());
		}
		catch(ObjectNotFoundException o) {
			o.printStackTrace();
		}
		s.evict(acc);
		s.clear();
		
	}
}