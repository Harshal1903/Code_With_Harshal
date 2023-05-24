package com.harshal.method;

class Animal {
	
	String name;
	public void walk() {
		System.out.println("Animal is walking...");
	}
}

class Dog extends Animal {

	public void display() {
		//this.name = name;
		System.out.println("My name is " + name);
	}
	
	public void eat() {
		//this.name = name; 
		System.out.println(name + " is eating meat");
	}
}

public class Inheritance_QUE {

	public static void main(String[] args) {
/*
		Animal animal = new Animal();
		animal.walk();
*/
		
		Dog d = new Dog();
		d.name = "Rohu";
		d.display();
		d.eat();
		d.walk();
	}

}
