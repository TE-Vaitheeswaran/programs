//calculate the sum of array

package com.te.demo;

public class Array_1 {

	public static void main(String[] args) {
//		type1
//		int number[]= {10,20,30,340};
//		int sum = 0;
//		
//		for (int i : number) {
//			sum=sum+i;
//		}
//		System.out.println("sum of array is :"+sum);

		
		//type 2
	int no[]= {1,2,3,4,5,6};
	int sum = 0;
	 for (int i = 0; i < no.length; i++) {
		sum=sum+no[i];
	}
	
	System.out.println("sum of array is :"+sum);		
}
}