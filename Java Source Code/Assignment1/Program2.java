class Program2{
	public static void main(String[] args) {
		int arr[] = {2,3,4,5,6,7,8};
		int mid,sl;
		mid = (arr.length-1)/2;
		sl = arr.length-2;
		System.out.println(" Sum is : "+(arr[0]+arr[mid]+arr[sl]));
	}
}