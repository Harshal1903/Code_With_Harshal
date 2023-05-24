package com.harshal.date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Java_TimeAPI {

	public static void main(String[] args) {

		LocalDate d = LocalDate.now();
		System.out.println(d);
		
		LocalTime t = LocalTime.now();
		System.out.println(t);
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		//This is date formatter
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/mm/yyyy");
		String myDate = dt.format(dtf);
		System.out.println(myDate);
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy-mm-dd");
		String myDate2 = dt.format(dtf2);
		System.out.println(myDate2);
		
		DateTimeFormatter dtf3 = DateTimeFormatter.ISO_LOCAL_DATE;
		String myDate3 = dt.format(dtf3);
		System.out.println("Local Date : " + myDate3);

	}
}
