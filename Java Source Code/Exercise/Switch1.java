class Switch1{
	public static void main(String[] args) {
		int dayNum = 8;
		switch(dayNum)
		{
			case 1: 
			case 2:
			case 3:
			case 4:
			case 5:
			System.out.println("Week Days");
			break;
			case 6:
			case 7:	
			System.out.println("WeekEnds");
			break;
			default:
			System.out.println("Invalid dayNum");
			break;
		}
	}
}