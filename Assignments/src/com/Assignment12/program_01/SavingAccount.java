package com.Assignment12.program_01;

import java.util.Scanner;

public class SavingAccount extends Account {
	String accountType;
	long accountBalance;
	
	public void getSavingAccountDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Account Type :- ");
		String accountType = sc.next();
		
		System.out.print("Enter Account Balance :- Rs.");
		long accountBalance = sc.nextLong();
		
		//assigning value to global variables
		this.accountType = accountType;
		this.accountBalance = accountBalance;
//		getSavingAccountInformation(accountType, accountBalance);
	}
	public void getSavingAccountInformation() {
		
		System.out.println("\nAccount Type :- "+accountType);
		System.out.println("Account Balance :- Rs."+accountBalance);
	}
	
	public static void main(String[] args) {
		SavingAccount sa = new SavingAccount();
		//Get information from User
		sa.getAccountDetails();
		sa.getSavingAccountDetails();
		
		//Print information
		sa.getAccountInformation();
		sa.getSavingAccountInformation();
	}
}
