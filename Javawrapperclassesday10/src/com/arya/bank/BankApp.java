package com.arya.bank;

import com.arya.bank.entities.Account;
import com.arya.bank.utility.BankUtility;

public class BankApp {

	public static void main(String[] args) {
		Account account = new Account(1001, "XYZ", 100000);
		BankUtility utility = new BankUtility();
		
//		Bank bank = new Bank() {
//			@Override
//			public String transaction(Account account, float amount) {
//				return "";
//			}
//		};
		
		String depositMessage = utility.deposit(account, 1000);
		if(depositMessage == "success")
			System.out.println(account);
		else
			System.out.println(depositMessage);
		String withdrawMessage = utility.withdraw(account, 99500);
		if(withdrawMessage == "successful")
			System.out.println(account);
		else {
			System.out.println(account);
			System.out.println(withdrawMessage);
		}
	}
}
