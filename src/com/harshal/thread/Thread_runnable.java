package com.harshal.thread;

// Creating Thread Using Runnable Interface

class MyThreadRunnable1 implements Runnable {

	public void run() {

		System.out.println("I am Thread1 no a threat...");
		System.out.println("I am Thread1 no a threat...");
		System.out.println("I am Thread1 no a threat...");
		System.out.println("I am Thread1 no a threat...");
		System.out.println("I am Thread1 no a threat...");
		System.out.println("I am Thread1 no a threat...");
		System.out.println("I am Thread1 no a threat...");
		System.out.println("I am Thread1 no a threat...");
		System.out.println("I am Thread1 no a threat...");
		System.out.println("I am Thread1 no a threat...");
		System.out.println("I am Thread1 no a threat...");
		System.out.println("I am Thread1 no a threat...");
		System.out.println("I am Thread1 no a threat...");
		System.out.println("I am Thread1 no a threat...");
		System.out.println("I am Thread1 no a threat...");
		System.out.println("I am Thread1 no a threat...");
		System.out.println("I am Thread1 no a threat...");
		System.out.println("I am Thread1 no a threat...");
		System.out.println("I am Thread1 no a threat...");
		System.out.println("I am Thread1 no a threat...");
		System.out.println("I am Thread1 no a threat...");
	}
}

class MyThreadRunnable2 implements Runnable {

	public void run() {
		System.out.println("I am Thread2 no a threat...");
		System.out.println("I am Thread2 no a threat...");
		System.out.println("I am Thread2 no a threat...");
		System.out.println("I am Thread2 no a threat...");
		System.out.println("I am Thread2 no a threat...");
		System.out.println("I am Thread2 no a threat...");
		System.out.println("I am Thread2 no a threat...");
		System.out.println("I am Thread2 no a threat...");
		System.out.println("I am Thread2 no a threat...");
		System.out.println("I am Thread2 no a threat...");
		System.out.println("I am Thread2 no a threat...");
		System.out.println("I am Thread2 no a threat...");
		System.out.println("I am Thread2 no a threat...");
		System.out.println("I am Thread2 no a threat...");
		System.out.println("I am Thread2 no a threat...");
		System.out.println("I am Thread2 no a threat...");
		System.out.println("I am Thread2 no a threat...");
		System.out.println("I am Thread2 no a threat...");
		System.out.println("I am Thread2 no a threat...");
		System.out.println("I am Thread2 no a threat...");
		System.out.println("I am Thread2 no a threat...");
		System.out.println("I am Thread2 no a threat...");
		System.out.println("I am Thread2 no a threat...");
		System.out.println("I am Thread2 no a threat...");
		System.out.println("I am Thread2 no a threat...");
		System.out.println("I am Thread2 no a threat...");
		System.out.println("I am Thread2 no a threat...");
	}
}

public class Thread_runnable {

	public static void main(String[] args) {

		MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
		Thread t1 = new Thread(bullet1);

		MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
		Thread t2 = new Thread(bullet2);

		t1.start();
		t2.start();

	}
}
