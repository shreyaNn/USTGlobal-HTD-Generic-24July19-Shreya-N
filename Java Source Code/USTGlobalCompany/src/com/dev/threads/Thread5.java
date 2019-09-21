package com.dev.threads;

public class Thread5 extends Thread {
	Printer1 p;
	public Thread5(Printer1 pref) {
		p = pref;
	}
	@Override
	public void run() {
		p.printVal(10, "Thread 5");
	}

}
