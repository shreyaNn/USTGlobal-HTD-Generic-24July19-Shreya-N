class Program6{

public static boolean test(int[] ar1){
	int x=0;//integer or boolean which ever it may be
	for (int i=0;i<a.length;i++) {
		if (a[i]%2==0) {
			x++
		}
	}
	if(x>0)
	{
		return false;

	}
	else 
	{
		return true;
	}
}

	public static void main(String[] args) {
		
int[] a = new int[] {10,20,30};
boolean[] b =test(a);
System.out.println(b);

	}
}