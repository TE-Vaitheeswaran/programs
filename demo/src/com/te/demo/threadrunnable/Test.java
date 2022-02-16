// 1) thread it will execute synchronized by using synchronized block
package com.te.demo.threadrunnable;

public class Test {
	public static void main(String[] args) {
		System.out.println("main starts");
		A a= new A();
		B b=new B();
		Runnable runnable=()->{
			synchronized (a) {
				a.name();
			}
		};
		
		
		
		Runnable runnable2=()->{
			synchronized (b) {
				b.display();
			}
		};
		Thread thread = new Thread(runnable);
		Thread thread1 = new Thread(runnable2);
		
		thread.start();
		thread1.start();
		System.out.println("main ends");
	}

}
