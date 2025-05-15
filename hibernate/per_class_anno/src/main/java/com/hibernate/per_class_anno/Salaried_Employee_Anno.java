package com.hibernate.per_class_anno;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("salaried")
public class Salaried_Employee_Anno extends EmployeeAnno{
	private double annual_salary;
	@Column(name="annual_salary")
	public double getAnnual_salary() {
		return annual_salary;
	}

	public void setAnnual_salary(double annual_salary) {
		this.annual_salary = annual_salary;
	}
	
}
