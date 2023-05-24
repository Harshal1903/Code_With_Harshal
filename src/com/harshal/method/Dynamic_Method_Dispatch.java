package com.harshal.method;

class Phone {

	public void greet() {
		System.out.println("Good Morning");
	}

	public void on() {
		System.out.println("Turning on Phone...");
	}
}

class SmartPhone extends Phone {

	public void display() {
		System.out.println("Use Made in India product");
	}

	@Override
	public void on() {
		System.out.println("Turning on Smart Phone...");
	}

}

public class Dynamic_Method_Dispatch {

	public static void main(String[] args) {

		// Phone obj = new Phone();             // Allowed
		// SmartPhone smobj = new SmartPhone(); // Allowed

		Phone obj = new SmartPhone();           // Allowed
		// SmartPhone smobj = new Phone();      // Not Allowed

		obj.greet();
		obj.on();

		/*
		 * Dynamic Method Dispatch --> Method overriding is one of the ways in which
		 * Java supports Runtime Polymorphism. Dynamic method dispatch is the mechanism
		 * by which a call to an overridden method is resolved at run time, rather than
		 * compile time.
		 * 
		 * ParentCalss pc = new ChildClass();    ie.Upcasting
		 */

	}
}
