package com.dev.lamdaexp;

public class Test {

	public static void main(String[] args) {
		FuncInter f = () -> {
			for(int i=1;i<=10;i++) {
				System.out.println(i);
				
			}
		};
		FuncInter f1 = () -> System.out.println("This is Lamda Expression");
			FuncInter f2 = () -> {
			try {
				int a=10/0;
				}
			catch(Exception e) {
				System.out.println("Exception Occured"+e);
			}
			};
			FuncInter2 f3 = (int i) -> {
				for(int j=1;j<=i;j++) {
					System.out.println(j);
				}
			};
			f.printval();
			f1.printval();
			f2.printval();

			f3.printval(5);
		
	}

}
