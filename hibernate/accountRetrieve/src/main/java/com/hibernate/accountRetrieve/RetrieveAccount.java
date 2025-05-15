package com.hibernate.accountRetrieve;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
//import org.hibernate.HibernateUtil;

public class RetrieveAccount 
{
	public static void main(String[] args) {
		
		//try
        //{
		Configuration cfg = new Configuration();
		cfg.configure("Account.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		Account a = new Account();
		a.setAccNum(1001);
		a.setName("Maxiee");
		a.setBalance(100000);
		//session.saveOrUpdate(a);
		//session.getTransaction().commit();
		session.update(a);
		tx.commit();
		Account acc = (Account)session.get(Account.class,1002);
		if(acc!=null) {
		System.out.println("Account Number: "+acc.getAccNum());
		System.out.println("Account Holder's Number: "+acc.getName());
		System.out.println("Balance: "+acc.getBalance());
		}
		else
		{
			System.out.println("Account not found");
		}
		session.close();
		factory.close();
		
		//Session s = HibernateUtil.getSessionFactory().getCurrentSession();

	}	  
}

