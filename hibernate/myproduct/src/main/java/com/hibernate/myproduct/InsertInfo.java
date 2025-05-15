package com.hibernate.myproduct;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertInfo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session ses = factory.openSession();
		Product p = new Product();
		p.setProductId(101);
		p.setProductNm("phone");
		p.setPrice(35000);
		
		Transaction tx = ses.beginTransaction();
		ses.save(p);
		tx.commit();
		ses.close();
		factory.close();
	}
}
