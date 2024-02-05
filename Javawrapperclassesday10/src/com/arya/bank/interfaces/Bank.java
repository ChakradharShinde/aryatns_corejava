package com.arya.bank.interfaces;
import com.arya.bank.entities.Account;
@FunctionalInterface
public interface Bank {
	
	float MIN_BALANCE=1000;
	float DEPOSIT_LIMIT=20000;
	
	String transaction(Account account, float amount);
}
