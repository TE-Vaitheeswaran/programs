//multiply with given index with all the index and i want max value of multiply array
// ex the 0th index multiply with all index then 2nd index its going on the end of index
package com.te.demo;

public class MultiplyArray {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,-6,7,8,-5,9};
		int max=arr[0]*arr[1];
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
			int max1=arr[i]*arr[j];
				if(max>max1){
				max=max1;
				}

			}
		}

		System.out.println(max);
	}
}
