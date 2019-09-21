class fun{
public static boolean supplier(int[] a)
{
if(a[a.length-1]==a[0])
{
return true;
}
else
{
return false;
} .
}
public static void main(String[] args)
{
	int[] a={1,2,3,1};
	boolean c = supplier(a);
	System.out.println(c);
}
}