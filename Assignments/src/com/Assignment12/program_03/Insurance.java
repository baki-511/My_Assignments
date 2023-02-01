package com.Assignment12.program_03;

import java.util.Scanner;

public class Insurance {
	int id;
	String personName;
	String insuranceCompany;
	
	public void getInsuranceDetails() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Your Name :- ");
		String personName = sc.nextLine();
		
		System.out.print("Enter Company Name :- ");
		String insuranceCompany = sc.nextLine();
		
		System.out.print("Enter Your Id :- ");
		int id = sc.nextInt();
		
		this.id = id;
		this.personName = personName;
		this.insuranceCompany = insuranceCompany;
		
		//getInsuranceInformation(id, personName, insuranceCompany);
	}
	
	public void getInsuranceInformation() {
		System.out.println("\n**************User Information************");
		System.out.println("\nInsurance User Id No :- "+id);
		System.out.println("User Name :- "+personName);
		System.out.println("Insurance Company Name :- "+insuranceCompany);
		
	}
}
