package com.te.demo.classcastexception;

public class Test {

	public static void main(String[] args) {
		Demo ref=new Demo();
		
		Demo2 dem= (Demo2) ref;
	}
}
