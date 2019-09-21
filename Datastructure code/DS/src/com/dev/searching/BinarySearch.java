package com.dev.searching;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50,60};
		int res = binary(arr,60);
		System.out.println(res);
		int arr1[] = {10,20,30,40,50,60};
		int res1 = binary1(arr1,0,5,60);
		System.out.println(res1);

	}
	public static int binary(int[] arr,int key) {
		int start = 0;
		int end = arr.length-1;
		
		while(start<=end) {
			int mid =(start+end)/2;
			if(key==arr[mid]) {
				return mid;
			}
			else if(key<arr[mid]) {
				end = mid-1;
			}
			else {
				start = mid+1;
			}
		}
		return -1;
	}
	public static int binary1(int[] arr1,int low1,int high1,int data) {
		int mid1 = (low1+high1)/2;
		if(low1<=high1) {
			return mid1;
		}
		else if(arr1[mid1]<data) {
			return binary1(arr1,mid1+1,high1,data);
		}
		else {
			return binary1(arr1,low1,mid1-1,data);
		}
	}
}
