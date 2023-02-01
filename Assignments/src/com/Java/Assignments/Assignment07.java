package com.Java.Assignments;

/*Assignments 7
1. Design method to check whether the character is alphabet, digit and special symbol.
2. Design method public int getNumberCube(int num), return int value to that method and
   result should be into main method.
3. Design method to print factors of given number( Enter no = 6 then factors should be 
   displayed like 1,2,3,6.
4. Design method public int getReverseNumber(int num) which return int value to that method
   and result print into main method.
(Enter the no=125 then output will be 521
*/
public class Assignment07 {
	
	//Method to check character is alphabet, digit or special symbol
	public void checkChar() {
		char x = '8';
		if((x>=97 && x<=122) || (x>=65 && x<=90)) {
			System.out.println("Its Alphabet");
		}
		else if(x>=48 && x<=57) {
			System.out.println("Its Digit");
		}
		else {
			System.out.println("Its Special Symbol");
		}
	}
	
	//Method to return Cube Number.
	public int getCubeNumber(int num) {
		return num*num*num;
	}
	
	//Method to print Factors of Numbers
	public void printFactors(int n) {
		System.out.print("Factors of "+n+" are :- ");
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(i+", ");
			}
		}
		System.out.println();
	}
	
	//Method to return Reverse Number
	public int getReverseNumber(int num) {
		int reverse =0;
		while(num>0) {
			int lastDigit= num%10;
			    num=num/10;
			    reverse = reverse*10+lastDigit;
		}
		return reverse;
	}
	
	//Main Method
	public static void main(String[] args) {
		Assignment07 as7 = new Assignment07();
		as7.checkChar();//Check character is Alphabet, Digit Or Special Symbol
		int cubNo = 6;
		System.out.println("Cube of "+cubNo+" is "+as7.getCubeNumber(cubNo)); //Get Cube value of Number
		as7.printFactors(42);//Get factors of number
		int n= 2437;
		int Reverse = as7.getReverseNumber(n);
		System.out.println("Originnal number = "+n+"   Reversed Number = "+Reverse);
	}
}
