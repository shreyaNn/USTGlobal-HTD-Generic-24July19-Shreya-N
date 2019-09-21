class Program1{
	public static boolean odd(String a)
	{
		int len = a.length();
		if(len%2==0)
		{
			return false;
		}
		else {
			return true;
		}

	}
	public static void main(String[] args) {
		String str1 = "Jspiders";
		boolean a = odd(str1);
		System.out.println(a);
	}
}