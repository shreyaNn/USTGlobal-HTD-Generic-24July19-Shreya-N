class Array{
	public static void main(String[] args) {
		//int marks[] =new int[10]; //array declaration and creation
		
		/*marks[0] =  45;
				marks[1] =  47;
				marks[2] =  45;//array initialization
				marks[3] =  54;*/
				//int marks[] =new int[10];//array declaration
				int marks[] = {10,20,30,40,50};
				double sum =0.0, avg = 0.0;
				for(int index = 0;index<=3;index++){
					sum = sum + marks[index];
				}
				System.out.println(marks);// if we print array it will print address of the array

avg = sum/4;
System.out.println("sum is "+sum);
System.out.println("avg is "+avg);

}
}