package com.hibernate.subclass;

public class EmployeeSub {
	private int empNo;
	private String name;
	public int getRollNo() {
		return empNo;
	}
	public void setRollNo(int rollNo) {
		this.empNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
