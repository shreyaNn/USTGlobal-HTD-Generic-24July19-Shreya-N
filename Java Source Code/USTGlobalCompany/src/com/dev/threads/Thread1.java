package com.dev.threads;

public class Thread1 implements Runnable {

	@Override
	public void run() {
		System.out.println("T1 Implements Thread started");
		for(int i=0;i<10;i++)
			System.out.println(i);
		System.out.println("T1 thread terminated");
	}
	
	
}
