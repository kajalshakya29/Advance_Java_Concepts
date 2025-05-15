package com.hibernate.biderectional;

public class Address1 {
	private String number;
	private String city;
	private String state;
	private String country;
	private Employee1 emp;
	
	public Address1()
	{}
	public Address1(String number, String city, String state, String country, Employee1 emp)
	{
		this.number=number;
		this.city=city;
		this.state=state;
		this.country=country;
		this.emp=emp;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Employee1 getEmp() {
		return emp;
	}
	public void setEmp(Employee1 emp) {
		this.emp = emp;
	}
	

}
