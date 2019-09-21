package com.dev.interfac;

public class E implements Abs {
	public void display() {
		System.out.println("Display method of interface");
	}
	
	public static void main(String[] args) {
		Abs.print();
		E e =  new E();
		e.display();
	}
}
