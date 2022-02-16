package com.te.demo.string;

import java.util.Scanner;

public class RevString {

	public static String getStr(String s) {
		StringBuffer sb1= new StringBuffer(s);
		StringBuffer sb2=new StringBuffer();
		String str=sb1.reverse().toString();
		for (int i = 0; i < str.length(); i++) {
			sb2.append(str.charAt(i));
			sb2.append("-");
		}
		sb2.deleteCharAt(sb2.length()-1);
		
		return sb2.toString();
		
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String org=scn.nextLine();	
		System.out.println(RevString.getStr(org));	
		
	}
}
/*
 * sample input 
 * vaithee
 *  
 * sample output 
 * e-e-h-t-i-a-v
 */
