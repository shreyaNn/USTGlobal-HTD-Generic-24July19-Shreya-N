public class ArithmeticOperator{
	public static void main(String[] args) {
		int a=10,b=20,c;
		c= a+b;
				System.out.println("value of c "+c);

		int m=10,n=20,d;
		d= m-n;
				System.out.println("value of d "+d);

		int o=10,p=20,e;
		e= o-p;
				System.out.println("value of e "+e);

		int q=10,r=20,f;
		f= q/r;
				System.out.println("value of f "+f);

		int s=10,t=20,g;
		g= s%t;
		System.out.println("value of g "+g);

		char h,w; int z;
		z='a'+'A';//A = 65, a = 97
		System.out.println("value of z" +z);


		for(int i=1;i<=3;i++){
			for(int j=2;j>=i;j--){
				System.out.print(" ");
			}
			for(int k =1;k<=i;k++){
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();
		for(int u=1;u<=5;u++){

			for(int y=5;y>=0;y--){
				System.out.print(y);
			}
			
			System.out.println();
		}

	}

	}
