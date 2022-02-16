//step4
package com.te.designpatterninjava.factory;

public class FactClass {
	
	public static Factory get(String type) {
		
		if(type.equalsIgnoreCase("Bike")) {
			return new Bike();
		}else if(type.equalsIgnoreCase("Food")) {
			return new Food();
		}else {
			return null;
		}
	}

}
