class Sum{
	public static void main(String[] args) {
		boolean res,res1;
		res= sum(10,20);
		 

		System.out.println(res);
         res1= sum(50,60);
		System.out.println(res1);
	}
	public static boolean sum(int a ,int b){
      if(a + b>50)
      {
      	return true;
      }
      else
      	return false;

	}
}