class Pattern1{
	public static void main(String[] args) {
		int b = 1; int a1= 1,a2=0;
		for(int i=1;i<=3;i++){
			for(int j=1;j<=3;j++){
				++b;
                  if(b%2 == 0){
                  	System.out.print(a1+ " ");
                  }
                  else{
                  	System.out.print(a2 +" ");
                  }
			}
			System.out.println();
		}


System.out.println();
System.out.println();
int i,j;
		for(i=1;i<=3;i++){
			for(j=1;j<=3;j++){
                      if((i+j)%2== 0){
				System.out.print("1 ");
			}
			else
				System.out.print("0 ");
		}
			System.out.println();
		}
	}
}