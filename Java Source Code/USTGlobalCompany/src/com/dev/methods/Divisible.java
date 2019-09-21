
/*
params: int int int
return :int
*/

class Divisible{
   public static int divisible(int a,int b, int c)
   {
   	if(a%5==0 &&b%5==0 && c%5 ==0){
   		return 5;
   	}
   	else
   		return 0;
   }


	public static void main(String[] args) {
		int res = divisible(10,20,30);
		System.out.println(res);
	}
}