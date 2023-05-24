package com.harshal.collection;

import java.util.*;

public class ArrayList_demo {

	public static void main(String[] args) {

		ArrayList<Integer> l1 = new ArrayList<>();
		ArrayList<Integer> l2 = new ArrayList<>();

		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(60);
		l1.add(1, 200);
		l1.add(4, 400);
		// System.out.println(l1.indexOf(40));
		// l1.clear();
		// System.out.println(l1.isEmpty());

		l2.add(1000);
		l2.add(2000);
		l2.add(3000);
		l2.add(4000);
		l2.add(5000);
		// l2.add(4, 999);
		// l1.addAll(l2);
		// l1.addAll(3, l2);

		// System.out.println(l1);
		// System.out.println(l1.get(4));

		for (int i = 0; i < l1.size(); i++) {
			System.out.print(l1.get(i) + "   ");
		}	
		
	}
}
