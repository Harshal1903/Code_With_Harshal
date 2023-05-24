package com.harshal.thread;

class MyThread extends Thread {

	public MyThread(String name) {
		super(name);
	}

	public void run() {
		int a = 4;
		while (true) {
			//System.out.println("I am a thread");
			System.out.println("Thank You" + this.getName());

		}
	}
}

public class Thread_Priority {

	public static void main(String[] args) {

		MyThread t1 = new MyThread(" Amar (less Important)");
		MyThread t2 = new MyThread(" Pavan");
		MyThread t3 = new MyThread(" Pushpak");
		MyThread t4 = new MyThread(" Rahul");
		MyThread t5 = new MyThread(" Harshal (Most Important)");
		
		t5.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

	}
}
