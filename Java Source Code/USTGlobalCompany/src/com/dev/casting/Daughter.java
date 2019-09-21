package com.dev.casting;

public class Daughter extends GrandFather {
	static GrandFather d = new Daughter();
	static GrandFather d1 = new Daughter();
	static Daughter d2 = (Daughter) d1;
		void printname() {
			System.out.println("Downcasted");
		}
		public static void main(String[] args) {
			d2.printname();
		}
}
