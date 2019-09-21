package com.dev.encapsulation;

public class StudentData {

	public static void main(String[] args) {
		Student s = new Student();
		s.setRegno(2019001);
		s.setName("Shreya");
		s.setEmail("shre3039@gmail.com");
		s.setPassword("1234");
		int regno = s.getRegno();
		System.out.println("Register Number "+regno);
		String name = s.getName();
		System.out.println("Name of student "+name);
		String email = s.getEmail();
		System.out.println("Email Id is "+email);
	}

}
