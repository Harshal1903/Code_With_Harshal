package com.harshal.thread;

class MyThreadOne extends Thread {

	public void run() {
		int a = 4;
		while (true) {
			System.out.println("Welcome");
		}
	}
}

class MyThreadTwo extends Thread {

	public void run() {
		int a = 4;
		while (true) {
			System.out.println("Thank You");
		}
	}
}

public class Thread_Method {

	public static void main(String[] args) {

		MyThreadOne t1 = new MyThreadOne();
		MyThreadTwo t2 = new MyThreadTwo();

		t1.start();
		t2.start();
		
		try {
			
			t1.join();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
