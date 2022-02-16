package com.te.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateExample {
	public static void main(String[] args) {

		// to fetch the current date
		System.out.println("to fetch the current date");
		LocalDate date = LocalDate.now();
		System.out.println(date);
		System.out.println("============================");

		// to fetch the current time
		System.out.println("to fetch the current time");
		LocalTime time = LocalTime.now();
		System.out.println(time);
		System.out.println("============================");

			// to fetch current date and time
			System.out.println("to fetch current date and time");
			LocalDateTime ldt=LocalDateTime.now();
			System.out.println(ldt);
			System.out.println("============================");
			
			// to fetch the current age
			System.out.println("to fetch age");
	        LocalDate date1 =LocalDate.of(1998, 04, 06);
			System.out.println(date.compareTo(date1));
			
	}

}
