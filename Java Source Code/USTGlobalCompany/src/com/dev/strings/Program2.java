class Program2{
	public static String copy(String str){
		String res = "";
		int mid = (str.length()-1)/2;
		for (int i=0;i<=mid;i++) {
			res = res + str.charAt(i);
			
		}
		return res;

	}
	public static void main(String[] args) {
		String str ="Jspiders";
		String s1 = copy(str);
		System.out.println("string copied is"+s1);

	}
}