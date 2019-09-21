package com.dev.interfac;


@FunctionalInterface
public interface Int2 {
	public void func();
	static void print() {
		System.out.println("A");
	}
	static void print1() {
		System.out.println("B");
	}
}
