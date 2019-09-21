package com.dev.threads;

public class SyncMainThread {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("SyncMain Thread Started...");
		//Thread4 t =new Thread4();
		//t.start();
		Printer1 p = new Printer1();
		Printer p1 =new Printer();
		Thread4 t4 = new Thread4(p);
		

		t4.start();
		t4.join();
		//new Thread4(p).start();

		new Thread5(p).start();

		System.out.println("SyncMain Thread Terminated...");
	}

}
