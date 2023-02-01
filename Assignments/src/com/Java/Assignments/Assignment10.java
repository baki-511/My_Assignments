package com.Java.Assignments;

import java.util.Scanner;

/*Assignment 10

1. Write Java program to check whether number is prime or not.
 ( Prime means  a number which is divisible by only two numbers: 1 and itself. 
 So, if any number is divisible by any other number, it is not a prime number.)

2. Write a java program to display the Fibonacci series up to given number. 
(Fibonacci series mean next number is the sum of previous two numbers for example 0,1,1,2,3,5,8,13,21,34,55 etc.
 If enter no as 5 then output is 0,1,1,2,3).

3. Write java program to check whether number is Armstrong or not.
(A positive number is called armstrong number if it is equal to the sum of cubes of its digits
 for example 0, 1, 153, 370, 371, 407 etc. Let's try to understand why 153 is an Armstrong number.

153 = (1*1*1)+(5*5*5)+(3*3*3)  
where:  
(1*1*1)=1  
(5*5*5)=125  
(3*3*3)=27  
So:  
1+125+27=153)*/

public class Assignment10 {
	//Check Number is Prime Number or NOT
	public void checkPrime(int n) {
		int flag=0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				flag=1;
				break;
			}
		}
		System.out.println();
		if(flag!=1 && n!=1) {
			System.out.println("It is Prime Number");
		}
		else if(flag==1 && n!=1) {
			System.out.println("It is NOT Prime Number");
		}
		else{
			System.out.println("It is composite Number");
		}
	}
	//Fibonacci Number
	public void fibonacciNum(int n) {
		int f1=0,f2=1,count=2;
		System.out.println();
		if(n==1)
			System.out.println(f1);
		if(n==2)
			System.out.println(f1+", "+f2);
		
		if(n>=3) {
			System.out.print(f1+", "+f2+", ");
			while(count<n) {
				int f3=f1+f2;  
				System.out.print(f3+", ");
				f1=f2;
				f2=f3;
				count++;
			}
			System.out.println();
		}
	}
	//check Armstrong OR NOT
	public void checkArmstrongNum(int n) {//153
		int armNum=0;
		int originalNum=n;//153
		System.out.println("Original Num = "+originalNum);
		while(n>0) {
			int d=n%10;
			n=n/10;
			armNum=armNum+(d*d*d);
		}
		//System.out.println("Armstrong = "+armNum);
		if(armNum==originalNum) {
			System.out.println("It is Armstrong Number.");
		}
		else {
			System.out.println("It is NOT Armstrong Number.");
		}
	}
	public void selectMethod(int select) {
		
		Assignment10 sc10= new Assignment10();
		switch(select) {
		case 1:
			sc10.checkPrime(scannerMethod());
			break;
		case 2:
			sc10.fibonacciNum(scannerMethod());
			break;
		case 3:
			sc10.checkArmstrongNum(scannerMethod());
			break;
		default:
			System.out.println("Invalid Input");
				
		}
	}
	public void makeChoice() {
		System.out.println("\n************Welcome To Programming***********");
		System.out.println("\nPress 1 :- For Check Number is Prime Number Or NOT");
		System.out.println("Press 2 :- For Print Fibonacci Series");
		System.out.println("Press 3 :- Forr Check Number is Armstrontg or NOT");
		
		Scanner sc = new Scanner(System.in);
		Assignment10 obj = new Assignment10();
		System.out.print("\nEnter Your Choice :- ");
		obj.selectMethod(sc.nextInt());
	}
	
	public static int scannerMethod() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the Number : ");
		int num=sc.nextInt();
		return num;
	}
	public static void main(String[] args) {
		Assignment10 as10 = new Assignment10();
		Scanner whileScan = new Scanner(System.in);
		int choice = 3;
		//as10.makeChoice();
		while(choice!=0) {
			as10.makeChoice();
			System.out.print("\nTo Continue Press [Any Key] OR Exit Press [0] :- ");
			choice = whileScan.nextInt();
		}
		System.out.println("\n**************Thank You*******************");
	}
}
