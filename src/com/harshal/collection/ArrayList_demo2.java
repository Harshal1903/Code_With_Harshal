package com.harshal.collection;

import java.util.ArrayList;

public class ArrayList_demo2 {

	public static void main(String[] args) {

		ArrayList<String> l1 = new ArrayList<>();
		ArrayList<String> l2 = new ArrayList<>();

		l1.add("Yellow");
		l1.add("Blue");
		l1.add("Green");
		l1.add("Voilet");
		l1.add("Purple");
		l1.add(2, "Red");
		l1.set(1, "White");

		l2.add("Cricket");
		l2.add("Hockey");
		l2.add("Badminton");
		l2.add("Chess");
		l2.add("Tennis");

		//l1.addAll(l2);
		//l1.addAll(2, l2);

		//System.out.println(l1);
		for (int i = 0; i < l1.size(); i++) {
			System.out.print(l1.get(i) + "   ");
		}
	}
}
