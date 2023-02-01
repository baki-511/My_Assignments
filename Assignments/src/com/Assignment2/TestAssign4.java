package com.Assignment2;

public class TestAssign4 {
	
	public static int getReverseNumber(int num) {
		int reverse =0;
		while(num>0) {
			int lastDigit= num%10;
			    num=num/10;
			    reverse = reverse*10+lastDigit;
		}
		return reverse;
	}
	public static void main(String[] args) {
		int num = getReverseNumber(487);
		System.out.println(num);
	}
}
