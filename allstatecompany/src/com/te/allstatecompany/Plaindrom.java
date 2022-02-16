// 1) check wheter the given number palindrom or not

package com.te.allstatecompany;

import java.util.Scanner;

public class Plaindrom {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the String");
		int no=scn.nextInt();
		
		int no1 = no;
		int rem = 0;

		while (no > 0) {
			rem = (rem * 10) + (no % 10);
			no= no / 10;
		}
		if (rem == no1) {
			System.out.println("The given number is palindrom");
		} else {
			System.out.println("The given number is not a palindrom");
		}

	}

}
