//step5
package com.te.designpatterninjava.factory;

public class Test {

	public static void main(String[] args) {

		FactClass ref = new FactClass();
		Factory ref2 = FactClass.get("Bike");
		ref2.production();

		Factory ref3 = FactClass.get("Food");
		ref3.production();
	}
}
