package com.hibernate.biderectional;


public class Employee1 {
	private int empNo;
	private String ename;
	private double salary;
	private Address1 address;
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Address1 getAddress() {
		return address;
	}
	public void setAddress(Address1 address) {
		this.address = address;
	}
	

}
