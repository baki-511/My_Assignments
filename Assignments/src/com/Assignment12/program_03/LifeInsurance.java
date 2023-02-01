package com.Assignment12.program_03;

import java.util.Scanner;

public class LifeInsurance extends Insurance {
	int premiumAmount;
	public void getLifeInsuranceDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Premium Amount :- Rs.");
		int premiumAmount = sc.nextInt();
		this.premiumAmount = premiumAmount;
		//getLifeInsuranceInformation(premiumAmount);
	}
	public void getLifeInsuranceInformation() {
		System.out.println("\n***********Premium Amount Details************");
		System.out.println("Premium Amout is Rs. "+premiumAmount);
	}
}
