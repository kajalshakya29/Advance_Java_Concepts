package com.hibernate.table_per_class;

public class Salaried_Employee extends Employee2{
	private double annual_salary;

	public double getAnnual_salary() {
		return annual_salary;
	}

	public void setAnnual_salary(double annual_salary) {
		this.annual_salary = annual_salary;
	}
	 
}
