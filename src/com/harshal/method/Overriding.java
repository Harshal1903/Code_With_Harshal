package com.harshal.method;

//Method Overriding --> The method implements in child class is already exist in parent class

class A {

	public int sum() {
		System.out.println("This is sum method");
		return 100;
	}

	public void meth2() {
		System.out.println("I am meth 2 in class A ");
	}
}

class B extends A {
	// @ Override --> This annotation just shows method is overridden. Notation is
	// not compulsory but recommended
	@Override
	public void meth2() {
		System.out.println("I am meth 2 in class B ");
	}

	public void meth3() {
		System.out.println("I am meth 3 in class B");
	}
}

public class Overriding {

	public static void main(String[] args) {
		A a = new A();
		a.meth2();

		B b = new B();
		b.meth2();

	}
}
