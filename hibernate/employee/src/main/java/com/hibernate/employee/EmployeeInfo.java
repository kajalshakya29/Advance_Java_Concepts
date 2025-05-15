package com.hibernate.employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeInfo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("employee.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session ses = factory.openSession();
		Employee emp = new Employee();
		emp.setEmpId(101);
		emp.setEmpName("Peter");
		emp.setEmpCity("Tokyo");
	}
}
