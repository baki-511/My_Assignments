package com.Assignment13;

import java.util.Scanner;

public class AccountImpl implements Details {

	@Override
	public void getSavingAccount() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Name :- ");
		String name = sc.next();
		
		System.out.print("Enter the Balance :- ");
		float balance = sc.nextFloat();
		
		getUserDetails(name, balance);
		
	}

	@Override
	public void getUserDetails(String name, float balance) {
		System.out.println("\n*************Account Details**************");
		System.out.println("Ac. Holder Name :- "+name);
		System.out.println("Account Balance :- "+balance);
	
		
	}
//	public void getSavingAccount() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the Name :- ");
//		String name = sc.next();
//		
//		System.out.println("Enter the Balance :- ");
//		float balance = sc.nextFloat();
//		
//		getUserDetails(name, balance);
//	}
//	public void getUserDetails(String name, float balance) {
//		System.out.println("*************Account Details**************");
//		System.out.println("Ac. Holder Name :- "+name);
//		System.out.println("Account Balance :- "+balance);
	
//	}
	
	
}
