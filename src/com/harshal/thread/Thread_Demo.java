package com.harshal.thread;

           //Creating thread using Extending the thread class
class MyThread1 extends Thread {
	@Override
	public void run() {
		int i=0;
		while (1<400) {
			System.out.println("My Cooking Thread is Running...");
			System.out.println("I am Happy");
			i++;
		}
	}
}

class MyThread2 extends Thread {
	@Override
	public void run() {
		int i=0;
		while (1<400) {
			System.out.println("Thread2 is chatting with her...");
			System.out.println("I am sad");
			i++;
		}
	}
}

public class Thread_Demo {

	public static void main(String[] args) {

		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		
		t1.start();
		t2.start();

	}

}
