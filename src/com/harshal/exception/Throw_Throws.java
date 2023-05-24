package com.harshal.exception;

import java.util.Scanner;

public class Throw_Throws {

	//Throw --> Java throw keyword is used to throw an exception explicitly.
	public static void validate(int age) {
		if (age < 18) {
			throw new ArithmeticException("Person is not ready for vote !!!");
		} else {
			System.out.println("Person can vote...");
	   }
	}

	// Throws --> The java throws keyword is used to declare an exception. It gives
	// an information to the programmer that there may occur an exception.
	public static double division(float a, float b) throws ArithmeticException {
		double div = a / b;
		System.out.println("Division : " + div);
		return div;
	}

	public static void main(String[] args) {

		//Method division for --> Throws
		try {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter First Number : ");
			int num1 = sc.nextInt();
			System.out.println("Enter Second Number : ");
			int num2 = sc.nextInt();

			division(num1, num2);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		//Method validate for --> Throw
		   try {
			   //validate(13);
		       validate(0);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
