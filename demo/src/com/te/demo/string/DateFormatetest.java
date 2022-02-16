package com.te.demo.string;

import java.util.Scanner;

public class DateFormatetest {
public static void main(String[] args) {
	
	Scanner scn= new Scanner(System.in);
	System.out.println("Enter the day");
	int d=scn.nextInt();
	
	System.out.println("Enter the month");
	int m=scn.nextInt();
	
	System.out.println("Enter the year");
	int y=scn.nextInt();
	
	System.out.println(DateFormate.date(d, m, y));
}
}
