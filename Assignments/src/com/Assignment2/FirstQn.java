package com.Assignment2;

public class FirstQn {
	public static int maxValue(int[] numbers, int arraySize) {
		if(arraySize==0) {
			return numbers[0];
		}else {
			int max = maxValue(numbers, arraySize-1);
			if(max>numbers[arraySize-1]) {
				return max;
			}else {
				return numbers[arraySize-1];
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {9,15,6,8};
		int len = arr.length;
		int max = maxValue(arr,len);
		System.out.println(max);
	}
}
