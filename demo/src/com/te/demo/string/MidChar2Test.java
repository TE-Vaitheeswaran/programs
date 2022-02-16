// 1)fetch the middle character from String

package com.te.demo.string;

import java.util.Scanner;

public class MidChar2Test {

	public static void main(String[] args) {
		
	
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter the name");
		String str= scn.next();	
		
		System.out.println(MidChar2.name(str));
	
		
	}
}
