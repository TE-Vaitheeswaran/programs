// 2)write a program to read a string and test whether first and last cah
//    are same then return valid else not valid

package com.te.demo.string;

import java.util.Scanner;

public class UserMainCodeTest {

	public static void main(String[] args) {
		
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter the String");
		String ref=scn.next();
		
	System.out.println(UserMainCode.checkChar(ref));	
	}
}
