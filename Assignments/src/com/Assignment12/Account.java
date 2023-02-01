package com.Assignment12;

import java.util.Scanner;

public class Account {
//	int accountNum;
//	String accountName;
//	public Account(String accountName, int accountNum) {
//		this.accountName = accountName;
//		this.accountNum = accountNum;
//	}
	
	public void getAccountDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name :- ");
		String accountName = sc.nextLine();
		
		System.out.println("Enter your Account Number :- ");
		int accountNumber = sc.nextInt();
		
		getAccountInformation(accountName,accountNumber);
	}
	public void getAccountInformation(String name, int acNo) {
		System.out.println("\n***************Account Information**************");
		System.out.println("User Name :- "+name);
		System.out.println("Account number :- "+acNo);
	}
}
