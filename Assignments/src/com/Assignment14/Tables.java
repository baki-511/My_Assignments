package com.Assignment14;

public class Tables {
	public void multiplicationTable() {
		
		for(int i=1;i<=10;i++) {
			for(int j=2;j<=20;j++) {
				System.out.print((j*i)+"\t");
			}
			System.out.println();
		}
	}
	public void multiplicationTable2() {
		for(int i=2;i<=20;i++) {
			for(int j=1;j<=10;j++) {
				System.out.print((i*j)+"\t");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Tables t =new Tables();
		System.out.println("******************************** MULTIPLICATION TABLES*****************************");
		t.multiplicationTable();
//		t.multiplicationTable2();
	}
}
