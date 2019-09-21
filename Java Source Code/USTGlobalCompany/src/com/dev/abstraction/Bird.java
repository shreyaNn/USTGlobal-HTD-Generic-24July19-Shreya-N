package com.dev.abstraction;

public abstract  class Bird extends Animal {
	//child abstract class
	//Overriding Abstract method of Bird Class
	@Override
	void fly() {
		System.out.println("Birds Fly");
	}
	void dance() {
		System.out.println("hello");
		}
}
