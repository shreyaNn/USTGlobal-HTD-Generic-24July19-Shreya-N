package com.dev.PhoneSimulator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;


public class PhoneDS {
	static HashMap<String, Contact> hm = new HashMap<String, Contact>();

	static Scanner s = new Scanner(System.in);
public static void display1()
{
	Contact c = Contact.createObject();
	c.setName("Shreya");
	c.setNumber(9876564312l);
	c.setGroup("Sister");
	hm.put("1",c);
	Contact c1 = Contact.createObject();
	c1.setName("Shravya");
	c1.setNumber(8765123456l);
	c1.setGroup("Sister");
	hm.put("2", c1);
	Contact c2 = Contact.createObject();
	c2.setName("Satwik");
	c2.setNumber(7898947897l);
	c2.setGroup("Brother");
	hm.put("3", c2);
	System.out.println(hm);
}
	static public void addContacts() {
		
		System.out.println("Enter your  Name : ");
		String userName = s.next();
		System.out.println("Enter Number : ");
		long no = s.nextLong();
		System.out.println("Enter Group : ");
		String gp = s.next();
		Contact c4 = Contact.createObject();
		Inbox i = Inbox.createObj();

		c4.setName(userName);
		c4.setNumber(no);
		c4.setGroup(gp);
		c4.setUserid();
		c4.setI(i);

		hm.put(c4.getName(), c4);

		System.out.println("The data is : " + hm);
		PhoneData.display();

	}
	public static void showitems() {
		Iterator i  = hm.entrySet().iterator();
		while(i.hasNext()) {
	        Map.Entry mapElement = (Map.Entry)i.next(); 

			System.out.println(mapElement);
		}

	}

	 public static void compose(Contact a) {

		System.out.println("Enter the Name : ");
		String name = s.next();
		System.out.println("Enter the Message");
		String message = s.next();
		
		Contact c = hm.get(name);
		Inbox i = c.getI();
		i.setMessage(message);
		System.out.println("Message Sent successfully");

		PhoneData.display();
	}
	public static void call() {
		System.out.println("Call is Connecting");
		System.out.println("Press 1 to end the call");
		int n = s.nextInt();
		if(n==1)
		PhoneData.display();

	}
	public static void remove(String name) {
		Contact c =hm.remove(name);
		PhoneData.display();
		System.out.println(hm);
	}
	public static void update() {
		System.out.println("Enter name to update");
		String na = s.next();
		System.out.println("Enter Phone number");
		long nom= s.nextInt();
		System.out.println("Enter group");
		String gp = s.next();
		Contact c = Contact.createObject();
		c.setName(na);
		c.setNumber(nom);
		c.setGroup(gp);
		hm.get(na);
		hm.put(na,c);
		System.out.println(hm.put(na,c));
		
	}

	
}