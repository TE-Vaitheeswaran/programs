
// 1) thread object created by using thead class

package com.te.demo.thread;

public class One extends Thread{

	
	@Override
	public  void run() {

			System.out.println("Thread one starts");
			
			for (int i = 0; i < 20; i++) {
				System.out.println(i);
			}
			System.out.println("Thread one ends");
		}
		

		
}
