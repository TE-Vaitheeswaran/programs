// 2)write a program to read a string and test whether first and last cah
//    are same then return valid else not valid


package com.te.demo.string;


public class UserMainCode {

	public static String checkChar(String str) {
		
		if(str.charAt(0) == str.charAt(str.length()-1)) {
			return "valid";
		}
		return "notvalid";
	}
}
