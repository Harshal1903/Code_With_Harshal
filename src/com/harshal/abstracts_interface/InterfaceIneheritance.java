package com.harshal.abstracts_interface;

//An interface in Java is a blueprint of a class. It has static constants and abstract methods.
//It is used to achieve abstraction
//By interface, we can support the functionality of multiple inheritance
//It can be used to achieve loose coupling 

interface SampleInterface {  
	
    void meth1();
                                 //Unimplemented methods
	abstract void meth2();
}

interface ChildSampleInterface extends SampleInterface {
	
	void meth3();
	                             //Unimplemented methods
	void meth4();
}

class MySampleClass implements ChildSampleInterface {	

	@Override
	public void meth1() {
		System.out.println("Meth1");
	}

	@Override
	public void meth2() {
		System.out.println("Meth2");
	}

	@Override
	public void meth3() {
		System.out.println("Meth3");
	}

	@Override
	public void meth4() {
		System.out.println("Meth4");
	}

}

public class InterfaceIneheritance {

	public static void main(String[] args) {
		
		MySampleClass msc = new MySampleClass();
		msc.meth1();
		msc.meth2();
		msc.meth3();
		msc.meth4();

	}

}
