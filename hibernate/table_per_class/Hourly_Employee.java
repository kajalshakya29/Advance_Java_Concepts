package com.hibernate.table_per_class;

public class Hourly_Employee extends Employee2 {
	private double hourly_rate;
	private int max_hours_per_day;
	public double getHourly_rate() {
		return hourly_rate;
	}
	public void setHourly_rate(double hourly_rate) {
		this.hourly_rate = hourly_rate;
	}
	public int getMax_hours_per_day() {
		return max_hours_per_day;
	}
	public void setMax_hours_per_day(int max_hours_per_day) {
		this.max_hours_per_day = max_hours_per_day;
	}
	

}
