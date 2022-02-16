
//calculate maximum array
package com.te.demo;

public class Array_2 {

	public static void main(String[] args) {
		
		int []name = {10,5,23,45,68,4};
		int max=name[0];
		
		for(int i=1 ; i<name.length ; i++){
			if(max<name[i]) {
				max=name[i];
			}
			
		}
		System.out.println(max);
	}
}
