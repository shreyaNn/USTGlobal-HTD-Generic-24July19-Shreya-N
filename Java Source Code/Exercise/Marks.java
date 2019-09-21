class Marks{
	public static void main(String[] args) {
		int marks =-112;
		if(marks>=91 && marks<=100)
			System.out.println("A Grade");
		else if(marks>=81 && marks<=90)
			System.out.println("B Grade");
		else if(marks>=71 && marks<=80)
			System.out.println("C Grade");
		else if (marks>=61 && marks<=70)
			System.out.println("D Grade");
		else if (marks>=51 && marks<=60)
			System.out.println("E Grade");
		else if (marks>=41 && marks<=50)
			System.out.println("RETEST");
		else if(marks>=0 && marks<=40)
			System.out.println("FAIL");
		else if(marks>100 ||marks<0)
			System.out.println("Marks is Invalid");
		
	}
}