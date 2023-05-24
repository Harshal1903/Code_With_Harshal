package com.harshal.lambda_annoClass;

interface DemoAnon {
	
	void meth1();
	void meth2();
	
}

class AnonyDemo implements DemoAnon {

	@Override
	public void meth1() {

		System.out.println("I am meth1");
	}

	@Override
	public void meth2() {
		System.out.println("I am meth2");

	}

}

public class AnonymousClass {

	public static void main(String[] args) {

//		AnonyDemo obj = new AnonyDemo();
//		obj.meth1();

		// Anonymous Class
		DemoAnon obj1 = new DemoAnon() {

			@Override
			public void meth1() {
				System.out.println("This is meth1 in anonymous class");
			}

			@Override
			public void meth2() {
				System.out.println("This is meth2 in anonymous class");

			}

		};
		obj1.meth1();
	}

}
