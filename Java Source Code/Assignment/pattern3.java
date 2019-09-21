class pattern3{
	public static void main(String[] args) {
		int value,diff, N=4;
		 for(int i=1; i<=N; i++)
    	{
        diff = N-1; // Initialize difference to total rows - 1
        value = i;  // Initialize value to the current row number
        for(int j=1; j<=i; j++)
        {
		System.out.print(value);
            value =value+ diff; // Computes the next value to be printed
            diff--;        // Decrements the difference
        }

	 System.out.println();    }
		// int x;int k=1;
		// for(int i=0;i<5;i++){
		// 	for(int j=0;j<i;j++){
		// 		System.out.print(k);
		// 		k++;
		// 	}
		// 	System.out.println();
		// }
	}
}
