package com.harshal.method;

class Base1{
	
	public Base1() {
		System.out.println("I am base class constructor");
	}
	public Base1(int x) {
		System.out.println("I am overloaded base class constructor with value x:" + x);
	}
}

class Derived1 extends Base1 {
	
	public Derived1() {
		//super(5);
		System.out.println("I am derived class constructor");
	}
	
	public Derived1(int x, int y) {
		//super(x);
		super(40);
		System.out.println("I am overloaded derived class constructor with values x:"+x +" y:"+y);
	}
	
}

class ChildOfDerived extends Derived1{
	
	public ChildOfDerived() {
		System.out.println("I am childOfDerived class constructor");
	}
	
	public ChildOfDerived(int x, int y, int z) {
		//super();
		super(3,2);
		//super(x,y);
		System.out.println("I am overloaded childOfDerived class constructor with x:"+x+ " y:"+y+" z:"+z);
	}
	
}

public class ConstructerDemo_Inheritance {
	
	public static void main(String[] args) {
		
		//Base1 b = new Base1();
		//Base1 b1 = new Base1(200);
		//Derived1 d = new Derived1();
		//Derived1 d = new Derived1(8,5);
		//ChildOfDerived c = new ChildOfDerived();
		ChildOfDerived c = new ChildOfDerived(5,10,15);
	}

}
