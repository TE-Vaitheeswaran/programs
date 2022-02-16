// 1) fetch the middle character from String

package com.te.demo.string;

public class MidChar2 {

	public static String name(String s ) {
		String str="";
		if(s.length()%2==0) {
			str=s.substring(s.length()/2-1, s.length()/2+1);
		}
		return str;
		
	}
}
