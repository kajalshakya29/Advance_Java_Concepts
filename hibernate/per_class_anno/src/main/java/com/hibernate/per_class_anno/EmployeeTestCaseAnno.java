package com.hibernate.per_class_anno;
import java.io.*;

import org.hibernate.cfg.*;
import org.hibernate.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction; // Add this import
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class EmployeeTestCaseAnno 
{
	static SessionFactory sf;
	static BufferedReader dis;
	public static void createSalariedEmployee() throws Exception
	{
		Salaried_Employee_Anno e = new Salaried_Employee_Anno();
		System.out.println("Creating Salaried Employee");
		System.out.println("Name: ");
		e.setName(dis.readLine());
		System.out.println("Annual Salary");
		e.setAnnual_salary(Double.parseDouble(dis.readLine()));
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		ses.save(e);
		tx.commit();
		ses.close();
		System.out.println("Salaried emp created successfully : " + e.getEmppno()+"/n");
	}
	public static void createHourlyEmployee() throws Exception
	{
		Hourly_Employee_Anno e = new Hourly_Employee_Anno();
		System.out.println("Creating Hourly Employee");
		System.out.println("Name: ");
		e.setName(dis.readLine());
		System.out.println("Rate per hr");
		e.setMax_hours_per_day(Integer.parseInt(dis.readLine()));
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		ses.save(e);
		tx.commit();
		ses.close();
		System.out.println("Salaried emp created successfully : " + e.getEmppno()+"/n");
		
	}
	public static void readEmployee() throws Exception
	{
		System.out.println("Empno:");
		int no = Integer.parseInt(dis.readLine());
		Session ses = sf.openSession();
		Object o = ses.get(EmployeeAnno.class, no);
		if(o instanceof Salaried_Employee_Anno)
		{
			System.out.println("This is a salaried Employee:");
			Salaried_Employee_Anno e = (Salaried_Employee_Anno)o;
			System.out.println("Name: " + e.getName());
			System.out.println("Name: "+ e.getAnnual_salary());
		}
		else
		{
			System.out.println("This is a hourly Employee");
			Hourly_Employee_Anno e = (Hourly_Employee_Anno)o;
			System.out.println("Name : " + e.getName());
			System.out.println("Rate per hr: " + e.getHourly_rate());
		}
		ses.close();
	}
	public static void main(String[] args) throws Exception
	{
		Configuration cfg = new Configuration().configure("EmployeeAnno.cfg.xml");
		sf=cfg.buildSessionFactory();
		dis = new BufferedReader(new InputStreamReader(System.in));
		createSalariedEmployee();
		createHourlyEmployee();
		System.out.println("Read Emp");
		readEmployee();
		System.out.println("\n Read one more Emp");
		readEmployee();
		
	}
}
