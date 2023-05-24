package com.harshal.method;

public class Overloading {

	// Method Overloading --> If a class has multiple methods having same name but different in parameters
	public int sum(int a, int b) {
		return a + b;
	}

	public int sum(int a, int b, int c) {
		return a + b + c;
	}

	public float sum(float a, float b) {
		return a + b;
	}

	public float sum(int a, int b, float c, float e) {
		return a + e;
	}

	// Non-Static Method
	public void sum() {
		System.out.println("Method Overloading :");
	}

	public String sum(String n) {
		return n;
	}

	// Static Method
	public static void name() {
		System.out.println("XYZ");
	}

	public static void Details(String name, int id) {
		System.out.println("Welcome " + name);
		System.out.println("Your registration Id is :" + id);
	}

	public static void main(String[] args) {

		Overloading ol = new Overloading();

		ol.sum();
		System.out.println(ol.sum("We are learning Java \nSummation"));
		System.out.println(ol.sum(10, 20));
		System.out.println(ol.sum(400, 20, 40));
		System.out.println(ol.sum(50, 80));
		System.out.println(ol.sum(20, 30, 15, 35));

		// Static method no need to create an object whenever call in main method
		name();
		Details("Harshal", 101);

	}
}
