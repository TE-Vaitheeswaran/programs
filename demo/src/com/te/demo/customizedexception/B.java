package com.te.demo.customizedexception;

public class B   {

	public void display(int age) {
		if(age>18) {
			System.out.println("allowed for voting");
		}else {
			throw new A("not aloowed for voting");
			
		}
	}
}
