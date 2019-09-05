package com.lloydsbanking.webproject.poc.account;

public class Account 
{

	private int custID;
	private double balance;
	private String custName;
	
	
	public Account(int custID, double balance, String custName) {
		super();
		this.custID = custID;
		this.balance = balance;
		this.custName = custName;
	}
	
	
	public int getCustID() {
		return custID;
	}
	public void setCustID(int custID) {
		this.custID = custID;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}


	@Override
	public String toString() {
		return "Account [custID=" + custID + ", balance=" + balance + ", custName=" + custName + "]";
	}
	
	
	
	
	
}
