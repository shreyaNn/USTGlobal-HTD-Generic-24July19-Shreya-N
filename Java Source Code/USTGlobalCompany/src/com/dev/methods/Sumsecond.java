class Sumsecond{
public static void sum(int[] array){
	int mid;
	mid = (array.length-1)/2;
	int sum1 = array[1]+array[mid]+array[array.length-2];
	System.out.println("sum is" +sum1);
	System.out.println("second last element is"+array[array.length-2]);

}

public static void main(String[] args) {
	int[] array = new int[] {10,20,30,40,50};
	sum(array);
		System.out.println();
	}




}