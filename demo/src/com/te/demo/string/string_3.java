//
package com.te.demo.string;

public class string_3 {

	public static void main(String[] args) {

		String str = "aabbccc";
		char arr[]=str.toCharArray();

		String res1 = "";
		String res2 = "";
		String res3 = "";
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]=='a') {
				res1=res1+arr[i];
			}
			if(arr[i]=='b') {
				res2=res2+arr[i];
			}
			if(arr[i]=='c') {
				res3=res3+arr[i];
			}
		}
		
		System.out.println(res1);//aa
		System.out.println(res2);//bb
		System.out.println(res3);//cc
	}
}

//answer;
//aa
//bb
//cc
