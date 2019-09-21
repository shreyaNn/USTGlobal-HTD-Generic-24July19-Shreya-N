class Program2{

public static boolean func(int[] a){
if(a[0] ==a[a.length-1]){
	return true;
}
else{
	return false;
}
}

	public static void main(String[] args) {
		int[] a= {60,30,40,50,60};
		boolean res = func(a);
		for (int i=0;i<a.length;i++ ) {
			System.out.println("Before "+a[i]);	
		}
		for (int j=0;j<a.length;j++) {
System.out.println("after "+res);			
		}


	}
}