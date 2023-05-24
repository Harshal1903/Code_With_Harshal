package com.harshal.lambda_annoClass;

import java.util.ArrayList;
import java.util.Scanner;

public class Generic_demo {
	
	public static void main(String[] args) {
		//ArrayList ar = new ArrayList();
		ArrayList<Integer> ar = new ArrayList();
		//ar.add("str");
		ar.add(54);
		ar.add(981);
		ar.add(40);
		//ar.add(new Scanner(System.in));
		
		int a = ar.get(2);
		//int a = (int) ar.get(2);
		System.out.println(a);

	}
}
