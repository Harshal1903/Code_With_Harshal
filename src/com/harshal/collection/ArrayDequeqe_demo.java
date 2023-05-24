package com.harshal.collection;

import java.util.ArrayDeque;

public class ArrayDequeqe_demo {

	public static void main(String[] args) {

		ArrayDeque<Integer> ad1 = new ArrayDeque<>();
		ad1.add(40);
		ad1.add(25);
		ad1.add(45);
		ad1.add(60);
		ad1.add(75);
		ad1.add(90);
		
		System.out.println(ad1);
		System.out.println(ad1.getFirst());
		System.out.println(ad1.getLast());
		System.out.println(ad1.contains(60));
		System.out.println(ad1.isEmpty());
		System.out.println(ad1.removeLast());
		System.out.println(ad1);
		
	}
}
