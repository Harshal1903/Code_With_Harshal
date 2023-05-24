package com.harshal.date_time;

import java.util.Date;

public class DateClass_demo {

	public static void main(String[] args) {

		Date d = new Date();
		
		System.out.println(d);
		System.out.println(d.getTime());     // returns milliseconds
		System.out.println(d.getDay());
		System.out.println(d.getYear());     //count from 1900 in java
		System.out.println(d.getSeconds());  //count with current minute 
		System.out.println(d.getHours());    //count from 12.00 mid night

	}
}
