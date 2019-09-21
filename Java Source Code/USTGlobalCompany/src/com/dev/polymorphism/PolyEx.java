package com.dev.polymorphism;

class PolyEx {
	//Method Overloading
	public static int add(int i,int j) {
		return i+j;
	}
	public static int add(int i,int j,int k) {
		return i+j+k;
	}
	
	
		public static void main(String[] args) {
			int res1 = add(10,20);
			int res2 = add(30,40,50);
			System.out.println("res1 is"+res1);
			System.out.println("res2 is "+res2);
//			PolyEx obj1 = new PolyEx();
//			
//			PolyEx2 obj2 = new PolyEx2();
//			obj2.func(10);
//			
		}
		public void sample() {
			System.out.println("This is super class");
		}
		public void s(int i) {
			for(i=10;i>10;i--)
			{
				System.out.println("Descending"+i);
			}
		}
	}
	
