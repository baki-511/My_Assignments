package com.Assignment12;

import java.util.Scanner;

public class SavingAccount extends Account {
	
	public void getSavingAccountDetails() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Account Type :- ");
		String accountType = scan.nextLine();
		
		System.out.println("Enter Your Balance :- ");
		long balance = scan.nextLong();
		
		getSavingAccountInformation(accountType, balance);
	}
	public void getSavingAccountInformation(String accountType, long balance) {
		System.out.println("\n****************Account Information**************");
		System.out.println("Account Type :- "+accountType);
		System.out.println("Account Balance :- "+balance);
	}
	
	public static void main(String[] args) {
		SavingAccount sa = new SavingAccount();
		sa.getAccountDetails();
		sa.getSavingAccountDetails();
	}
}
