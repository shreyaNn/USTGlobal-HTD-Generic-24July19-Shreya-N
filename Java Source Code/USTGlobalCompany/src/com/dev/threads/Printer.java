package com.dev.threads;

public class Printer {
	 public void printVal(int i,String thread) {
		for(int k=0;k<=10;k++) {
			System.out.println(" Thread: "+thread+ " "+"K = "+k);
		}
	}
}
