package com.Java.Assignments;

/*Assignments-5
1.write a program to check the number is positive or negative.
2.write a program  to check whether  year is leap year or not. (If else stmt).
3.write a program to find out maximum number among three number(if else if ladder statement)
4.Write a program to print month of year. Case 1 January case 2 February case n....use switch case
5. Write a program to check whether number is even or odd.
6. Write the program to check whether the no is greater than 100.
7.  Write the program to print the square of any number.
8. Write a program to swap the two numbers.
*/
public class Assignment05 {

	// Method to check number is positive or negative.
	public static void checkPosOrNeg(int num) {
		if (num > 0) {
			System.out.println("Positive Number");
		} else if (num < 0) {
			System.out.println("Negative Number");
		} else {
			System.out.println("Zero");
		}
		return;
	}

	// Method to check Leap year or Not
	public static void checkLeap(int year) {
		if ((year % 100 == 0)) {
			if (year % 400 == 0) {
				System.out.println("Its Leap year");
			} else {
				System.out.println("It is Not Leap year");
			}
		} else {
			if ((year % 4) == 0) {// 2024
				System.out.println("Its Leap year");
			} else {
				System.out.println("It is Not Leap year");
			}
		}
		return;
	}

	// Method to return maximum number among three
	public static int maxNum(int a, int b, int c) {
		if ((a > b) && (a > c)) {
			return a;
		} else if ((a > b) && (a < c)) {
			return c;
		} else if ((b > c) && (b > a)) {
			return b;
		} else if ((b > c) && (b < a)) {
			return a;
		} else {
			return -1;
		}
	}

	// Method to print month name using Switch case statement
	public static void printMonth(int input) {
		switch (input) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;

		default:
			System.out.println("Invalid Input");
		}
		return;
	}

	// Method to check it is Even or Odd
	public static void checkEvenOrOdd(int num) {
		if ((num % 2) == 0) {
			System.out.println("It is Even Number");
		} else {
			System.out.println("It is Odd Number");
		}
		return;
	}

	// Method to check number is greater than 100
	public static void checkNum(int num) {
		if (num > 100) {
			System.out.println("It is Greater than 100");
		} else {
			System.out.println("It is NOT Greater than 100");
		}
		return;
	}

	// Method to return square of Number
	public static int squareNum(int num) {
		return num * num;
	}

	// Method to swap number
	public static void swapNum(int a, int b) {//(a=10,b=20)
		System.out.println("\nBefore swapping :- a = " + a + " b = " + b);
		int temp = a; //temp=10
		a = b;//a=20
		b = temp;//b=10
		System.out.println("After swapping :-  a = " + a + " b = " + b);
		return;
	}

	// Main Method
	public static void main(String[] args) {

		Assignment05.checkPosOrNeg(-20);// check no. positive or negative
		Assignment05.checkLeap(1900);// check year is leap year or Not
		int maxVal = Assignment05.maxNum(10, 30, 20);
		if(maxVal== -1) {
			System.out.println("Three values are Equals");
		}else {
			System.out.println("Max Number among (10,30,20) is "+maxVal);
		}
		Assignment05.printMonth(10);// Print the month
		Assignment05.checkEvenOrOdd(38);// Check number is Even Or Odd
		Assignment05.checkNum(400);// Check number is Greater than 100 or Not
		System.out.println("Square of 5 = " + Assignment05.squareNum(5));// Return square of number
		Assignment05.swapNum(20, 40);// Swapping two numbers

	}
}
