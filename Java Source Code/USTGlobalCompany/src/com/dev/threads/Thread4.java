package com.dev.threads;

public class Thread4 extends Thread {
	Printer1 p;
	public Thread4(Printer1 pref) {
		p = pref;
	}
	
	@Override
	public void run() {
		try {
			Thread.currentThread();
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		p.printVal(10, "Thread 4");
		System.out.println("*************************");


	}

}
