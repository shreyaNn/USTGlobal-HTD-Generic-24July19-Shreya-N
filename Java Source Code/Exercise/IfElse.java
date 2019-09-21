class IfElse{
	public static void main(String[] args) {
		int i=10,j=20;
		if(i%2==0)
			System.out.println("it is even");
		else
			System.out.println("it is odds");
		if(i<j)
		System.out.println("i is less than j");
	else
	{
		System.out.println("i greater than j");
		System.out.println("code outside else block");
	}
System.out.println("code outside of if and else block");	
	}
}
