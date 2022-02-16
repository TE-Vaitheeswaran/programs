// 2) thread can be created by implenting Runnable

package com.te.demo.thread;

public class ABTest {

	public static void main(String[] args) {
		
		System.out.println("main starts");
		A a = new A();
		Thread th= new Thread(a);
		th.start();
		
		B b = new B();
		Thread thre= new Thread(b);
		thre.start();
		System.out.println("main ends");
	}
}
