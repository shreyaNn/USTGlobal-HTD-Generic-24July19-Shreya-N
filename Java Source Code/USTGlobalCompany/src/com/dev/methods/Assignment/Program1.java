class Program1{

public static int[] func1(int[] a){
	int[] b = new int[a.length];
	int j = b.length-1;

	for(int i=0;i<a.length;i++){
		b[i] = a[j];
		j--;
	}
	return b;
}


	public static void main(String[] args) {
		int[] a= new int[] {10,20,30,40,50};
	
		for (int i=0;i<a.length;i++ ) {
		System.out.println("The given array is"+a[i]);
		}
			int[] b= func1(a);
			for (int j=0;j<b.length;j++) {
		System.out.println("The reverse array is"+b[j]);
		}
	}
}