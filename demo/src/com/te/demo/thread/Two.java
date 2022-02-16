
// 1) thread object created by using thead class
package com.te.demo.thread;

public class Two extends Thread{

	@Override
	public synchronized void run() {
		
		System.out.println("Thread two starts");
		for (int i = 0; i < 25; i++) {
			System.out.println(i);
		}
		System.out.println("Threadtwo end");
	}
	
}
