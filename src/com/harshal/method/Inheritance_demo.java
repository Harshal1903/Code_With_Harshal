package com.harshal.method;

class Base {
	
	int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void PrintMe() {
		System.out.println("This is Base classs");
	}
	
}

class Derived extends Base {                        // Derived class is Inherited from Base class

	int y;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void PrintMe() {
		
		System.out.println("This is Derived classs");
	}
	
	
	public int sum(int x, int y) {
		return x + y;
	}
}

public class Inheritance_demo {

	public static void main(String[] args) {
		/*
		 * Base base = new Base(); 
		 * base.PrintMe();
		 * base.setX(10);
		 * System.out.println(base.getX());
		 */
				
		Derived derived = new Derived();
		derived.PrintMe();
		derived.setY(20);
		System.out.println(derived.getY());
		int add = derived.sum(60, 40);
		System.out.println("Addition : " + add);
		derived.setX(10);                               //Base class method
		System.out.println(derived.getX());

	}
}
