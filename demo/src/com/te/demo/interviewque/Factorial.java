//factorial  number of given number

package com.te.demo.interviewque;

public class Factorial {

	public static void main(String[] args) {
		int no=10;
		int fact=1;
		
		for(int i=no; i>=1; i-- ) {
			fact=fact*i;
		}
		System.out.println("the factorial of "+no+" is :"+fact);
	}
}
