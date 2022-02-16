
//   can you careate static classand we can use instance members inside the static calss


package com.te.allstatecompany;

public class A {

	static class B{
		 public void display() {
			 System.out.println("hello world");
		 }
		
		 public static void main(String[] args) {
			
			
			 B b= new B();
			 b.display();
		}
	}
}
