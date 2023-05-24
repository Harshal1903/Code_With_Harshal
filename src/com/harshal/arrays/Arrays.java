package com.harshal.arrays;

public class Arrays {

	public static void main(String[] args) {
		
		//Array --> Collection same type of data

		// Syntax : 1
		String[] cities = { "Delhi", "Mumbai", "Lucknow", "Pune", "Chennai" };
		int[] numbers = { 25, 93, 48, 95, 74, 63, 87, 11, 36 };
		
		System.out.println(cities.length);
		System.out.println(numbers.length);

		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		System.out.println(cities[4]);
		// System.out.println(cities[5]);

		System.out.println(" ");
		System.out.println(numbers[0]);
		System.out.println(numbers[4]);
		System.out.println(numbers[8]);
		// System.out.println(numbers[9]);

		System.out.println("--------------------------------------------------------");
		
		// Syntax : 2
		String[] colors = new String[5];                        // Declaration & Memory Allocation
		
		//String[] colors;                                      //Declaration 
		//colors = new String[5];                               //Memory Allocation
		 
		colors[0] = "Green";
		colors[1] = "Red";
		colors[2] = "Yellow";
		colors[3] = "Blue";

		System.out.println(colors[0]);
		System.out.println(colors[1]);
		System.out.println(colors.length);
		
		System.out.println("--------------------------------------------------------");

		// Syntax : 3
		int[] marks = new int[] { 65, 70, 55, 80, 76, 88, 68, 72 };

		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks.length);  // 8
		System.out.println(marks[7]);

	}
}
