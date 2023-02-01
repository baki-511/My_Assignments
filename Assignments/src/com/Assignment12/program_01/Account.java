package com.Assignment12.program_01;

import java.util.Scanner;

public class Account {
	String accountName;
	int accountNumber;
	
	public void getAccountDetails() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Name :- ");
		String accountName = sc.nextLine();
		
		System.out.print("Enter Account Number :- ");
		int accountNumber = sc.nextInt();
		
		this.accountName = accountName;
		this.accountNumber = accountNumber;
//		getAccountInformation(accountName, accountNumber);
	}
	public void getAccountInformation() {
		System.out.println("\n************Account Information***************");
		System.out.println("User Name :- "+accountName);
		System.out.println("Account Number :- "+accountNumber);
	}
}
