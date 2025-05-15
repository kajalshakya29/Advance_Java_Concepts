package com.hibernate.attributes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction; // Add this import
import org.hibernate.cfg.Configuration;

public class MyEmployeeExec {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("myemployee.cfg.xml");
        cfg.addAnnotatedClass(MyEmployee.class);
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = null; // Initialize transaction
        
        try {
            transaction = session.beginTransaction(); // Begin transaction
            
            MyEmployee emp = new MyEmployee();
            emp.setEmp_num(2001);
            emp.setSalary(120000);
            emp.setEmp_nm("Raj");
            emp.setDept_no(12);
            emp.setDept_nm("IT");
            emp.setEmp_num(2002);
            emp.setSalary(150000);
            emp.setEmp_nm("Raju");
            emp.setDept_no(15);
            emp.setDept_nm("IT");
            Integer id = (Integer) session.save(emp);
            
            transaction.commit(); // Commit transaction
            
            System.out.println("Employee inserted with ID: " + id);
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback(); // Rollback transaction if there's an exception
            }
            e.printStackTrace();
        } finally {
            session.close(); // Close the session
        }
    }
}
