package com.te.designpatterns.creational;

public class MathOperationsSingleton {

	//step 1 the constructor must be private
	private MathOperationsSingleton() {}
	
	//step 2 
	 static MathOperationsSingleton mathOperations = null;
	
	 //step 3 the method should be public static and return type is object 
	public static MathOperationsSingleton getMathObejct() {
		if (mathOperations == null) {
			mathOperations = new MathOperationsSingleton();
		}
		return  mathOperations;
	}
	
	
	
	public void add(int a ,int b) {
		System.out.println(a+b);
	}
	
	public void substract(int a , int b) {
		System.out.println(a-b);
	}
}
