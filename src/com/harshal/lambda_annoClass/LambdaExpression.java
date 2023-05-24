package com.harshal.lambda_annoClass;

@FunctionalInterface 
interface DemoAno{

	//void meth1();
	//void meth2(int a);
	void meth3(String b);
}

public class LambdaExpression {

	public static void main(String[] args) {

		//Lambda Expression
//		DemoAno obj = ()->{
//			System.out.println("I am method from this lambda " );
//		};
//		obj.meth1();
		
//		DemoAno obj = (a)->{
//			System.out.println("I am method from this lambda : " + a);
//		};
//		obj.meth2(5);
		
		DemoAno obj = (b)->{
			System.out.println("This is this method from lambda expression : " + b);
		};
		obj.meth3("Java");
	}

}
