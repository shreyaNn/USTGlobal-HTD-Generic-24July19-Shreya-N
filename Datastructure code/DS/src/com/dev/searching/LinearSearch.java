package com.dev.searching;
public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = {20,30,40,50};
		int value=70;

		boolean b = contains(arr,value);
		System.out.println("Result is  "+b);
	}
	public static boolean contains(int[] arr,int value) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==value)
				return true;
		}
		return false;

	}

}
