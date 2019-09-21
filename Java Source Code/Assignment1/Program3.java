class Program3{
	public static void main(String[] args) {
  		String input = "SHREYA"; 
  
       
        // char[] try1 = input.toCharArray(); 
  
        // for (int i = try1.length-1; i>=0; i--) 
        //     System.out.print(try1[i]); 
        int len = input.length()-1;
        for(int i=len-1;i>=0;i--)
        	System.out.println("array is "+input.charAt(i));
	}
		}