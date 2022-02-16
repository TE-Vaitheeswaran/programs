//first 10 fibanocci series
package com.te.demo.interviewque;

public class Fibanocci {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		for(int i=0;i<10;i++) {
			System.out.println(b);
			int c=a+b;
			a=b;
			b=c;
		}
		
	}
}
