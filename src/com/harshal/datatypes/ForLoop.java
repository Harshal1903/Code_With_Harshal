package com.harshal.datatypes;

public class ForLoop {

	public static void main(String[] args) {
		
		//incrementing loop 		
		int n = 5;
		for (int i = 0; i < n; i++) {

			System.out.println(2*i);         //Printing even numbers in incre
			//System.out.println(2*i+1);     //Printing odd numbers in incre
		}
		
		System.out.println(" ");
		
		//Decrementing loop 
		for (int i = 5; i > 0; i--) {

			System.out.println(i);
		}
	}
}
