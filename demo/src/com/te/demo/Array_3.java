//calculate the minimum value

package com.te.demo;

public class Array_3 {

	public static void main(String[] args) {
		
		int a[] = {5,2,1,7,9};
		
		int min = a[0];
		
		for(int i = 1; i<a.length; i++) {
			if(min>a[i]) {
				min = a[i];
			}
		}
		System.out.println(min);
	}
}
