package com.arya.casestudy.application;

import com.arya.casestudy.framework.BankFactory;

public class MMBankFactory extends BankFactory{

	@Override
	public MMSavingAccount getNewSavingAccount(int accountNumber, String accountName, float accountBalance,
			boolean isSalaried) {
		
		return new MMSavingAccount(accountNumber, accountName, accountBalance, isSalaried);
	}

	@Override
	public MMCurrentAccount getNewCurrentAccount(int accountNumber, String accountName, float accountBalance,
			float creditLimit) {
		
		return new MMCurrentAccount(accountNumber, accountName, accountBalance, creditLimit) ;
	}

}
