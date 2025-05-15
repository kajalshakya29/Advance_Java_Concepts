package com.hibernate.component_class;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class NewEmployeeDAOImpl implements NewEmployeeDAO {

    public void createEmployee(NewEmployee ne) {
        Configuration cfg = new Configuration();
        cfg.configure("newemployee.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session ses = factory.openSession();
        if (ses != null) {
            try {
                // Create a new NewEmployee object
                NewEmployee emp = new NewEmployee();
                emp.setEmpNo(ne.getEmpNo()); // Set the employee number
                emp.setEname(ne.getEname()); // Set the employee name
                emp.setSalary(ne.getSalary()); // Set the employee salary
                emp.setAddress(ne.getAddress()); // Set the employee address

                // Save the new employee object
                Integer id = (Integer) ses.save(emp);
                ses.beginTransaction().commit();
                System.out.println("Employee inserted with id: " + id);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                ses.close();
            }
        }
    }

    public void getEmployee(int empno) {
        Configuration cfg = new Configuration();
        cfg.configure("newemployee.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session ses = factory.openSession();
        if (ses != null) {
            try {
                // Retrieve the employee with the given empno
                NewEmployee emp = (NewEmployee) ses.get(NewEmployee.class, empno);
                if (emp != null) {
                    System.out.println("Empno: " + emp.getEmpNo());
                    System.out.println("Name: " + emp.getEname());
                    System.out.println("Salary: " + emp.getSalary());
                    System.out.println("Number: " + emp.getAddress().getNumber());
                    System.out.println("City: " + emp.getAddress().getCity());
                    System.out.println("State: " + emp.getAddress().getState());
                    System.out.println("Country: " + emp.getAddress().getCountry());
                } else {
                    System.out.println("Employee with empno " + empno + " not found.");
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                ses.close();
            }
        }
    }
}
