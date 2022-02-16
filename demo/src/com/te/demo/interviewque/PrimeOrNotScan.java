//the given number prime or not using scanner class

package com.te.demo.interviewque;

import java.util.Scanner;

public class PrimeOrNotScan {

	public static void main(String[] args) {
		Scanner str = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = str.nextInt();
		boolean isprime = false;

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isprime = false;
				break;
			} else {
				isprime = true;
			}
		}
		if (isprime) {
			System.out.println("the given number" + number + "is prime number");
		} else {
			System.out.println("the given number" + number + "is not a prime anumber");

		}
	}
}
