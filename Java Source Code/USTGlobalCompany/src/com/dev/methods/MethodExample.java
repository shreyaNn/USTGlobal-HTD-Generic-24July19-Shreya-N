package com.dev.methods;

public class MethodExample {

	public static void main(String[] args) {
		int area = calcArea(6);
		int area1 = area(5,7);
		System.out.println("Area of Square ="+area);
		System.out.println();//write sout ctrl+space
		//ctrl+a + ctrl+i to arrange it properly
		System.out.println("Area of Rectangle ="+area1);

	}
	public static int calcArea(int side) {
		int area =  side*side;
		return area;
	}
	public static int area(int side1,int side2) {
		int area1 =  side1*side2;
		return area1;
	}
}
