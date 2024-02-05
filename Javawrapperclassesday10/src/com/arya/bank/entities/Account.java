package com.arya.bank.entities;

public class Account implements Valid{

	private int accountNo;
	private String name;
	private float balace;
	public Account() {
	}
	public Account(int accountNo, String name, float balace) {
		this.accountNo = accountNo;
		this.name = name;
		this.balace = balace;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBalace() {
		return balace;
	}
	public void setBalace(float balace) {
		this.balace = balace;
	}
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", name=" + name + ", balace=" + balace + "]";
	}
}
