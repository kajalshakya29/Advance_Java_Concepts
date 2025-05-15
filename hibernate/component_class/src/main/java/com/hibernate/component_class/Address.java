package com.hibernate.component_class;

public class Address {
	private String number;
	private String city;
	private String state;
	private String country;
	
	public Address()
	{}
	public Address(String number, String city, String state, String country)
	{
		this.number=number;
		this.city=city;
		this.state=state;
		this.country=country;
		
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
	
}
