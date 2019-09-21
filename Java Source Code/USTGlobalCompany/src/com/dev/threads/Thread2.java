package com.dev.threads;

public class Thread2 extends Thread {
	@Override
	public void run()
	{
	System.out.println("T2 extends thread started");
	for(int k=0;k<10;k++)
		System.out.println(k);
	System.out.println("T2 extends threads ended");
}
}
