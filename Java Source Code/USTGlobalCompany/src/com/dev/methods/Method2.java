class Method2{
	
	public static int findlargest(int n1,int n2)
	{
		  if(n1>n2){
		  	return n1;
		  }
		  else
		  	return n2;
	}
	public static void main(String[] args) {
      int large = findlargest(10,20);
      double res;
        res = large *200;

     System.out.println(res);
      int large1 = findlargest(200,25);
       res= large *12;//here the bussiness logic is different so there is no need of writing in a method

     System.out.println(res);
		
	}
}