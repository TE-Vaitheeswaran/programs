package com.te.designpatterninjava.singleton;

public class SingleTon {
	
	//step1: private constructor
	SingleTon() {
		
	}
	
	//step2:OBJECT
	 static SingleTon singleTon=null;
	 					
	//step3:method should be public static method and return type object

	 public static SingleTon getMeth() {
		if (singleTon==null) {
		 singleTon=new SingleTon();
		}
		return singleTon;
	}

}
