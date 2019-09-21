class Copy{

	public static int[] copy(int[] a)
	{

		int[] b = new int[a.length];
		for(int i=0;i<a.length;i++)

		{
			b[i] = a[i];
		}
		return b;
	}

	public static void main(String[] args) {
		int a[] =new int[] {10,20,30,40,50};
		 for (int i=0;i<a.length;i++) {
		 	System.out.println(a[i]);
		 }
		 int b[] = copy(a);

		 for (int j=0;j<b.length;j++ ) {
		 	System.out.println(j);
		 }

	}
}