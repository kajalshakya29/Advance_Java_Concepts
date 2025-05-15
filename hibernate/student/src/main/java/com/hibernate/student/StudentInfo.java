package com.hibernate.student;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class StudentInfo {
	public static void main(String[] args) {

		try
        {
		Configuration cfg = new Configuration();
		cfg.configure("student.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session ses = factory.openSession();
		Student s = new Student();
		s.setStudentRollNo(101);
		s.setStudentName("John");
		s.setStudentPhone("8765432123");
		s.setStudentRollNo(102);
		s.setStudentName("Peter");
		s.setStudentPhone("9765432123");
		s.setStudentRollNo(103);
		s.setStudentName("Nisha");
		s.setStudentPhone("6765432123");
		s.setStudentRollNo(104);
		s.setStudentName("Nikhil");
		s.setStudentPhone("8965432123");
		
		Transaction tx = ses.beginTransaction();
		ses.save(s);
		tx.commit();
		ses.close();
		factory.close();
        }
		catch(HibernateException he)
		{
			System.out.println("Error Coming" + he);
			throw new ExceptionInInitializerError(he);
		}
	}
}
