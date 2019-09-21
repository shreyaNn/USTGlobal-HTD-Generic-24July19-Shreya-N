package com.dev.object;

public class ObjectMethods {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		Dog d3 = d1;
		Dog d4  = new Dog();
		System.out.println(d1.getClass());
		System.out.println(d2.getClass());
		System.out.println(d3.equals(d1));
		System.out.println(d3.equals(d4));
		System.out.println(d1.equals(d4));
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		System.out.println(d4.hashCode());
		try {
			int res = 10/0;
			System.out.println("no exception");
		}
		catch(Exception e) {
			System.err.print("Exception caught in catch block");
			System.err.println("getMessage()" +e.getMessage());
		}
	}

}
