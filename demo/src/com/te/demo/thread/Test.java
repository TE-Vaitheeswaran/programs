
// 1) thread object created by using thread class

package com.te.demo.thread;

public class Test {
 
	public static void main(String[] args) {
		
		
		
		
		System.out.println("main start");
		One one = new One();
		synchronized (one) {
			one.start();
		}
			
		
		
		Two two = new Two();
		synchronized (two) {
			two.start();
		}
			
		
		System.out.println("main ends");
		
		
	}
}
