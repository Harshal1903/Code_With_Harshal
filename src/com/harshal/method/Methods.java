package com.harshal.method;

public class Methods {
	
	static int addition(int x, int y) {
		if (x>y) {
			int z = (x+y);
			return z;			
		}
		else {
			int z = (x+y)*5;
			return z;
		}		
	}
	
	int substraction(int x, int y) {
		if (x>y) {
			int z = (x-y);
			return z;			
		}
		else {
			int z = (x-y)*5;
			return z;
		}		
	}
     	
	public static void main(String[] args) {
		
		//Static Method --> No need to create an object while calling in main method
		int c = addition(8 ,5 );
		int c1 = addition(5, 8 );		
		System.out.println(c);
		System.out.println(c1);
		
		//Calling Method --> Use the method  
		Methods m = new Methods();
		int R = m.substraction(4, 2);
		System.out.println(R);
		System.out.println(m.substraction(8, 2));
		
		/*
		 		
		int a = 5;
		int b = 7;
		int c;
		
		if(a>b) 
		{
			c = (a+b);
		}
		else
		{
			c = (a+b)*5;
		}	
		
		System.out.println(c);
		
		*/

	}
}

