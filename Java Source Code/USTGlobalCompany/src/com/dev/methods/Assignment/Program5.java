class Program5{

	public static double avg(int[] a)
	{
	double avg=0.0;int c=0;int sum = 0;
	for(int i =0;i<a.length;i=i+2){
		sum= sum+a[i];
	         c++;

	}

avg=sum/c;
return avg;
	}
	public static void main(String[] args) {
		int[] a= {20,30,40,50};
		double b = avg(a);
   	                                                                                                                    

		System.out.println("average is" +b);

	}
}                                                                                                                                                                        