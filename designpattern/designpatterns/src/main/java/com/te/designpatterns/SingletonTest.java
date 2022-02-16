package com.te.designpatterns;

import com.te.designpatterns.creational.MathOperationsSingleton;

public class SingletonTest {

	public static void main(String[] args) {

		MathOperationsSingleton operation1 = MathOperationsSingleton.getMathObejct();
		System.out.println("Hash Code of Operation1 "+ operation1.hashCode());
		
		MathOperationsSingleton operation2 = MathOperationsSingleton.getMathObejct();
		System.out.println("Hash Code of Operation2 "+ operation2.hashCode());
		
		MathOperationsSingleton operation3 = MathOperationsSingleton.getMathObejct();
		System.out.println("Hash Code of Operation3 "+ operation3.hashCode());
	}
}
