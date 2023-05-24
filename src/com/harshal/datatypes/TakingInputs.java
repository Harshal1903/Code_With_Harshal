package com.harshal.datatypes;
import java.util.Scanner;

public class TakingInputs {
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("***** Taking Input From User *****");
		
		System.out.println("Enter 1st number : ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number : ");
		float b = sc.nextFloat();
		
		float sum = a+b;
		//float sum =  (int) (a+b);       // Valid
		//int sum =  (float) (a+b);         // Not Valid
		System.out.println("Sum =" + sum );
				
	}
}
