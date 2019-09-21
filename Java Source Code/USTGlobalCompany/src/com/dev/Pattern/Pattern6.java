class Pattern6{
	public static void main(String[] args) {
		for(int i=1;i<=5;i++){

			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			
			System.out.println();
		}
					System.out.println();
			System.out.println();
			System.out.println();

		for(int i=1;i<=5;i++){

			for(int j=1;j<=5;j++){
				System.out.print(j);
			}
			
			System.out.println();
		}


System.out.println();
System.out.println();
System.out.println();


		for(int i=1;i<=5;i++){

			for(int j=i;j<=5;j++){
				System.out.print(j);
			}
			
			System.out.println();
		}
		System.out.println();
		System.out.println();
				for(int i=1;i<=5;i++){

			for(int j=5;j>=i;j--){
				System.out.print(j);
			}
			
			System.out.println();
		}


				System.out.println();
		System.out.println();
				for(int i=5;i>=1;i--){

			for(int j=i;j>=1;j--){
				System.out.print(j);
			}
			
			System.out.println();
		}

				System.out.println();
		System.out.println();
				for(int i=1;i<=5;i++){

			for(int j=5;j>=i;j--){
				System.out.print(j);
			}
			
			System.out.println();
		}


				System.out.println();
		System.out.println();
				for(int i=1;i<=5;i++){

			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			
			System.out.println();
		}


				System.out.println();
		System.out.println();
				for(int i=5;i>=1;i--){

			for(int j=i;j<=5;j++){
				System.out.print(j);
			}
			
			System.out.println();
		}

			System.out.println();
		System.out.println();
				for(int i=1;i<=5;i++){ 

			for(int j=i;j>=1;j--){
				System.out.print(j);
			}
			
			System.out.println();
		}



		System.out.println();
		System.out.println();
		int k = 0,j=0;
		for(int i=1;i<=4;i++){ 

			if(i%2!=0){

			for(j=k+1;j<=k+i;j++){
				//System.out.print(j+"*");
				System.out.print(j++);
			}
			k=j;
			System.out.println();
			
			}
			else
			k=k+i-1; 
				for (j=k;j>k-i+1;j-- ) {
					//System.out.print(j+"*");
					System.out.print(j);
				}
			System.out.println();
			}
			
	}
}