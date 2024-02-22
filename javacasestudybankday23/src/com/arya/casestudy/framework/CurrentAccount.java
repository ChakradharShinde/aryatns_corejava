package com.arya.casestudy.framework;

public abstract class CurrentAccount extends BankAccount{
	public CurrentAccount(int accountNumber, String accountName, float accountBalance, float creditLimit) {
		super(accountNumber, accountName, accountBalance);
		this.CREDIT_LIMIT=creditLimit;
	}


	private final float CREDIT_LIMIT;
	
	
	


	public float getCREDIT_LIMIT() {
		return CREDIT_LIMIT;
	}


	@Override
	public String toString() {
		return "CurrectAccount [CREDIT_LIMIT=" + CREDIT_LIMIT + ", getAccountNumber()=" + getAccountNumber()
				+ ", getAccountName()=" + getAccountName() + ", getAccountBalance()=" + getAccountBalance()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
}
