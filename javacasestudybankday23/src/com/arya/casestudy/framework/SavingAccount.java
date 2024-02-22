package com.arya.casestudy.framework;

public abstract class SavingAccount extends BankAccount {

	private boolean isSalaried;
	private static final float MIN_BALANCE=500;
	
	public SavingAccount(int accountNumber, String accountName, float accountBalance, boolean isSalaried) {
		super(accountNumber, accountName, accountBalance);
		this.isSalaried=isSalaried;
	}

	public boolean isSalaried() {
		return isSalaried;
	}

	public void setSalaried(boolean isSalaried) {
		this.isSalaried = isSalaried;
	}

	public static float getMinBalance() {
		return MIN_BALANCE;
	}

	@Override
	public String toString() {
		return "SavingAccount [isSalaried=" + isSalaried + ", getAccountNumber()=" + getAccountNumber()
				+ ", getAccountName()=" + getAccountName() + ", getAccountBalance()=" + getAccountBalance()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
}
