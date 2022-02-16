package com.te.demo;

public class ex {

	public static void main(String[] args) {

		String str ="hi this is cpu";
		char[] ch=str.toCharArray();
		String result="";
		for(int i=0; i<ch.length; i++) {
			String word="";
			while(i<ch.length && i!=' ') {
				word=ch[i] + word;
				i++;
			}
			result=word+result;
		}
			System.out.println(result);
	}
}