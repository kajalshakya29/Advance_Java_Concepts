package com.hibernate.biderectional;
import org.hibernate.cfg.*;
import org.hibernate.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction; // Add this import
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
     Configuration cfg = new Configuration();
     cfg.configure("Employee1.cfg.xml");
     SessionFactory factory = cfg.buildSessionFactory();
     Session ses = factory.openSession();
     Employee1 emp = ses.load(Employee1.class, 101);
     System.out.println("Emp name" + emp.getEname());
     System.out.println("Emp Salary" + emp.getSalary());
     System.out.println();
     System.out.println("Obtain Address from Employee");
     Address1 add = emp.getAddress();
     System.out.println("number" + add.getNumber());
     System.out.println("city" + add.getCity());
     System.out.println("state" + add.getState());
     System.out.println("country" + add.getCountry());
     System.out.println();
     System.out.println("\n obtaining Employee from Address");
     Employee1 e = add.getEmp();
     System.out.println("Employee Name: " + add.getNumber());
     System.out.println("Employee Salary" + add.getNumber());
       
    }
    
}
