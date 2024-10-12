package com.bptn.course._06_oop;

public class BankSystem {

	public static void main(String[] args) {
		
		BankAccount motiAccount = new BankAccount("987654", 1200.00);
		motiAccount.displayAccountInfo();
		
		BankAccount homeAccount = new BankAccount("123456", 600.00);
		homeAccount.displayAccountInfo();
		
		SavingsAccount myAccount = new SavingsAccount("Savings123", 500.00, 2.00);
		myAccount.applyInterest();
		myAccount.displayAccountInfo();
		
	
		
	}

}
