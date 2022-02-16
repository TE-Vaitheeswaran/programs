//calculate how many no of time each number is present in given array

package com.te.demo;

public class Array_6 {

	public static void main(String[] args) {
		
		int arr[] = {5,6,3,5,5,6,3,3,1,1};
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			int count = 1 ;
			for (int j = i+1; j < n; j++) {
				if (arr[i] == arr[j]) {
																																																																																																																																																																																																																																																																																																																																																																																																																																																																		count ++;
					for (int k = j; k < n-1; k++) {
						arr[k] = arr[k+1];
					}
				//	count++;
					j--;
					n--;
				}
			}
			System.out.println(arr[i] + "is occurences" + count); 
			
		}
		
}
}                         
//AnS:
//5is occurences3
//6is occurences2
//3is occurences3
//1is occurences2


