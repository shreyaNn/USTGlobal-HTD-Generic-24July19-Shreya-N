package com.dev.polymorphism;

public class PolyEx2 extends PolyEx {
	@Override
	public void sample() {
		System.out.println("This is method overriding");
	}
	public void s(int i) {
		for(i=0;i<10;i++)
		{
			System.out.println("Ascending"+i);
		}
	}
	
	public static void main(String[] args) {
		PolyEx2 b = new PolyEx2();
		PolyEx obj1 = new PolyEx();

		b.sample();
		b.s(0);
		obj1.s(0);
	}

}
