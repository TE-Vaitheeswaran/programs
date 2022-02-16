
// 2) thread can be created by implenting Runnable

package com.te.demo.thread;

public class A implements Runnable {

	public void run() {

		System.out.println("Thread A starts");
		for (int i = 0; i < 20; i++) {
			System.out.println(i);
		}
		System.out.println("Thread A ends");
	}
}
