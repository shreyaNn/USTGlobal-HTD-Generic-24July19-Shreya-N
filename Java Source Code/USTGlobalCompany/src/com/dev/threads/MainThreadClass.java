package com.dev.threads;

public class MainThreadClass {
public static void main(String[] args) {
	System.out.println("Main thread started");
//	new T2().start();
	Thread2 t1 = new Thread2();
	t1.start();
//	new Thread(new T1()).start();
	Thread1 t = new Thread1();
	Thread t2 = new Thread(t);
	t2.start();
	Thread.currentThread().setName("Main Thread");
	
	for(int j=0;j<5;j++)
		System.out.println(j);
	System.out.println("Thread 1 "+t2.getName());
	System.out.println("Main Threadclass name"+Thread.currentThread().getName());
	System.out.println("Thread 1 id "+t2.getId());
	System.out.println("Thread 2 id "+t1.getId());
	System.out.println("Main Thread id "+Thread.currentThread().getId());
	System.out.println("Main thread ended");
}
}
