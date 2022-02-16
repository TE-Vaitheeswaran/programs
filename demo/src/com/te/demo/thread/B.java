// 2) thread can be created by implenting Runnable

package com.te.demo.thread;

public class B implements Runnable{
	
	@Override
	public void run() {
		System.out.println("Thread B starts");
		for (int i = 0; i < 25; i++) {
			System.out.println(i);
		}
		System.out.println("Thread B end");
	}
		
	

}
