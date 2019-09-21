package com.dev.abstraction;

public class D extends Abstraction {

	void fly() {
		System.out.println("Hello D");
	}
}
class Mainclass{
	public static void main(String[] args) {
		ConcChild obj = new ConcChild();
		obj.fly();
		obj.hello();
	}
}
