package com.Assignment18;


/*Assignments 18
1. Suppose You have given an integer array containing 1 to n but one of the number from 1 to n 
in the array is missing. You need to provide optimum solution to find the missing number. Number 
can not be repeated in the array.*/


public class MissingNumber {
	//Printing missing elements
	public void findMissingNumbers(int[] arr) {
		int n = arr.length;
		int max = findMaxNum(arr);
		int temp[] = new int[max];
		for(int i=0;i<n;i++) {
			temp[i]=arr[i];
		}
		for(int i=0;i<max;i++) {
			if(temp[i]!= i+1) {
				System.out.print(i+1+" ");
			}
		}
	}
	//find maximum element
	public int findMaxNum(int[] arr) {
		int max=arr[0];
		int n=arr.length;
		for(int i=0; i<n;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		return max;
	}
	//method to print Array 
	public void printArrr(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	//Driver method
	public static void main(String[] args) {
		int arr[] = {1,2,10,4,9,6,7,8,9,6};
		MissingNumber mn = new MissingNumber();
		System.out.print("Array elements :- ");
		mn.printArrr(arr);
		System.out.print("\nMissing elements :- ");
		mn.findMissingNumbers(arr);
		
	}
}
