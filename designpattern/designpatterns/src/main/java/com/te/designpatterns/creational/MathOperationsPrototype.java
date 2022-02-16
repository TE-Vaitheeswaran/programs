package com.te.designpatterns.creational;

public class MathOperationsPrototype {

	// step 1
	private MathOperationsPrototype() {
	}

	// step 2
	static MathOperationsPrototype mathOperations = null;

	public static MathOperationsPrototype getMathObejct() {

		return new MathOperationsPrototype();

	}

	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void substract(int a, int b) {
		System.out.println(a - b);
	}
}
