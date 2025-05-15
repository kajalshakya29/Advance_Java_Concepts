package com.hibernate.employee1;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeInfo {
	public static void main(String[] args) {
		
		try
        {
		Configuration cfg = new Configuration();
		cfg.configure("employee.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session ses = factory.openSession();
		
//		Employee emp = new Employee();
//		emp.setEmpId(101);
//		emp.setEmpName("Peter");
//		emp.setEmpCity("Tokyo");
//		emp.setEmpId(102);
//		emp.setEmpName("John");
//		emp.setEmpCity("NYC");
//		emp.setEmpId(103);
//		emp.setEmpName("Jack");
//		emp.setEmpCity("India");
		Transaction tx = ses.beginTransaction();
		Employee emp = (Employee) ses.load(Employee.class,101);
		System.out.println("Employee object loaded. " +emp);
		tx.commit();
		
		 //merge example - data already present in tables
	     emp.setEmpCity("New Delhi");
		 Transaction tx8 = ses.beginTransaction();
		 Employee emp4 = (Employee) ses.merge(emp);
		 System.out.println(emp4 == emp); // returns false
		 emp.setEmpName("Test");
		 emp4.setEmpName("Kumar");
		 System.out.println("15. Before committing merge transaction");
		 tx8.commit();
		 System.out.println("16. After committing merge transaction");

		// Close resources
		factory.close();
//		
//		emp
//		ses.close();
//		factory.close();
        }
		catch(HibernateException he)
		{
			System.out.println("Error Coming" + he);
			throw new ExceptionInInitializerError(he);
		}
        
	}
}
