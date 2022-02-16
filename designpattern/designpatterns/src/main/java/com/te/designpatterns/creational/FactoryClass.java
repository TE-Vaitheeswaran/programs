package com.te.designpatterns.creational;

public class FactoryClass {

	//	static method return type sould be interface
	public static Factory getFactoryObject(String type) {
		
		if (type.equalsIgnoreCase("sugar")) {
			return new SugarFactory();
		} else if (type.equalsIgnoreCase("alcohol")) {
			return new AlcoholFactory();
		} else {
			return null;
		}
	}
}
