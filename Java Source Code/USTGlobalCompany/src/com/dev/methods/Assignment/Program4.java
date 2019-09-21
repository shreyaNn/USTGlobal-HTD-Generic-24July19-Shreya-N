class Program4{
  public static int[] fun(int[] a)
  {
  	int mid = (a.length-1)/2;
int[] b = new int[mid+1];  
for (int i=0;i<=mid;i++) {
	b[i] = a[i];
}
return b;

  }


	public static void main(String[] args) {
		
      int[]  a = new int[] {10,20,30,40,50};
      int[] b = fun(a);
      for (int i=0;i<a.length;i++) {
      	      System.out.println("before"+a[i]);
      }
      for (int j=0;j<b.length;j++) {
      	System.out.println("after"+b[j]);
      }

	}
}