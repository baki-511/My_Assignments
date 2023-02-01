package com.Assignment12.program_03;

public class DriverClass {
	public static void main(String[] args) {
		TermPolicy tp = new TermPolicy();
		//Get User Details
		tp.getInsuranceDetails();
		tp.getLifeInsuranceDetails();
		tp.getTermPolicyDetails();
		
		//Print Details
		tp.getInsuranceInformation();
		tp.getLifeInsuranceInformation();
		tp.getTermPolicyInformation();
	}
}
