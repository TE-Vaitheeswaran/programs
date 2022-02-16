package com.te.designpatterninjava.singleton;

public class SingleTonTest {
	public static void main(String[] args) {
		
		
		

		SingleTon one = SingleTon.getMeth();
		System.out.println(one.hashCode());

		SingleTon two = SingleTon.getMeth();
		System.out.println(two.hashCode());
		
		SingleTon three = SingleTon.getMeth();
		System.out.println(three.hashCode());
	}

}
