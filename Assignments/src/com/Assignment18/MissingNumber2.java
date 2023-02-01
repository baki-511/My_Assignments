package com.Assignment18;

public class MissingNumber2 {
		public void findMissingNum(int[] arr) {
			int n=arr.length;
			
			for(int i=0;i<n;i++){
				if(arr[i]!=i+1) {
					System.out.print(i+1+", ");
				}
			}
		}
		public void printArr(int[] arr) {
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+", ");
			}
			System.out.println();
		}
	
		//Driver method
		public static void main(String[] args) {
			int arr[] = {1,2,3,4,9,6,7,8,9,10};
			MissingNumber2 mn = new MissingNumber2();
			System.out.print("Array elements :- ");
			mn.printArr(arr);
			System.out.print("\nMissing elements :- ");
			mn.findMissingNum(arr);
			
		}
}
