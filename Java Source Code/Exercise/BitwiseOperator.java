class BitwiseOperator{
	public static void main(String[] args) {
		byte b = 2;
		byte c = 3;
		int d = b&c;
		int d1 = b|c;
		int g = 0010;//2
		int h = 0011;//3
		int res = g^h;
		int g1 = 0001;
		int h1 = 0101;
		int res1;
		res1 = g1^h1;
		System.out.println("Value of bitwise &"+d);
		System.out.println("Value of bitwise|"+d1);
		System.out.println("XOR"+res);
		System.out.println("XOR1 "+res1);

	}
}