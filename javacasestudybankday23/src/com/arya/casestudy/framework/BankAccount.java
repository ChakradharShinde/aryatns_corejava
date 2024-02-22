package com.arya.casestudy.framework;

public abstract class BankAccount {

	private int accountNumber;
	private String accountName;
	private float accountBalance;

	public BankAccount(int accountNumber, String accountName, float accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public float getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(float accountBalance) {
		this.accountBalance = accountBalance;
	}

	public abstract void withdraw(float amount);

	public abstract void deposit(float amount);

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountName=" + accountName + ", accountBalance="
				+ accountBalance + "]";
	}
}
