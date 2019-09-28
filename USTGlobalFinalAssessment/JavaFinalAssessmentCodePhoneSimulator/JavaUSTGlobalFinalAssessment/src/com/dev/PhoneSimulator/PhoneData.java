package com.dev.PhoneSimulator;

import java.util.Scanner;



public class PhoneData {
static Scanner s = new Scanner(System.in);
	
	static public void enterValueProcess(int value) {
		if(value==1)
		{
			PhoneDS.display1();
			display();
		}
		else if(value==2) {

			System.out.println("Enter name to Search");
			String name1 =s.next();
			Contact c = Contact.createObject();
			PhoneData.entry2(c);	
			
		}
		
		else if(value == 3) {

			entry3(null);
			
		}
		}

	
	public static void entry2(Contact c) {
		System.out.println("Press 1 to Call");
		System.out.println("Press 2 to message");
		System.out.println("Press 3 to go back to Main Menu");
		int n =s.nextInt();
		if(n==1)
		{
			PhoneDS.call();
		}
		else if(n==2) {
			PhoneDS.compose(c);
		}
		else if(n==3) {
			display();
		}
	}
	
	public static void entry3(Contact c) {
		System.out.println("Press 1 to add Contact");
		System.out.println("Press 2 to delete Contact");
		System.out.println("Press 3 to Edit Contact");
		int n1 =s.nextInt();
		if(n1==1) {
			PhoneDS.addContacts();
			display();
		}
		else if(n1==2) {
			System.out.println("Enter the name to delete");
			String name =s.next();
			PhoneDS.remove(name);
			
		}
		else if(n1==3) {
			PhoneDS.update();
			display();
		}
	}
	
	static public void display() {
		System.out.println("Press 1 to Show All Contacts");
		System.out.println("Press 2 to Search for Contact");
		System.out.println("Press 3 to Operate on Contact");
		int enterValue = s.nextInt();
		enterValueProcess(enterValue);
	}


	public static void main(String[] args) {
		
		display();
		
		
	}
}
