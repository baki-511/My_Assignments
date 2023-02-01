package com.Java.Assignment8;

import java.util.Scanner;

public class DriverClass {
	public static void main(String[] args) {
		EmployeeInformation emfo = new EmployeeInformation();
		Scanner scn = new Scanner(System.in);
		System.out.print("\nEnter number of Student :- ");
		int count = scn.nextInt();
		for(int i=1;i<=count;i++) {
			System.out.println("--------------Enter Student Details --------------");
			emfo.getUserInput();
		}
	}
}
