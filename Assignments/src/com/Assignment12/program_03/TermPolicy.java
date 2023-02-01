package com.Assignment12.program_03;

import java.util.Scanner;

public class TermPolicy extends LifeInsurance {
	int duration;
	public void getTermPolicyDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the duration :- ");
		int duration = sc.nextInt();
		
		this.duration = duration;
//		getTermPolicyInformation(duration);
	}
	public void getTermPolicyInformation() {
		System.out.println("\n***************Insurance Details***************");
		System.out.println("Policy Duration :- "+duration+" years.");
	}
}
