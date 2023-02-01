package com.Assignment16;

import java.util.Scanner;

public class MainProduct {
	public static void main(String[] args) {
		Product product = new Product();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Weight of the Product :- ");
		int weight = sc.nextInt();
		
//		product.productCheck(weight);
		
		try {
			product.productCheck(weight);
		}catch(ProductException pe) {
//			System.out.println(pe.getMessage());
			pe.printStackTrace();
			
		}
		System.out.println("Exception is handled....");
	}
}
