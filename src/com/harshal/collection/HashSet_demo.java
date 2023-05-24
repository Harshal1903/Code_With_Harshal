package com.harshal.collection;

import java.util.HashSet;

public class HashSet_demo {

	public static void main(String[] args) { 
		HashSet<Integer> h1 = new HashSet<>(6, 5f); 
		h1.add(12);
		h1.add(45);
		h1.add(25);
		h1.add(36);
		h1.add(50);
		h1.add(75);
		
		System.out.println(h1);
		System.out.println(h1.contains(50));
	}

}
