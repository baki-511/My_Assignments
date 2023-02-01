package com.Java.Assignments;

/*Assignments 4
1. Write the java program to design method for addition of two number 
which returns int results to that method and result should be print into main method.

2. Write the java program to design method for subtraction of two number 
which returns int value to that method and result should be print into main method.

3. Write the java program to design method for multiplication of two
 number which returns int value to that method and result should be print into main method.
 
4. Write the java program to design method for division of two number 
which returns int value to that method and result should be print into main method.

5. Write the Java Program to calculate total of five subject marks and average of it.
*/
public class Assignment04 {
	
	//Addition of two numbers
	public static int add2Num(int a, int b) {
		int sum = a+b;
		return sum;
	}
	
	//Subtraction of two numbers
	public static int sub2Num(int a, int b) {
		int sub = a-b;
		return sub;
	}
	
	//Multiplication of two numbers
	public static int multiplication(int a, int b) {
		int mul = a*b;
		return mul;
	}
	
	//Division of two numbers
	public static int divisonOfNum(int a, int b) {
		int div = a/b;
		return div;
	}
	
	//Average of Five subject marks
	public static float averageOf5Sub() {
		//Marks obtained out of 100
		int   sub1=60, sub2=68, sub3=71, sub4=84, sub5=88;
		int total= totalOf5Sub(sub1,sub2,sub3,sub4,sub5);//calling totalOf5Sub method
		float average = total/5;
		return total/5f;
	}
	
	//Addition of Five subjects marks
	public static int totalOf5Sub(int a, int b, int c, int d, int e) {
		int totalSum = a+b+c+d+e;
		return totalSum;
	}
	
	//Main method
	public static void main(String[] args) {
		int addAns = Assignment04.add2Num(10, 20);
		int subAns = Assignment04.sub2Num(50, 30);
		int mulAns = Assignment04.multiplication(40, 5);
		int divAns = Assignment04.divisonOfNum(160, 8);
		float averageAns = Assignment04.averageOf5Sub();
		
		System.out.println("Addition = "+addAns);
		System.out.println("Subtracton = "+subAns);
		System.out.println("Multiplication = "+mulAns);
		System.out.println("Divison = "+divAns);
		System.out.println("\nAverage of Five Subjects = "+averageAns);
	}

}
