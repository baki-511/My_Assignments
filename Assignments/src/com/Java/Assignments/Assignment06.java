package com.Java.Assignments;

/*Assignments-6
1.write a program to print 25 to 50 numbers using while loop.
2. Design method void multiplication (int no) and 
   print the multiplication table. ( Example enter the no=5 then output like 5*1=5.......5*10=50)
3.write a program  to print all even number from 50 to 75.
4. Design method int factorial(int no)  which returns int value to that method.
  print the results into main method (Example enter no as 5, factorial means 5*4*3*2*1 then output is 120)
*/


public class Assignment06 {
	//Method to print number between 25 to 50
	public void printVal() {
		int a=25;
		System.out.println("Printing all Numbers between 25 to 50 :- ");
		while(a<=50) {
			System.out.println(a);
			a++;
		}
		return;
	}
	
	//Method to print table
	public void multiplication(int no) {
		System.out.println("Printing table of given number :- ");
		for(int i=1;i<=10;i++) {
			System.out.println(no+" X "+i+" = "+(no*i));
		}
		return;
	}
	
	//Method to print all even number from 50 to 75
	public void printEvenNo(int start, int end) {
		System.out.println("Printing even number between 50 to 75 :- ");
		for(int i=start;i<=end;i++) {
			if((i%2)==0) {
				System.out.println(i);
			}
		}
	}
	
	//Method to return factorial number eg. factorial of 5 = 120
	public int factorial(int no) {
		int num = 1;
		for(int i=1;i<=no;i++) {
			num = num*i;
		}
		return num;
	}
	
	//Main Method
	public static void main(String[] args) {
		Assignment06 obj = new Assignment06();
		obj.printVal();
		obj.multiplication(5);
		obj.printEvenNo(50, 75);
		int result = obj.factorial(5);
		System.out.println("Factorial of 5 = "+result);
	}
}
