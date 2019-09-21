class CombinedOperator{
	public static void main(String[] args) {
		int a =140 ,b=50;
		//1)Arithmetic Operator
		//Program to find sum of two numbers
		int add = a+b;
		System.out.println("Arithmetic "+add);
		//2)Assignment Operator
		int d = a;//Assignment
		System.out.println("Value of assigned variable"+d);
		//3)Increment Operator
		int count,n=10;
					 count = n++;
	System.out.println("count (Increment)"+count);
	
		//4)Relational Operator
		//Program to find greatest of 2 numbers
		if(a>b){
			System.out.println("Relational Operator (greatest)"+a);
		}
		//5)Logical Operator
				boolean f,w1,w2;
				w2 = true;
				w1=false;
				f = w2 && w1;
		System.out.println("Logical"+f);
		int o =9,h=4,y;
		y = o&h;
		//6) Bitwise Operator
		System.out.println("Bitwise"+y);
	}
}