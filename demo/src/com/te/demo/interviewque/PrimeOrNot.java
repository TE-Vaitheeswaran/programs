//the given number prime or not

package com.te.demo.interviewque;

public class PrimeOrNot {

	public static void main(String[] args) {

		int no =7;
		boolean isprime = false;

		for (int i = 2; i < no; i++) {
			if (no % i == 0) {
				isprime = false;
				break;

			} else {
				isprime = true;

			}

		}
		if (isprime) {
			System.out.println("the given number " + no + "is prime ");
		} else {
			System.out.println("the given number " + no + "is not a prime ");
		}
	}
}