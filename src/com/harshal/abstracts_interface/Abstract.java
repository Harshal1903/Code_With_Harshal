package com.harshal.abstracts_interface;

abstract class Parent{                    // Abstract class means abstract method contained in it 
	
	public Parent() {
		System.out.println("I am parent constructor");
	}
	
	abstract public void greet();		  // Unimplemented method is known as abstract method
	
	abstract public void greet2();
}


//With the help of abstract class we can make another concrete class ie.here child & child2
class Child extends Parent {
	
	public void greet() {
		System.out.println("Good Morning");
	}
	
	public void greet2() {
		System.out.println("Good Night");
	}
	
}

//Either make class abstract or implement method which declared in parent class
abstract class Child2 extends Parent {    
	
	public void th() {
		System.out.println("Hello!!! I am Software Developer");
	}

}
public class Abstract {
	
	public static void main(String[] args) {

		//Parent p = new Parent();                  // Abstract class can not be instantiate
		
		Child c = new Child();
	
		//Child2 c1 = new Child2();                   // Abstract class can not be instantiate
	}
	
}
