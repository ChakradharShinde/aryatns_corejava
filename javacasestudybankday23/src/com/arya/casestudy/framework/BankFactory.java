package com.arya.casestudy.framework;

public abstract class BankFactory {

	public abstract SavingAccount getNewSavingAccount(int accountNumber, String accountName, float accountBalance, boolean isSalaried);
	public abstract CurrentAccount getNewCurrentAccount(int accountNumber, String accountName, float accountBalance, float creditLimit);
}
