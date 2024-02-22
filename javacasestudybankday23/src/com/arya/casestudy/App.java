package com.arya.casestudy;

import com.arya.casestudy.application.MMBankFactory;
import com.arya.casestudy.framework.BankAccount;
import com.arya.casestudy.framework.BankFactory;

public class App {

	public static void main(String[] args) {
		BankFactory factory= new MMBankFactory();
		BankAccount savingAccount = factory.getNewSavingAccount(1001, "Jay", 1000, true);
		
		savingAccount.withdraw(400);
		savingAccount.deposit(100);
		
		BankAccount currentAccount = factory.getNewCurrentAccount(9001, "Tanu", 2000, 1000);
		currentAccount.withdraw(2900);
		currentAccount.deposit(1000);
	}
}
