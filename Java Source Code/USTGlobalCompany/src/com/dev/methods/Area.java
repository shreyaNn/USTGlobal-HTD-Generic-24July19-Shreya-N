class Area{
	public static void main(String[] args) {
		area(10);
	}
	public static void area(int rad)
	{
		double area = 0.0;
		area = 3.14 * rad*rad;
		System.out.println("Area of Circle");
		System.out.println(area);
		return;
	}
}