package com.Assignment21;

import java.util.List;
import java.util.LinkedList;
public class BaloonSort {
	public LinkedList<String> getBaloons(){
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Red");
		ll.add("Blue");
		ll.add("Green");
		ll.add("Red");
		ll.add("Blue");
		ll.add("Red");
		ll.add("Blue");
		ll.add("Green");
		
		return ll;
	}
	
	public static void main(String[] args) {
		BaloonSort baloons = new BaloonSort();
		LinkedList<String> list = baloons.getBaloons();
		System.out.println("\n***********************************");
		System.out.println("\tBefore Sorted");
		System.out.println("***********************************");
		for(String l:list) {
			System.out.print(l+", ");
		}
		
		LinkedList<String> list2 = new LinkedList<String>();
		//Sorting method
		for(String l:list) {
			if(l.equals("Red")) {
				list2.addFirst("Red");
			}
			else if(l.equals("Blue")) {
				list2.add("Blue");
			}
		}
		for(String l:list) {
			if(l.equals("Green")) {
				list2.add("Green");
			}
		}
		
		System.out.println("\n***********************************");
		System.out.println("\tAfter Sorted");
		System.out.println("***********************************");
		for(String l:list2) {
			System.out.print(l+", ");
		}
	}
	
}
