package com.harshal.thread;

class MyThr extends Thread {

	public MyThr(String name) {
		super(name);
	}

	public void run() {
		int a = 4;
		System.out.println("Thank You");
//		while (true) {
//			System.out.println("I am a thread");
//		}
	}
}

public class Thraed_Constructor {

	public static void main(String[] args) {

		MyThr t1 = new MyThr("Harshal");
		t1.start();
		System.out.println("The id of the Thread is :" + t1.getId());
		System.out.println("The name of the Thread is :" + t1.getName());

		MyThr t2 = new MyThr("Pavan");
		System.out.println("The id of the Thread is :" + t2.getId());
		System.out.println("The name of the Thread is :" + t2.getName());
		System.out.println("The class of Thread is : "+ t2.getClass());
		System.out.println("The state of the Thread is :" + t2.getState());
		
		System.out.println("The state of the Thread is :" + t1.getState());
		
		

	}

}
