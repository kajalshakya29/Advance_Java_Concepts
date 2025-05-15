package com.hibernate.concrete;
import org.hibernate.cfg.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.hibernate.*;
import org.hibernate.Session;
import org.hibernate.Transaction; // Add this import
import org.hibernate.cfg.Configuration;

import com.hibernate.subclass.EmployeeSub;
import com.hibernate.subclass.Hourly_Employee_Sub;
import com.hibernate.subclass.Salaried_Employee_Sub;

import org.hibernate.SessionFactory;

public class EmployeeTestCaseConcrete {
	static SessionFactory sf;
	static BufferedReader dis;
	public static void createSalariedEmployee() throws Exception
	{
		Salaried_Employee_Concrete e = new Salaried_Employee_Concrete();
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
		System.out.println("Salaried emp created successfully : " + e.getEmpNo()+"/n");
	}
	public static void createHourlyEmployee() throws Exception
	{
		Hourly_Employee_Concrete e = new Hourly_Employee_Concrete();
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
		System.out.println("Salaried emp created successfully : " + e.getRollNo()+"/n");
	
	}
	public static void readEmployee() throws Exception
	{
		System.out.println("Empno:");
		int no = Integer.parseInt(dis.readLine());
		Session ses = sf.openSession();
		Object o = ses.get(Employee_Concrete.class, no);
		if(o instanceof Salaried_Employee_Concrete)
		{
			System.out.println("This is a salariedEmployee:");
			Salaried_Employee_Concrete e = (Salaried_Employee_Concrete)o;
			System.out.println("Name: " + e.getName());
			System.out.println("Name: "+ e.getAnnual_salary());
		}
		else
		{
			System.out.println("This is a hourly Employee");
			Hourly_Employee_Concrete e = (Hourly_Employee_Concrete)o;
			System.out.println("Name : " + e.getName());
			System.out.println("Rate per hr: " + e.getHourly_rate());
		}
		ses.close();
	}
	public static void main(String[] args) throws Exception
	{
		Configuration cfg = new Configuration().configure("EmployeeSub.cfg.xml");
		sf=cfg.buildSessionFactory();
		dis = new BufferedReader(new InputStreamReader(System.in));
		//createSalariedEmployee();
		//createHourlyEmployee();
		System.out.println("Read Emp");
		readEmployee();
		System.out.println("\n Read one more Emp");
		readEmployee();
		
	}


}
