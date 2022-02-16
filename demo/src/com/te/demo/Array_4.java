//calculate the first two max values

package com.te.demo;

public class Array_4 {

	public static void main(String[] args) {
		
//		int num[] = {45,32,6,76,23,7,6,43,5};
//		
//		int max1 = num[0];
//		int max2 = num[1];
//		
//		for(int i=1; i<num.length; i++ ) {
//			if(max1<num[i]) {
//				max2=max1;
//				max1=num[i];
//			}
//			else if(max2<num[i]) {
//				max2=num[i];
//			}
//		}
//		System.out.println(max1);
//		System.out.println(max2);
		
		
		int no[]= {43,5,2,55,23,3};
		int max1=no[0];
		int max2 =no[1];
		
		for (int i = 1; i < no.length; i++) {
			if(max1<no[i]) {
				max2=max1;
				max1=no[i];
			}else if(max2<no[i]){
				max2=no[i];
			}
		}
		System.out.println(max2);
	}
}
