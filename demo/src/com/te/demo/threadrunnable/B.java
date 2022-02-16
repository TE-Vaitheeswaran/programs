// 1) thread it will execute synchronized by using synchronized block
package com.te.demo.threadrunnable;

public class B  {

	
	public void display() {
		
		  try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		System.out.println("class B start");
			for (int i = 0; i < 16; i++) {
				System.out.println(i);
			}
			System.out.println("class B ends");
	}
	

}
