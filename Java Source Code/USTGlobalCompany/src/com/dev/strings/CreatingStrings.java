package com.dev.strings;

public class CreatingStrings {

	public static void main(String[] args) {
		String str;
		str = "Hello";
		System.out.println(str);
		String str1 = "Java";
		System.out.println(str1);

		String str2 = new String("Hello Java");
		System.out.println(str2);
		String str3 = "Some String";
		String str4 = "Some string";
		int len =str3.length();
		System.out.println("Length of String length() "+len);
		
		char[] ch = str3.toCharArray();
		System.out.println("tocharArray() "+ch[10]);
		System.out.println(ch.length);
		System.out.println("CharAt() "+ch[0]);
		
		boolean b = str3.equals("equals() "+str4);
		System.out.println(b);
		boolean b1 = str3.equalsIgnoreCase(str4);
		System.out.println("equalsIgnoreCase() "+b1);
		
		String str5 = "UST gLOBAL";

		boolean b3 =str5.contains("G");
		System.out.println("Output for contains "+b3);
		String g = str5.replace('g', 'G');
		System.out.println("replace() "+g);
		
		int g1 = str5.indexOf('S');
		System.out.println("indexOf() "+g1);
		
		String a = str.toUpperCase();
		System.out.println("toUpperCase() "+a);
		
		String a1 = str.toLowerCase();
		System.out.println("toLowerCase() "+a1);
		
		
		
	}

}
