package arrays;

public class Array {

	public static void main(String[] args) {
		int[] a;// Declaration
		char [] b;
		byte [] g;
		int[] arr =new int[10];// Creation
		char[] arr1 = new char[10];
		byte byteArr[] = new byte[10];
		arr[0] = 1;// Initialization
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
//		google.com
		arr1[0] = 'A';
		arr1[1] = 'B';
		arr1[2] = 'C';
		arr1[3] = 'D';
		byteArr[0] = 1;
		byteArr[1] = 2;
		byteArr[2] = 3;
		byteArr[3] = 4;
		int res = arr[1] * 3;
		int res1 = arr1[1] * 3;
		int res2 = byteArr[1] * 3;
		System.out.println(res);
		System.out.println(res1);
		System.out.println(res2);
		int[]  arr3 = {1,2,3,4,5,6,7,8};
		System.out.println(arr3[4]);
		for(int i =0;i<4;i++)
			System.out.print(arr[i]+" ");
		for(int i =0;i<4;i++)
			System.out.print(arr1[i]+" ");
		for(int i =0;i<4;i++)
			System.out.print(byteArr[i]+" ");
		System.out.println();
			System.out.println("length of the array is "+arr.length);
		

}
}
