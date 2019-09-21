class ArrayLength{


	public static void findavg(int[] marks){
        double sum = 0.0;
        double avg = 0.0;
           for (int index = 0;index<marks.length;index++ ) {
           	sum = sum+marks[index];
}
          avg = sum/marks.length;


System.out.println("ArrayLength is"+marks.length);
System.out.println("Sum is"+sum);
System.out.println("Average is"+avg);

}
	public static void main(String[] args) {
       int[] javamarks = {40,50,40,50};
            int[] sqlmarks = {35,67,50,69,45,78};

		findavg(javamarks);
		findavg(sqlmarks);
		
	}
}