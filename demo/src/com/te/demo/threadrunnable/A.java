// 1) thread it will execute synchronized by using synchronized block

package com.te.demo.threadrunnable;

public class A {

	
	public void  name() {
   
		System.out.println("class A start");
			for (int i = 0; i < 20; i++) {
				System.out.println(i);
			
		}
			System.out.println("class A ends");
	}
}
