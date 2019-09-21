package com.dev.collections;

import java.util.HashSet;
import com.dev.encapsulation.Dog;
public class C1 {
	public static void main(String args[]) {
		HashSet<Dog> hs = new HashSet<Dog>();
		Dog d = new Dog();
		d.setAge(1);
		d.setBreed("DM");
	
		d.setColor("Black");
		Dog d1 = new Dog();
		d1.setAge(2);
		d1.setName("Ronnie");
		d1.setColor("Black and white");
		boolean b = hs.add(d);
		boolean b1 = hs.add(d1);

		System.out.print("Output of add() "+b+ ""+b1);
		System.out.println(hs);
		boolean b2 = hs.remove(d);
		System.out.println("output of remove()" + b2);
		System.out.println(hs);
		System.out.println("output of contains"+hs.contains(d));
		
		System.out.println("size of HashSet hs "+hs.size());
		hs.clear();
		System.out.println("After Clear "+hs.size());
		

	}

}
