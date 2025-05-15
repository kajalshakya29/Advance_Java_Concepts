package com.hibernate.accountRetrieve;

public class Account {
	private int accNum;
	private String name;
	private double balance;
	public int getAccNum() {
		return accNum;
	}
	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
