import java.util.*;
class AreaSqr{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter side of square");
		int n = s.nextInt();
 		int area = calcArea(n);
 		System.out.println("area of square "+area);
	}
		public static int calcArea(int l){
			 int area; 	
			area = l*l;
			return area;
		}
		
}