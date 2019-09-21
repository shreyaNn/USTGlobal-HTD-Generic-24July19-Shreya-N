class Rectangle{
	public static void main(String[] args) {
		int l =20,b=20;int r = 30;int l1=10,b1=20;
		int area = rect(l,b);
		double area1 = cir(r);
		double area2 = triangle(l1,b1);
		double avg = avg(10,20,30);
		System.out.println("Area of Rectangle is"+area);
		System.out.println("Area of Circle is"+area1);
		System.out.println("Area of triangle is"+area2);
		System.out.println("Average is"+avg);

	}
	public static int rect(int l , int b){
		int area = l*b;
		return area;
	}
	public static double cir(int r){
		double area1 = 3.142*r*r;
		return area1;
	}
	public static double triangle(int l1,int b1){
		double area2 = 0.5*l1*b1;
		return area2;
	}
	public static double avg(int b1,int b2,int b3){
		double avg =(b1+b2+b3)/3 ;
		return avg;
	}
}