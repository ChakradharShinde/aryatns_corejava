package com.arya.bank.utility;

import com.arya.bank.entities.Account;
import com.arya.bank.entities.Valid;
import com.arya.bank.interfaces.Bank;

public class BankUtility {
	
	public String deposit(Account account, float amount) {
		Bank bankDeposit = (account1, amount1) -> {
			if( amount1 <= Bank.DEPOSIT_LIMIT) {
				account1.setBalace(account1.getBalace() + amount1);
				return "success";
			}else
				return "Unsuccssfull Transaction..";
		};
		
		if(account instanceof Valid) 
			return bankDeposit.transaction(account, amount);
		else
			return "Invalid Account";
				
	}
	
	
	public String withdraw(Account account, float amount) {
		Bank bankWithdraw = (account1, amount1) -> {
			if(Bank.MIN_BALANCE < account1.getBalace()-amount1) {
				account1.setBalace(account1.getBalace()-amount1);
				return "success";
			}
			else 
				return "Unsuccssfull Transaction..";
		};
		
		if(account instanceof Valid) 
			return bankWithdraw.transaction(account, amount);
		else
			return "invalid account";
	}
}
