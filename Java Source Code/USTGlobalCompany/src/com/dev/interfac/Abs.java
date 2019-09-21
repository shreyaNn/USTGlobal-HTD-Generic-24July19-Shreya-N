package com.dev.interfac;

public interface Abs {
	void display();
	public static void print() {
		System.out.println("This is interface");
	}
	default void hello() {
		System.out.println("Hello everyone");
	}
	public static void hello1() {
		System.out.println("Hello everyone");
	}

}
