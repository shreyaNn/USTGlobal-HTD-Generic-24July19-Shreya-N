class Program3{
	public static String fun(String str)
	{
		String res ="";

		for(int i=1;i<=str.length()-2;i++)
		{
			res = res + str.charAt(i);
		}
		return res;

	}
	public static void main(String[] args) {
		String str = "Jspiders";
		String b =fun(str);
		System.out.println("new string is"+b);

	}
}