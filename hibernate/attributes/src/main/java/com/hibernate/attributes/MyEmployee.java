package com.hibernate.attributes;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
@Table(name="NewEmployee")
public class MyEmployee {
	@Id
	@Column(name="emp_no")
	private int emp_num;
	@Column(name="dept_no")
	private int dept_no;
	@Column(name="emp_name")
	private String emp_nm;
	@Column(name="dept_name")
	private String dept_nm;
	@Column(name="emp_salary")
	private double salary;
	public int getEmp_num() {
		return emp_num;
	}
	public void setEmp_num(int emp_num) {
		this.emp_num = emp_num;
	}
	public int getDept_no() {
		return dept_no;
	}
	public void setDept_no(int dept_no) {
		this.dept_no = dept_no;
	}
	public String getEmp_nm() {
		return emp_nm;
	}
	public void setEmp_nm(String emp_nm) {
		this.emp_nm = emp_nm;
	}
	public String getDept_nm() {
		return dept_nm;
	}
	public void setDept_nm(String dept_nm) {
		this.dept_nm = dept_nm;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
