class Array2{
	public static void findmid(int[] array1)
	{
		 int mid;

       
       	mid =  (array1.length-1)/2;
       	int last = array1.length-1;
       	System.out.println("starting index is"+array1[0]);
     //  	System.out.println(array2[1]);
       //	System.out.println(array2[2]);
       	System.out.println("middle element of the "+array1[mid]);
       	System.out.println("last element of array id"+array1[last]);

      
	}
	public static void main(String[] args) {
		int[] array1 = new int[] {10,20,30,40};
		findmid(array1);
		
	}

}