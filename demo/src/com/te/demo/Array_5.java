//calculate the first 3 minimum value

package com.te.demo;

public class Array_5 {

	public static void main(String[] args) {
		
		int no[]= {6,5,4,3,2,1};
		
		int min1=no[0];
		int min2=no[1];
		int min3=no[2];
		
		for (int i = 1; i < no.length; i++) {
			if (min1>no[i]) {
				min3=min2;
				min2=min1;
				min1=no[i];
			}else if (min2>no[i]) {
				min3=min2;
				min2=no[i];
			}else if (min3>no[i]) {
				min3=no[i];
			}
		}																													
		System.out.println(min1);
		System.out.println(min2);
		System.out.println(min3);     
	}
}
