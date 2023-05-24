package com.harshal.datatypes;

import java.util.Scanner;

public class PercentageStudent {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("********* Student Percentage Calculation ***********\n");
		
		System.out.println("Enter first subject marks : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter second subject marks : ");
		int num2 = sc.nextInt();
		
		System.out.println("Enter third subject marks : ");
		int num3 = sc.nextInt();
		
		System.out.println("Enter fourth subject marks : ");
		int num4 = sc.nextInt();
		
		System.out.println("Enter fifth subject marks : ");
		int num5 = sc.nextInt();
		
		int sum = (num1+num2+num3+num4+num5);
		System.out.println("Total marks obatained by student : "+sum+"/500");
		
		float percentage = (sum*100)/500 ;
		
		System.out.println("Percenatge of Student : "+ percentage+"%");
		
	}	
}
