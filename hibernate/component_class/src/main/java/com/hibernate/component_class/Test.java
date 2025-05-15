package com.hibernate.component_class;

/**
 * Hello world!
 *
 */
public class Test
{
    public static void main( String[] args )
    {
        NewEmployeeDAO empdao = new NewEmployeeDAOImpl();
        Address address = new Address("1001","Agra","Uttar Pradesh","India");
        Address address1 = new Address("1002","Delhi","Delhi","India");
        Address address2 = new Address("1003","Tokyo","Tokyo","Japan");
        Address address3 = new Address("1004","NYC","New York","New York");
        NewEmployee emp = new NewEmployee();
        emp.setEname("Raman");
        emp.setSalary(80000.0);
        emp.setAddress(address);
        empdao.createEmployee(emp);
        empdao.getEmployee(1004);
        emp.setEname("Ram");
        emp.setSalary(805000.0);
        emp.setAddress(address1);
        empdao.createEmployee(emp);
        empdao.getEmployee(1003);
        emp.setEname("Rocky");
        emp.setSalary(90000.0);
        emp.setAddress(address2);
        empdao.createEmployee(emp);
        empdao.getEmployee(2);
        emp.setEname("Gennie");
        emp.setSalary(100000.0);
        emp.setAddress(address3);
        empdao.createEmployee(emp);
        empdao.getEmployee(1);
      
      //  Integer id = (Integer) ses.save(emp);
    }
}
