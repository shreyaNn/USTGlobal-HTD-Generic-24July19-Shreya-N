package com.dev.map;
import java.util.HashMap;


public class MainClass {

	public static void main(String[] args) {
		HashMap<String,Employee> hm = new HashMap<String,Employee>();
		Employee e = new Employee();
		e.setEmail("abc@gmail.com");//1) Inserts employee data
		e.setEmpid(101);
		e.setEname("Shreya");
		e.setSalary(400900);
		e.setPassword("23@abc");
		hm.put("1",e);
		Employee e1 = new Employee();

		e1.setEmail("bcd@gmail.com");//1) Inserts employee data
		e1.setEmpid(102);
		e1.setEname("Ram");
		e1.setSalary(300000);
		e1.setPassword("33@abc");
		hm.put("2",e1);
		System.out.println("The Details of Employees are: "+hm);
		//2) search employee data based on empid
		int employee = e.getEmpid();
     	System.out.println("Employee data searched is "+employee);
		System.out.println("The details of searched employees is "+e.toString());
		Employee r = hm.remove("2");//3) Remove Employee data 
		System.out.println("The deleted element is "+r);
		//4) Update Employee email address
		e.setEmail("opa@gmail.com");
		System.out.println("The updated Employee data is "+e);
		//5)total tax payable by employee

		System.out.println("hm"+hm.containsValue(e1));
		System.out.println("The tax got of employee is "+e.gettax());
		System.out.println("The tax got of employee is "+e1.gettax());
		System.out.println("the net pay of employees is "+e.getSalary()*12);
		System.out.println("Grade of employee 1 is "+e.getgrade());
		System.out.println("Grade of employee 2 is "+e1.getgrade());
	}

}
