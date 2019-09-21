package com.dev.collections;

import java.util.HashSet;



public class EmpDetails {

	public static void main(String[] args) {
		HashSet<Employee> h = new HashSet<Employee>();
		Employee e = new Employee();
		e.setEmail("Abc@gmail.com");
		e.setId("Abg");
		e.setPassword("Abc123");
	
		
	
		e.setName("Manu");
		boolean b = h.add(e);
		System.out.println("The details are: "+b);
		System.out.println(h);
		for(Employee e1 :h) {
			System.out.println(e1);
		}
		//foreach is used only for those collections which are inheriting from inheritable
		

	}

}
