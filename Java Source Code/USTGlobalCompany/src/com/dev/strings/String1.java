package com.dev.strings;

public class String1 {
	public static void main(String args[]) {
		String str1 = "UST gLOBAL";
//		int len = str1.length();
		System.out.println("Length of string1 is "+str1.length());
		String str2 = "UST GLOBAL";
		char[] c = str2.toCharArray();
		System.out.println("The Char at particular position is"+c[0]);
		char at =str1.charAt(4);
		System.out.println("Char AT is"+at);
		boolean b1 = str1.equals(str2);
		System.out.println("The equals() "+b1);
		boolean b2 = str2.equalsIgnoreCase(str1);
		System.out.println("The equalsIgnoreCase() "+b2);
		boolean b3 =str2.contains("G");
		System.out.println("Output for contains "+b3);
		
	}

}
