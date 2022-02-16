package com.te.designpatterns;

import com.te.designpatterns.creational.MathOperationsPrototype;

public class PrototypeTest {

	public static void main(String[] args) {
		MathOperationsPrototype operations1 = MathOperationsPrototype.getMathObejct();
		System.out.println(" HashCode of op1 "+ operations1.hashCode());

		MathOperationsPrototype operations2 = MathOperationsPrototype.getMathObejct();
		System.out.println(" HashCode of op2 "+ operations2.hashCode());

		MathOperationsPrototype operations3 = MathOperationsPrototype.getMathObejct();
		System.out.println(" HashCode of op3 "+ operations3.hashCode());
	}
}
