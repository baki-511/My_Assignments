package com.Assignment2;

import java.util.Scanner;

public class SecondQn {
	
	//Addition Method
	public void addNum(int a, int b) {
		int c = a+b;
		System.out.println("Sum = "+c);
	}
	//Subtraction Method
	public void subtraction(int a, int b) {
		if(a<b)
			System.out.println("Can't subtract");
		else
			System.out.println("Sub = "+(a-b));
	}
	//Multiplication Method
	public void mulNum(int a, int b) {
		int mul = a*b;
		System.out.println("Multiplication = "+mul);
	}
	//Division Method
	public void divNum(int a, int b) {
		if(a<b)
			System.out.println("Can't divide ");
		else
			System.out.println("Divison = "+(a/b));
	}
	//Input the values and Operation 
	public void scanInt() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the operation you Want to perform :- ");
		int op = sc.nextInt();
		
			System.out.print("\nEnter the first number :- ");
			int a = sc.nextInt();
			System.out.print("Enter the second number :- ");
			int b = sc.nextInt();
			
			selectOp(op,a,b);
		
		
	}
	//Selection of operation
	public void selectOp(int op, int a, int b) {
		switch(op) {
		case 1: 
			addNum(a,b);
			break;
		case 2:
			subtraction(a, b);
			break;
		case 3:
			mulNum(a,b);
			break;
		case 4:
			divNum(a,b);
			break;
		default:
			System.out.println("NO Input");
			break;
		}
	}

	//Main Method
	public static void main(String[] args) {
		
		System.out.println("Choose the Operation to perform :- ");
		System.out.println("1) Addition ");
		System.out.println("2) Subtraction ");
		System.out.println("3) Multiplication ");
		System.out.println("4) Divison");
		SecondQn obj = new SecondQn();
		obj.scanInt();
	}
}
