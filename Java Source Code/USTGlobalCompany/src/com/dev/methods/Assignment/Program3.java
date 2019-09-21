class Program3{
 public static int[] array(int[] a){
int[] b = new int[a.length-2];
     for(int i=1;i<=a.length-2;i++ ){
     	b[i-1] = a[i];
     }
return b;

 }



public static void main(String[] args) {
	int[] a = new int[] {20,30,40,50,60};
	int[] b = array(a);
	for (int i=0;i<b.length;i++) {
		System.out.println(b[i]);
	}

}
}