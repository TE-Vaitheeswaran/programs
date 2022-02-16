// 2) check given string palindrom or not

package com.te.allstatecompany;

import java.util.Scanner;

public class PlaindromString {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the word");
		String str = scn.next();
		String orgstr = str;
		String rev = "";
		int len = str.length();

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (rev.equals(orgstr)) {
			System.out.println("the given string is palindrom");
		} else {
			System.out.println("the given string is not a palindrom");
		}
	}
}
