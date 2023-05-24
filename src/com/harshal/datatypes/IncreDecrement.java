package com.harshal.datatypes;

public class IncreDecrement {

	public static void main(String[] args) {

		// Increment Operataor
		System.out.println("***Increment Operataor***");
		int a = 20;

		System.out.println(a++);
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a);

		// Decrement Operator
		System.out.println("***Decrement Operataor***");
		int b = 50;

		System.out.println(b--);
		System.out.println(b);
		System.out.println(--b);
		System.out.println(b);
		
		System.out.println("***Calculation***");
		int c = 10;
		int eq1 = ++c * 5;
		System.out.println(eq1);
		
		int d = 5;
		int eq2 = d++ * 5;
		System.out.println(eq2);
		
	}

}
