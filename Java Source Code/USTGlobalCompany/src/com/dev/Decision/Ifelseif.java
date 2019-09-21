class Ifelseif{
	public static void main(String[] args) {
		int marks = -123;
           if(marks>=70 && marks <=100)
           {
           	System.out.println("FCD");
           }
           else if(marks>=60 && marks <=69){
           	System.out.println("First class");
           }
           else if(marks>=50 && marks <=59){
           	System.out.println("Second class");
           }
           else if(marks>=35 && marks <=49){
            System.out.println("pass");
           }


  
else if(marks>=0 && marks<=35)
	System.out.println("Fail");
//(marks>100 || marks< 0)
else
		System.out.println("Invalid number");
	}
}